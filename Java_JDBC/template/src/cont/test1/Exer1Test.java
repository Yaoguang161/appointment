package cont.test1;

import cont.crud.User;
import cont.help.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

/**
 * @className exer.java
 * @description: 这是作业练习
 * @author: Asaki
 * @createDate: 2021/10/13 21:55
 */

public class Exer1Test {
    @Test
    public void testLogin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入用户名: ");
        String user = scanner.nextLine();
        System.out.println("请输入密码:  ");
        String password = scanner.nextLine();
        //简单的SQL注入
        //select user,password from user_table where user = '1' or ' and password = ' =1 or '1' = '1'
        String sql = "select user,password from user_table where user = ? and password = ? ";
        User returnUser = getInstance(User.class,sql,user,password);
        if(returnUser != null){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名不存在或密码错误");
        }
    }


    public <T> T getInstance(Class<T> clazz,String sql,Object ...args){
        /**
         * @title getInstance
         * @description  针对于不同表的通用查询操作,返回表中的一条记录
         * @author Asaki
         * @param: clazz
         * @param: sql
         * @param: args
         * @updateTime 2021/10/11 21:47
         * @return: T
         * @throws
         */
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
                T t = clazz.newInstance();
                for(int i  = 0;i <columnCount; i ++){
                    // 获取每个列的列值:通过ResultSet
                    Object columnValue = rs.getObject(i + 1);
                    // 通过ResultSetMetaDate
                    //获取每个列的列名: getColumnName
                    //获取每个列的别名: getColumnLabel()
//                    String columnName =  rsmd.getColumnName(i + 1 );
                    String columnLabel =  rsmd.getColumnLabel(i + 1 );
                    //通过反射,将对象指定名columnName的属性赋值为执行的值columnValue
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t,columnValue);
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResourse(conn,ps,rs);
        }
        return null;
    }
}
