package com.test;

/**
 * Created by Enzo Cotter on 2021/9/1.
 */


//睡眠引起死锁，不会出现提示，只是所有的线程都至于阻塞状态，无法继续进行
//
public class ThreadTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();


        new Thread(){
            @Override
            public void run(){
                synchronized(s1){
                    s1.append("a");
                    s2.append("1");

                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized(s2){
                        s1.append("b");
                        s2.append("2");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run(){
                synchronized(s2){
                    s1.append("c");
                    s2.append("3");

                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized(s1){
                        s1.append("d");
                        s2.append("4");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }


        }).start();
    }
}
























