package com.test;

/**
 * Created by Enzo Cotter on 2021/9/1.
 */
/*使用同步机制将单例模式中的懒汉式改写为线程安全的*/
public class BankTest {
}

class Bank{
    private Bank(){}
    private static Bank instance = null;
    public static synchronized Bank getInstance(){ //此时已经线程安全，Bank是锁
//        if(instance == null){
//            instance = new Bank();
//        }

//         方式一： 效率稍差
//        synchronized(Bank.class){
//            if(instance == null){
//                instance = new Bank();
//            }
//        }
//        方式二： 效率更高
          if(instance ==null){
              synchronized(Bank.class){
                  if(instance == null){
                      instance = new Bank();
                  }
              }
          }
        return instance;
    }
}