package com.test;

import org.junit.Test;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Enzo Cotter on 2021/9/7.
 */


/*
* SimpleDateFormat的使用: SimpleDateFormat对日期Date类的格式话和解析
*
* 1. 两个操作
* 1.1 格式化 : 日期 --> 字符串
* 1.2 解析 : 格式化的逆过程  ,字符串 ---> 日期
*
* 2. SimpleDateFormate的实例化
*
* */
public class DateTimeTest {


    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化 SimpleDateFormat :使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化 : 日期 --> 字符串
        Date date  = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        //解析 :格式话的逆过程 , 字符串 --> 日期
        String str = "2021/10/7 下午9:42";
        Date date1 = sdf.parse(str);
        System.out.println(date1);



        //*******按照指定格式进行格式化*********
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1 .format(date);
        System.out.println(format1); //2019 - 02 -18 11:48:27

    }


}










