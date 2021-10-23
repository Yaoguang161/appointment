package com.dbutils;


import org.apache.commons.dbutils.QueryRunner;
import com.connection.*;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @className QueryRunerTest.java
 * @description:
 * @author: Asaki
 * @createDate: 2021/10/23 14:55
 */
/*
* commons-dbutils 是 Apache 组织提供的一个开源JDBC工具类库,封装了针对于数据库的增删改查操作
* */
public class QueryRunerTest {


    @Test
    public void testInsert() throws SQLException {
        Connection conn  = null;
        try {
            QueryRunner runner =new QueryRunner();
            conn = JDBCUtils.getConnection3();

            String sql = "insert into customers(name,email,birth)values(?,?,?)";
            int insertCount = runner.update(conn,sql,"蔡徐坤","caixukun@126.com","1997-09-08");
            System.out.println("添加了" + insertCount + "条记录");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResourse(conn,null);
        }
    }




}
