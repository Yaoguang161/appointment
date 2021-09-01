package com.test.java;



class Windows1 implements Runnable {
    private  int ticket = 100;
    Object obj = new Object(); //锁必须放这里

    @Override
    public void run() {
            while (true) {
                synchronized(obj) { //方式一: (括号里可以填this)唯一的Windows1的对象 //方式二: synchronized(对象)
      //            synchronized (Windows1.class){  //类也是对象
                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + ":卖票,票号为:" + ticket);
                        ticket--;
                    } else {
                        break;
                    }
                }
            }

    }
}

class WindowTest1 {
    public static void main(String[] args) {
        Windows1  w = new Windows1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}
