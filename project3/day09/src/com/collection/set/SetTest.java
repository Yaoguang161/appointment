package com.collection.set;

import com.collection.exer.User;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : 存储无序的,不可重复的数据
//   以HashSet为例说明:
//      1.无序性: 不等于随机性. 存储的数据在底层数组中并非按照数组索引的顺序添加,而是根据数据的哈希值判断
//
//      2.不可重复性: 保证添加的元素按照equals()判断时,不能返回true.及相同的元素只能添加一个

//添加元素的过程: 以HashSet为例:
//      我们向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法,计算元素a的哈希值
//      此哈希值接着通过某种算法计算出HashSet底层数组中的存放位置(即为:索引位置),判断数组此位置
//      上是否已经没有元素:
//          如果此位置上没有其他元素,则元素a添加成功.   -->情况1
//          如果此位置上有其他元素b(或以链表形式存在存在的多个元素),则比较元素a与元素b的hash值:
/*
*                如果hash值不相同,则元素a添加成功. --->情况2
*                如果hash值相同,进而需要调用元素a所在类的equals()方法:
*                       equals()返回true,元素a添加失败
*                       equals()返回flase,则元素a添加成功.  --> 情况2
*
*
*        对于添加成功的情况2和情况3而言: 元素a 与已经存在指定索引位置上以链表的方式存储.
*           jdk 7: 元素a放到数组中,指向原来的元素.
*           jdk 8: 原来的元素在数组中,指向元素a
*
*
*
* */

/**
 * Created by Enzo Cotter on 2021/9/16.
 */
public class SetTest {
    @Test
    public void  test1() {
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);  //由于有两个123 所以会只显示一个,set不会重复
        set.add("AA");
        set.add("CC");
        set.add(new User("Jerry", 20));
        set.add(new User("Jerry", 20));  //这里却是可以重复的,两个对象的地址值不一样,没有
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }



//LinkedHashSet的使用
//LinkedHashSet作为HashSet的子类,在添加数据的同时,每隔数据还维护了两个引用,记录此数据前一个数据和后一个数据
//优点: 对于频繁的遍历操作,LinkedHashSet效率高于HashSet
    @Test
    public void  test2() {
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Jerry", 20));
        set.add(new User("Jerry", 20));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
