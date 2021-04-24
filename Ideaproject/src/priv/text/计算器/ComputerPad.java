package priv.text.计算器;

/**
 * Created by Enzo Cotter on 2020/12/6.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.LinkedList;
import java.text.NumberFormat;
import java.awt.Container.*;

public class ComputerPad extends Frame implements ActionListener {
    NumberButton numberButton[];

    OperationButton operationButton[];

    Button 小数点按钮, 正负号按钮, 退格按钮, 求倒数按钮, 等号按钮, 清零按钮;
    Panel panel;
    JTextField resultShow;
    String 运算符号[] = {" +", " -", " *", " /"};
    LinkedList 链表;
    boolean 是否按下等号 = false;


    public ComputerPad() {
        super("计算器");
        链表 = new LinkedList();
        numberButton = new NumberButton[10];
        for (int i = 0; i <= 9; i++) {
            numberButton[i] = new NumberButton(i);
            numberButton[i].addActionListener(this);
        }
        operationButton = new OperationButton[4];
        for (int i = 0; i < 4; i++) {
            operationButton[i] = new OperationButton(运算符号[i]);
            operationButton[i].addActionListener(this);
        }
        小数点按钮 = new Button(" .");
        正负号按钮 = new Button("+/-");
        等号按钮 = new Button("=");
        求倒数按钮 = new Button("1/x");
        退格按钮 = new Button("退格");
        清零按钮 = new Button("C");
        清零按钮.setForeground(Color.red);
        退格按钮.setForeground(Color.red);
        等号按钮.setForeground(Color.red);
        求倒数按钮.setForeground(Color.blue);
        正负号按钮.setForeground(Color.blue);
        小数点按钮.setForeground(Color.blue);
        退格按钮.addActionListener(this);
        清零按钮.addActionListener(this);
        等号按钮.addActionListener(this);
        小数点按钮.addActionListener(this);
        正负号按钮.addActionListener(this);
        求倒数按钮.addActionListener(this);
        resultShow = new JTextField(10);
        resultShow.setHorizontalAlignment(JTextField.RIGHT);
        resultShow.setForeground(Color.blue);
        resultShow.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        resultShow.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
        resultShow.setBackground(Color.white);
        resultShow.setEditable(false);
        panel = new Panel();
        panel.setLayout(new GridLayout(4, 5));
        //面板中的第一行
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(operationButton[0]);
        panel.add(清零按钮);
        //面板第二行
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(operationButton[1]);
        panel.add(退格按钮);
        //面板中第三行
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(operationButton[2]);
        panel.add(求倒数按钮);
        //面板中第四行
        panel.add(numberButton[0]);
        panel.add(正负号按钮);
        panel.add(小数点按钮);
        panel.add(operationButton[3]);
        panel.add(等号按钮);
        add(panel, BorderLayout.CENTER);
        add(resultShow, BorderLayout.NORTH);
        addWindowListener(new WindowAdapter() {
            public void winfowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
        setBounds(100, 50, 240, 180);
        setResizable(false);
        validate();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof NumberButton) {
            NumberButton b = (NumberButton) e.getSource();
            if (链表.size() == 0) {  //如果链表中没节点
                int number = b.getNumber();   //如果鼠标单击数字按钮
                链表.add(" " + number);        //将数据添加到链表
                resultShow.setText(" " + number);
                是否按下等号 = false;
            } else if (链表.size() == 1 && 是否按下等号 == false) {
                int number = b.getNumber();
                String num = (String) 链表.getFirst();
                String s = num.concat(" " + number);  //将两个数字首尾相接
                链表.set(0, s);
                resultShow.setText(s);
            } else if (链表.size() == 1 && 是否按下等号 == true) {
                int number = b.getNumber();
                链表.removeFirst();
                链表.add(" " + number);                        //将数据添加到链条
                是否按下等号 = false;
                resultShow.setText(" " + number);
            } else if (链表.size() == 2) {      //链表中已有2个节点
                int number = b.getNumber();
                链表.add(" " + number);
                resultShow.setText(" " + number);
            } else if (链表.size() == 3) {
                int number = b.getNumber();
                String num = (String) 链表.getLast();
                String s = num.concat(" " + number);     //与链表中第3个节点中的数字首尾相接
                链表.set(2, s);
                resultShow.setText(s);
            }
        } else if (e.getSource() instanceof OperationButton) {//如果单机运算符号按钮
            OperationButton b = (OperationButton) e.getSource();
            if (链表.size() == 1) {
                String fuhao = b.getOperator();
                链表.add(fuhao);                      //链表添加第二个节点：运算符号
            } else if (链表.size() == 2) {
                String fuhao = b.getOperator();
                链表.set(1, fuhao);                      //改变运算符号
            } else if (链表.size() == 3) {
                String fuhao = b.getOperator();
                String number1 = (String) 链表.getFirst();
                String number2 = (String) 链表.getLast();
                String 运算符号 = (String) 链表.get(1);
                try {
                    double n1 = Double.parseDouble(number1);
                    double n2 = Double.parseDouble(number2);
                    double n = 0;
                    if (运算符号.equals("+")) {
                        n = n1 + n2;
                    } else if (运算符号.equals("-")) {
                        n = n1 - n2;
                    } else if (运算符号.equals("*")) {
                        n = n1 * n2;
                    } else if (运算符号.equals("/")) {
                        n = n1 / n2;
                    }
                    链表.clear();
                    //根据链表内已有的书进行运算，其结果作为新的运算数值
                    链表.add(" " + n);
                    链表.add(fuhao);                   //添加下一次计算的运算符
                    resultShow.setText(" " + n);
                } catch (Exception ee) {
                }
            }
        } else if (e.getSource() == 等号按钮) {
            是否按下等号 = true;
            if (链表.size() == 1 || 链表.size() == 2) {
                String num = (String) 链表.getFirst();
                resultShow.setText(" " + num);
            } else if (链表.size() == 3) {
                String number1 = (String) 链表.getFirst();
                String number2 = (String) 链表.getLast();
                String 运算符号 = (String) 链表.get(1);
                try {
                    double n1 = Double.parseDouble((number1));
                    double n2 = Double.parseDouble(number2);
                    double n = 0;
                    if (运算符号.equals("+")) {
                        n = n1 + n2;
                    } else if (运算符号.equals("-")) {
                        n = n1 - n2;
                    } else if (运算符号.equals("*")) {
                        n = n1 * n2;
                    } else if (运算符号.equals("/")) {
                        n = n1 / n2;
                    }
                    resultShow.setText("" + n);
                    链表.set(0, " " + n);
                    链表.removeLast();
                    链表.removeLast();
                } catch (Exception ee) {

                }
            }
        } else if (e.getSource() == 小数点按钮) {
            if (链表.size() == 0) {
                是否按下等号 = false;
            } else if (链表.size() == 1) {
                String dot = 小数点按钮.getLabel();
                String num = (String) 链表.getFirst();
                String s = null;
                if (num.indexOf(dot) == -1) {
                    s = num.concat(dot);
                    链表.set(0, s);
                } else {
                    s = num;
                }
                链表.set(0, s);
                resultShow.setText(s);
            } else if (链表.size() == 3) {
                String dot = 小数点按钮.getLabel();
                String num = (String) 链表.getLast();
                String s = null;
                if (num.indexOf(dot) == -1) {
                    s = num.concat(dot);
                    链表.set(2, s);
                } else {
                    s = num;
                }
                resultShow.setText(s);
            }
        } else if (e.getSource() == 退格按钮) {
            if (链表.size() == 1) {
                String num = (String) 链表.getFirst();
                if (num.length() >= 1) {
                    num = num.substring(0, num.length() - 1);
                    链表.set(0, num);
                    resultShow.setText(num);
                } else {
                    链表.removeLast();
                    resultShow.setText("0");
                }
            } else if (链表.size() == 3) {
                String num = (String) 链表.getLast();
                if (num.length() >= 1) {
                    num = num.substring(0, num.length() - 1);
                    链表.set(2, num);
                    resultShow.setText(num);
                } else {
                    链表.removeLast();
                    resultShow.setText("0");
                }
            }
        } else if (e.getSource() == 正负号按钮) {
            if (链表.size() == 1) {
                String number1 = (String) 链表.getFirst();
                try {
                    double d = Double.parseDouble(number1);
                    d = -1 * d;
                    String str = String.valueOf(d);
                    链表.set(0, str);
                    resultShow.setText(str);
                } catch (Exception ee) {
                }
            } else if (链表.size() == 3) {
                String number2 = (String) 链表.getLast();
                try {
                    double d = Double.parseDouble(number2);
                    d = -1 * d;
                    String str = String.valueOf(d);
                    链表.set(2, str);
                    resultShow.setText(str);
                } catch (Exception ee) {

                }
            }
        } else if (e.getSource() == 求倒数按钮) {
            if (链表.size() == 1 || 链表.size() == 2) {
                String number1 = (String) 链表.getFirst();
                try {
                    double d = Double.parseDouble(number1);
                    d = 1.0 / d;
                    String str = String.valueOf(d);
                    链表.set(0, str);
                    resultShow.setText(str);
                } catch (Exception ee) {
                }

            } else if (链表.size() == 3) {
                String number2 = (String) 链表.getLast();
                try {
                    double d = Double.parseDouble(number2);
                    d = 1.0 / d;
                    String str = String.valueOf(d);
                    链表.set(0, str);
                    resultShow.setText(str);
                } catch (Exception ee) {
                }
            }
        } else if (e.getSource() == 清零按钮) {
            是否按下等号 = false;
            resultShow.setText("0");
            链表.clear();
        }

    }

    public static void main(String args[]) {

        new ComputerPad();
    }
}
