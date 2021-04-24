package com.kuang.lesson01;

import java.awt.*;

/**
 * Created by Enzo Cotter on 2020/12/15.
 */
//GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {
        //Frame.JDL. 看源码
        Frame frame=new Frame("我的第一个JAVA图形界面");

        //需要设置可见性  宽 高
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400, 400);

        //设置背景颜色 color
        frame.setBackground(new Color(85,150,68));

        //弹出的初始位置
        frame.setLocation(200, 200);

        //设置大小固定
        frame.setResizable(false);

    }
}
