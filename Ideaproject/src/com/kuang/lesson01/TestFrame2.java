package com.kuang.lesson01;

import java.awt.*;

/**
 * Created by Enzo Cotter on 2020/12/15.
 */
public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口 new
        MyFrame myFrame1 =new MyFrame(100, 100 ,200,200, Color.blue);
        MyFrame myFrame2 =new MyFrame(300, 100 ,200,200, Color.yellow);
        MyFrame myFrame3 =new MyFrame(100, 300 ,200,200, Color.green);
        MyFrame myFrame4 =new MyFrame(300, 300 ,200,200, Color.magenta);
    }
}

class MyFrame extends Frame{
    static int id =0; //可能存在多个窗口,我们需要一个计数器
    public MyFrame(int x,int y,int w,int h,Color color){
        super("Myframe+"+(++id));
        setBackground(color);          //设置颜色
        setBounds(x,y,w,h);      //设置位置和大小
        setVisible(true);  //设置可见

    }

}
