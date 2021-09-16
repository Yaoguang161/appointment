package com.collection.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2021/9/16.
 */
public class ListExer {

    @Test
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//

    }
    private static void updateList(List list){
        list.remove(2);//2是索引
        list.remove(new Integer(2)); //2 被认为是对象
    }
}
