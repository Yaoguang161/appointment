package com.collection.test;

import org.junit.Test;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Enzo Cotter on 2021/9/13.
 */


// 向Collcetion接口的实现类的对象中添加数据obj时,要求其obj所在的类要重写equals()
public class CollectionTest {


    @Test
    public void test1(){
        Collection coll  = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        //1. contains(Object obj); 判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在的类的equals().
        boolean contains = coll.contains(123);
        System.out.println(contains);  //true
        System.out.println(coll.contains(new String("Tom"))); // true
        System.out.println(coll.contains(new Person("Jerry",20))); // false


        //2.containsAll(Collection coll1): 判断coll1中的所有元素是否都存在于当前集合中
        Collection coll1  = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));

    }



    @Test
    public void test2(){
        //3.remove(Object obj): 从当前的集合中移除obj元素.
        Collection coll  = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));


        coll.remove(1234);
        System.out.println(coll);


        coll.remove(new Person("Jerry",20));
        System.out.println(coll);


        //4.removeAll(Collection coll1) : 差集: 从当前集合中移除coll1中的所有元素
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);



    }



    @Test
    public void test3(){
        Collection coll  = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry",20));
        coll.add(false);


//        //5.retainAll(Collection coll1): 交集 :获取当前集合和coll1集合的交集,并返回给当前集合
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);


        //6.equals(Object obj): 要想返回true判断当前集合和形参
        Collection coll1  = new ArrayList();  //有序的
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Tom"));
        coll1.add(new Person("Jerry",20));
        coll1.add(false);

        System.out.println(coll1.equals(coll1));
    }

    @Test
    public void test4(){
        Collection coll  = new ArrayList();  //有序的
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry",20));
        coll.add(false);


        //7.hashCode(): 返回当前对象的哈希值
        System.out.println(coll.hashCode());


        //8. 集合  -->  数组: toArray();
        Object[] arr = coll.toArray();
        for(int i  = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }




        //拓展 数组 --> 集合
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);



        List arr1 = Arrays.asList(new int[] {123,456});
        System.out.println(arr1.size()); //1  把括号内当成一个元素了

        List arr2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2.size());//2



        //iterator(): 返回Iterator接口的实例,用于遍历集合元素

    }




}





















