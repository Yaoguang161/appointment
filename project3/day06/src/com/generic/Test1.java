package com.generic;

/**
 * Created by Enzo Cotter on 2021/9/8.
 */

public class Test1 {
    public static void main(String[] args) {
        // 不指定泛型的时候
        int i = Test1.add(1,2);
        Number f = Test1.add(1,1.2);
        Object o = Test1.add(1,"asd");
        //指定泛型的时候
        int a = Test1.<Integer>add(1,2);
        Number c = Test1.<Number>add(1,2.2);
    }
    //一个简单的泛型方法
    public static <T> T add(T x, T y){
        return y;
    }

}
