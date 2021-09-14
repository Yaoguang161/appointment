package com.test;

import java.awt.image.SinglePixelPackedSampleModel;

/**
 * Created by Enzo Cotter on 2021/9/11.
 */


//实现接口
interface Info{
    void show();
}



public class SeasonTest1  {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);


        System.out.println(Season1.class.getSuperclass());

        //调用接口,都会执行各自的接口中的方法
        Season1 winter = Season1.WINTER;
        winter.show();
    }
}

//自定义枚举类
enum Season1 implements Info {
    //1.提供当前枚举类的对象,多个对象之间用","隔开,末尾的对象";"结束
    SPRING("春天", "春暖花开"){
        public void show() {
            System.out.println("春天在哪里?");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        public void show() {
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天", "冰天雪地"){
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    //2.声明season对象的属性:private final 修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有话类的构造器,并给对象属性赋值
    private Season1(String seasonName, String seasonDesc) {
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }


    //4.其他诉求1: 获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //5.其他诉求, 提供toString,可以使用自己写的

/*    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }*/

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}