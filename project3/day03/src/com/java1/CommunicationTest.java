package com.java1;

/**
 * Created by Enzo Cotter on 2021/9/2.
 */
/*线程通信的例子: 使用两个线程打印1 - 100. 线程1, 线程2 交替打印
* 涉及到的三个方法:
* wait(): 一但执行此方法,当前线程就进入阻塞方法,并释放同步监视器
* notify():一但执行此方法,就会唤醒被wait的一个线程,如果有多个线程被wait就唤醒优先级高的那个
* notifyAll();一但执行此方法,就唤醒所有被wait的线程
* 说明:
*       1.wait(),notify(),notifyAll() 三个方法必须使用在同步代码块或同步方法中
*       2.wait(),notify(),notifyAll() 三个方法的调用者必须是同步代码块或同步方法中的同步监视器
*           否则会出现IllegalMonitorStateExceptionyi异常
* */
//交替打印
class Number implements Runnable{
    private int number = 1;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized(obj) {
                    obj.notify();  //唤醒当前线程,看谁优先度高
//                this.notifyAll(); //唤醒所有线程,前面默认this
                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try{
                        // 使得调用如下wait()的方法进入阻塞状态
                        obj.wait();

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}



public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
