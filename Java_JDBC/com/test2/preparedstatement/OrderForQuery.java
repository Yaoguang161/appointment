package com.test2.preparedstatement;

import com.help.util.JDBCUtils;
import com.test2.bean.Order;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @className OrderForQuery.java
 * @description:
 * @author: Asaki
 * @createDate: 2021/10/10 21:19
 */

public class OrderForQuery {

    /*针对于表的字段名于类的属性不相同的情况:
    * 1.必须声明sql时,使用类的属性名来命名字段的别名
    * 2.使用rsultSetMetaDate时,需要使用getColumnLable()来替换getColumnName,
    *     获取列别名
    *
    * 说明:如果sql中没有给字段起别名,getColumnLabel()获取的就是列名*/


    @Test
    public void testOrderForQuery(){
        String sql = "select order_id orderId,order_name orderName,order_date orderDate from `order` where order_id = ?;";
        Order order = orderForQuery(sql, 1);
        System.out.println(order);


    }


    /**
     * @title orderForQuery
     * @description 通用的针对于order表的查询操作
     * @author Asaki
     * @param: sql
     * @param: args
     * @updateTime 2021/10/10 22:01
     * @return: com.test2.bean.Order
     * @throws
     */

    public Order orderForQuery(String sql,Object ...args){
        Connection conn  = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for(int i = 0 ; i < args.length; i ++){
                ps.setObject(i + 1, args[i]);
            }
            //执行,获取结果集
            rs = ps.executeQuery();
            //获取结果集的元数据
            ResultSetMetaData rsmd = rs.getMetaData();
            //获取列数
            int columnCount = rsmd.getColumnCount();
            if(rs.next()){
                Order order = new Order();
                for(int i  = 0;i <columnCount; i ++){
                    // 获取每个列的列值:通过ResultSet
                    Object columnValue = rs.getObject(i + 1);
                    // 通过ResultSetMetaDate
                    //获取每个列的列名: getColumnName
                    //获取每个列的别名: getColumnLabel()
//                    String columnName =  rsmd.getColumnName(i + 1 );
                    String columnLabel =  rsmd.getColumnLabel(i + 1 );
                    //通过反射,将对象指定名columnName的属性赋值为执行的值columnValue
                    Field field = Order.class.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(order,columnValue);
                }
                return order;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            JDBCUtils.closeResourse(conn,ps,rs);
        }
        return null;
    }


    @Test
    public void testQuery1() {
        Connection conn = null;
        PreparedStatement ps = null; //赋值防止sql注入
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select order_id,order_name,order_date from `order` where order_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1,1);

            ps.execute();

            rs = ps.executeQuery();
            if(rs.next()){
                int id = (int)rs.getObject(1);
                String name =(String) rs.getObject(2);
                Date date =(Date) rs.getObject(3);


                Order order = new Order(id, name, date);
                System.out.println(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.closeResourse(conn,ps,rs);
        }
    }
}
