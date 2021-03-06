package com.test2.preparedstatement;

import com.help.util.JDBCUtils;
import com.test2.bean.Customer;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @className CustomerForQuery.java
 * @description: 针对Customer表的查询
 * @author: Asaki
 * @createDate: 2021/10/10 11:51
 */

public class CustomerForQuery {

 /**
 * @title testQueryForCustomers
 * @description 针对于customers 表的通用查询操作
 * @author Asaki
 * @updateTime 2021/10/10 20:26
 * @throws  Exception
 */
    @Test
    public void testQueryForCustomers(){

        String sql = "select id,name,birth,email from customers where id = ?";
        Customer customer = queryForCustomers(sql,13);
        System.out.println(customer);

        sql = "select name,email from customers where name = ?";
        Customer customer1 = queryForCustomers(sql,"周杰伦");
        System.out.println(customer1);

    }

    /**
     * @title test
     * @description
     * @author Asaki
     * @updateTime 2021/10/10 18:54
     * @throws
     */
    public Customer queryForCustomers(String sql, Object ...args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            ps = conn.prepareStatement(sql);
            for(int i = 0;i < args.length; i++){
                ps.setObject(i+1,args[i]);
            }

            rs = ps.executeQuery();
            //获取结果集的元数据:ResultSetMetaData
            ResultSetMetaData rsmd = rs.getMetaData();
            //通过ResultSetmetaDate获取结果集中的列数
            int columnCount = rsmd.getColumnCount();

            if(rs.next()){
                Customer cust = new Customer();
                //处理结果集每一行数据中的每一个列
                for(int  i = 0; i <columnCount; i ++){
                    Object columValue = rs.getObject(i +1);

                    //获取每个列的列名
                    String columnName = rsmd.getColumnName(i +1);

                    //给cust对象指定的columnName属性,赋值为columValue;通过反射
                    Field field = Customer.class.getDeclaredField(columnName);
                    Customer.class.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(cust,columValue);
                }
                return cust;
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
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select id,name,email,birth from customers where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1,1);

            //执行 , 并返回结果集
            resultSet = ps.executeQuery();

            //处理结果集
            if(resultSet.next()){//判断结果集的下一条是否有数据,如果有返回true,并指针下移,如果返回false,指针不下移,直接结束

                //获取当前这条数据的各个字段值
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                Date birth = resultSet.getDate(4);


                //方式一:
    //            System.out.println("id = "+ id + ",name = " + name + ",email = " + email + ",birht = " + email);


                //方式二:
    //            Object[] date = new Object[]{id,name,email,birth};


                //方式三:
                Customer customer = new Customer(id,name,email,birth);
                System.out.println(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.closeResourse(conn,ps,resultSet);
        }


    }


}
