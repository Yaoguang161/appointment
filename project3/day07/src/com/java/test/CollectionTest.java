package com.java.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Enzo Cotter on 2021/9/13.
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(Object e)
        coll.add("AA");
        coll.add("BB");
        coll.add(123); //自动装箱
        coll.add(new Date());

        //获取元素个数
        System.out.println(coll.size());//4


        //addAll(Collection coll1): 将coll1集合中的元素添加到当前的集合中
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);

        System.out.println(coll.size()); //6
        System.out.println(coll);

        //claer: 清空集合元素
        coll.clear();

        //isEmpty(): 判断当前集合是否为空
        System.out.println(coll.isEmpty());


    }

}
