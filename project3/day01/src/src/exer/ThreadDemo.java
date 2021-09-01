package src.exer;

/**
 * Created by Enzo Cotter on 2021/7/20.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();


        //创建Thread匿名子类的方式
        new Thread(){
            public void run() {
                for(int i = 0 ; i <  100 ; i ++){
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0 ; i <  100 ; i ++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0 ; i <  100 ; i ++){
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}