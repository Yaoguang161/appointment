package com.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Enzo Cotter on 2021/9/1.
 */

/*
* 解决线程安全问题的方式三： lock锁， -- JDK5。0新增
* */

class Window implements Runnable{
    private int ticket = 100;
    //实例化 ReentrantLock
    private ReentrantLock lock = new ReentrantLock(true);  //fair 公平

    @Override
    public void run(){
        while(true){
            try{
                //2.调用lock();
                lock.lock();
                if(ticket > 0){

                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ": 售票，票号为 " + ticket );
                    ticket --;
                }else{
                    break;
                }
            }finally{
                //3.调用解锁方法： unlock();
                    lock.unlock();
            }

        }
    }
}



public class LockTest  {
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");


        t1.start();
        t2.start();
        t3.start();
    }
}
