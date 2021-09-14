package com.collection.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Enzo Cotter on 2021/9/13.
 */

//集合元素的遍历操作,使用迭代器Interator接口
//1.内部的方法 hasNext() 和next()
//2. 集合对象每次调用iterator() 方法都会得到一个全新的迭代器对象, 默认游标都在集合的第一个元素之前
//3. 内部定义了remove(),可以在遍历的时候,删除集合中的元素,此方法不同于集合直接对用remove();





public class InteratorTest {
    @Test
    public void teat1() {
        Collection coll = new ArrayList();  //有序的
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());  //五个所以遍历五次


//        //方式二:   不推荐
//        for(int i= 0 ; i < coll.size(); i ++){
//            System.out.println(iterator.next());
//        }


        //方式三: 推荐
        while (iterator.hasNext()) {
            //1. 指针下移 2, 将下移后以后的集合位置上的元素返回
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();  //有序的
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);


//        //错误方式一:   移动两次会跳着输出
//        Iterator iterator  = coll.iterator();
//        while(iterator.next() != null){
//            System.out.println(iterator.next());
//        }

        //错误方式二:
        //集合对象每次调用iterator() 方法都会得到一个全新的迭代器对象, 默认游标都在集合的第一个元素之前
        while((coll.iterator().hasNext())){  //指针在开头
            System.out.println(coll.iterator().next());
        }
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();  //有序的
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);


        //删除集合中"Tom"
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if("Tom".equals(obj)){
                iterator.remove();
            }
        }

        //集合遍历
        iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


}