package com.collection.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Enzo Cotter on 2021/9/13.
 */


//jdk  新增了foreach循环,用来遍历集合
public class ForTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();  //有序的
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);


        //for(集合元素的类型 局部变量 :集合对象)
        for(Object obj : coll){
            System.out.println(obj);
        }
    }
}
