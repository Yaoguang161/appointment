package com.java;

import org.junit.Test;

/**
 * Created by Enzo Cotter on 2021/9/6.
 */
/*
* 关于StringBuffer和StringBuildre的使用
*
*
* String , StringBuffer , StringBuilder 三者的异同?
* String: 不可变的字符序列 ; 底层结构是用char[] 来存储
* StringBuffer: 可变的字符序列;线程安全的,效率低, 底层结构是用char[] 来存储
* StringBuilder: 可变的字符序列;  线程不安全,效率高,新增的,底层结构是用char[] 来存储
*
*
* 源码分析:
*           String str = new String();
*           Stirng str1 = new String("abc"); ;;new char[]{'a','b','c'};
*           StringBuffer sb1 = new StringBuffer(); //new char[16];底层创建了一个长度为16的数组
*           sb1.append('a'); //value[0] = 'a';
*           sb1.append('b'); //value[1] = 'b';
*
*           StringBuffer sb2 = new StringBuffer("abc"); // char[] value = new char["abc".length() + 16];
*
*           //问题1 .System.out.println(sb1.length()); //3
*           //问题2 . 扩容问题: 如果要添加的数据底层数组盛不下,那就需要扩容底层的数组
*            默认情况下,扩容为原来容量的2倍  + 2,同时将原来的数组中的元素复制到新的数组中.
*
*
*             指导意义: 开发中建议大家使用: StringBuffer(int capacity) 或 StringBuilder(int capacity)
*
* */
public class StringBUfferBuilderTest {
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);
    }
}
