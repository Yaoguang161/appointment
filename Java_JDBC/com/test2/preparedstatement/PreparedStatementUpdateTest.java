package com.test2.preparedstatement;

import com.help.util.JDBCUtils;
import com.test.connection.ConnectionTest;
import org.junit.Test;
import org.junit.runner.manipulation.Orderable;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * Created by Enzo Cotter on 2021/10/9.
 */

/*使用PreparedSta来替换Statement,实现对数据表的增删改查操作
*
*
* 增删改;查
* */
public class PreparedStatementUpdateTest {

    @Test
    public void testCommonUpdate(){
//        String sql = "delete from customers where id = ?";
//        update(sql,3);

        String sql  = "update  `order` set order_name =  ? where order_id = ? ";
        update(sql,"DD","2");
    }


    //通用的增删改操作
    public void update(String sql, Object  ...args) { //sql中占位符与可变形参的长度
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //1.获取数据库的连接
            conn = JDBCUtils.getConnection();
            //.2.预编译SQL语句,返回PreparedStatement
            ps = conn.prepareStatement(sql);
            //3.填充占位符
            for(int i = 0;i < args.length; i++){
                ps.setObject(i+1,args[i]); // 小心参数声明错误 !!!
            }
            //4.执行
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.资源的关闭
            JDBCUtils.closeResourse(conn,ps);
        }


    }







    //修改custormers的表的一条记录
    @Test
    public void testUpdate() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //1.获取数据库的连接
            conn = JDBCUtils.getConnection();
            //.2.预编译SQL语句,返回PreparedStatement
            String sql = "update customers set name = ? where id = ?";
            ps = conn.prepareStatement(sql);
            //3.填充占位符
            ps.setObject(1,"莫扎特");
            ps.setObject(2,18);
            //4.执行
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.资源的关闭
            JDBCUtils.closeResourse(conn, ps);
        }
    }





    //向customers表中添加一条记录
    @Test
    public  void testInsert() {
        Connection conn  = null;
        PreparedStatement ps = null;
        try {
            //1.读取文件中的四个基本文件信息
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

            Properties pros = new Properties();
            pros.load(is);

            String user =pros.getProperty("user");
            String password =pros.getProperty("password");
            String url = pros.getProperty("url");
            String driverClass = pros.getProperty("driverClass");

            //2.加载驱动
            Class.forName(driverClass);

            //3. 获取连接
            conn = DriverManager.getConnection(url,user,password);
            System.out.println(conn);

            //4.预编译sql语句返回PreparedStatement的实例
            String sql = "insert into customers(name,email,birth)values(?,?,?)";//?:占位符
            ps = conn.prepareStatement(sql);

            //5.填充占位符
            ps.setString(1,"哪吒");
            ps.setString(2,"nezha@gmail.com");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = sdf.parse("1000-01-01");
            ps.setDate(3,  new Date(date.getTime()));

            //6.执行操作
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //7.资源关闭
            try {
                if(ps != null){
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
