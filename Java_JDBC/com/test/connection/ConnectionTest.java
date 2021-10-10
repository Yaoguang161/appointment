package com.test.connection;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import jdk.jfr.StackTrace;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Enzo Cotter on 2021/10/8.
 */
public class ConnectionTest {
    //方式一:
    @Test
    public void testConnection1() throws SQLException {
        //获取Driver的实现类对象
        Driver driver = new com.mysql.cj.jdbc.Driver();
        //URL: http
        //jdbc:mysql:协议
        //locasthost:ip地址
        //3306端口号
        //test:test数据库

        String url = "jdbc:mysql://localhost:3306/test";

        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","Abc1813143977");

        Connection conn = driver.connect(url, info);
        System.out.println(conn);

    }
    //方式二: 对方式一的迭代: 在如下的程序中不出现第三方的API,使得程序具有更好的移植性.
    @Test
    public void testConnection2() throws Exception {
        //1.获取Driver实现类的对象: 使用反射
        Class clazz =  Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)  clazz.newInstance();

        //2.提供要连接的数据库
        String  url = "jdbc:mysql://localhost:3306/test";

        //3.提供连接需要的用户名和密码
        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","Abc1813143977");


        //4.获取连接
        Connection conn = driver.connect(url, info);
        System.out.println(conn);
    }
    //方式三:  使用DriverManager替换Driver
    @Test
    public void testConnection3() throws Exception {
        //1.获取Driver实现类的对象
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        //2.提供另外三个连接的基本信息
        String url ="jdbc:mysql://localhost:3306/test " ;
        String user= "root";
        String password = "Abc1813143977";

        //注册驱动
        DriverManager.registerDriver(driver);

       //获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);


    }
    //方式四:  可以只是加载驱动,不用显示的注册驱动了.
    @Test
    public void testConnection4() throws Exception {
        //1.提供另外三个连接的基本信息
        String url ="jdbc:mysql://localhost:3306/test " ;
        String user= "root";
        String password = "Abc1813143977";

        //2.获取Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //相较于方式三,可以省略如下的操作:
//        Driver driver = (Driver) clazz.newInstance();
//        //注册驱动
//        DriverManager.registerDriver(driver);

        //为什么可以省略掉如下的操作呢?
        //在MySQL的Driver实现类中,声明了如下的操作:
/*        static{
            try{
                java.sql.DriverManager.registerDriver(new Driver());
            }catch(SQLException E){
                throw new RuntimeException("Can't register driver!");
            }
        }*/

        //3.获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);

    }


    //方式五(final版): 将数据库连接需要的4个基本数据声明在配置文件中,通过读取配置文件的方式,获取连接
    /*
    * 此种方式的好处?
    * 1.实现类代码与数据的分离.实现了解耦
    * 2.如果需要修改文件程序,可以避免程序重新打包
    *
    * */
    @Test
    public void getConnection5() throws Exception {
        //1.读取文件中的四个基本文件信息
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

        Properties pros = new Properties();
        pros.load(is);

        String user =pros.getProperty("user");
        String password =pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        //2.加载驱动
        Class.forName(driverClass);

        //3. 获取连接
        Connection conn  = DriverManager.getConnection(url,user,password);
        System.out.println(conn);
    }
}














