package com.java;

import org.junit.Test;

/**
 * Created by Enzo Cotter on 2021/9/5.
 */
//String   声明为final 的,不可被继承
//String 实现了Serializable接口: 表示字符串是支持序列化的.
public class StringTest {
    @Test
    public void test1(){
        String s1 = "abc";  //字面量的定义方法
        String s2 = "abc";
        s1 =  "hello";

        System.out.println(s1); //hello
        System.out.println(s2); //abc
    }
    public void test2(){
        //通过字面量定义的方式: 此时的s1 和 s2 的数据javaEE声明在方法区的字符串常量池种
        String s1 = "javaEE";
        String s2 = "javaEE";

        //通过new + 构造器的方式: 此时的s3 和s4 保存的地址值 , 是数据在堆空间开辟空间以后的对应的地址值
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");
    }
    public void test3(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "hello" + "world";
        String s4 = s1 + "world" ;
        String s5 = s1 + s2;
        String s6 = (s1 + s2 ).intern();
        System.out.println(s3 == s4); //false
        System.out.println(s3 == s5);//fasle
        System.out.println(s4 == s5); //false
        System.out.println(s3 == s6);//true
    }
}
