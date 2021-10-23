package com.connection;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @className JDBCUtils.java
 * @description:
 * @author: Asaki
 * @createDate: 2021/10/23 13:32
 */

public class JDBCUtils {


    //使用Druid数据库连接池技术
    private static DataSource source1;
    static {
        try {
            Properties pros = new Properties();

            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
            pros.load(is);

            source1 = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection3() throws SQLException {

        Connection conn = source1.getConnection();
        return conn;
    }




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