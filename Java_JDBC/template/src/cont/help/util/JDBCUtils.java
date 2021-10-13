package cont.help.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
//操作数据库的工具类


public class JDBCUtils {
    /**
     * @title getConnection
     * @description 数据库的连接
     * @author Asaki
     * @updateTime 2021/10/10 10:02
     * @return: java.sql.Connection
     * @throws
     */
    /*获取数据库的连接*/
    public static Connection getConnection() throws Exception{


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
        Connection conn = DriverManager.getConnection(url,user,password);
        return conn;
    }

    /**
     * @title closeResourse
     * @description 数据库的关闭
     * @author Asaki
     * @param: conn
     * @param: ps
     * @updateTime 2021/10/10 10:02
     * @throws
     */
    public static void closeResourse(Connection conn, Statement ps){


        //资源关闭
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

    public static void closeResourse(Connection conn, Statement ps, ResultSet rs){
        /**
         * @title closeResourse
         * @description  关闭资源的操作
         * @author Asaki
         * @param: conn
         * @param: ps
         * @param: rs
         * @updateTime 2021/10/10 12:33
         * @throws
         */

        //资源关闭
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
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
