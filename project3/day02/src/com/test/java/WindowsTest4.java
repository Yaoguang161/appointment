package com.test.java;

/**
 * Created by Enzo Cotter on 2021/9/1.
 */
/*
* 使用同步方法处理继承Thread类的方式中的线程安全问题
* 关于同步方法的总结：
* 1. 同步方法仍然涉及到同步监视器中，只是不需要我们显式的声明。
* 2. 非静态的同步方法，同步监视器式： this
*       静态的同步方法，同步监视器是： 当前类本身。
* */

class Windows4 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }
    // private synchronized void show(){  同步监视器 ： t1 , t2  t3  此种方法错误

    private static synchronized void show(){ //同步监视器 Widows4.class
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
            ticket--;
        }
    }
}



public class WindowsTest4 {
    public static void main(String[] args) {
        Windows4 t1 = new Windows4();
        Windows4 t2 = new Windows4();
        Windows4 t3 = new Windows4();


        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");


        t1.start();
        t2.start();
        t3.start();
    }
}

