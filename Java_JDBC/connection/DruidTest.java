package com.connection;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.crypto.spec.PSource;
import javax.sql.DataSource;
import java.io.InputStream;
import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.util.Properties;

/**
 * @className DruidTest.java
 * @description: Druid数据库连接池技术
 * @author: Asaki
 * @createDate: 2021/10/23 12:50
 */

public class DruidTest {

    @Test
    public void getConnection() throws Exception {
        Properties pros =  new Properties();

        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        pros.load(is);

        DataSource source = DruidDataSourceFactory.createDataSource(pros);
        Connection conn = source.getConnection();
        System.out.println(conn);

    }
}
