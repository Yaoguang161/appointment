package src.duoxiancheng;

/**
 * Created by Enzo Cotter on 2021/7/19.
 */


class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i < 100 ; i ++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }


}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.start();
        //一个对象只能有一个线程
        MyThread t2 = new MyThread();

        t2.start();
        for(int i = 0 ; i < 100 ; i ++){
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+ i+ "***************");
            }
        }

//        System.out.println("hello world!");
    }
}