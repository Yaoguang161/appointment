package priv.text.pintu;

/**
 * Created by Enzo Cotter on 2020/12/5.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PuzzleFrame extends JFrame implements ActionListener {
    PuzzlePad puzzlePad;
    JButton 开始;
    JMenuBar bar;
    JMenu fileMenu;
    JMenuItem 初级, 高级;
    JRadioButton 数字玩法, 图像玩法;
    ButtonGroup group = null;
    Container con = null;

    public PuzzleFrame() {
        bar = new JMenuBar();
        fileMenu = new JMenu("魔板游戏");
        初级 = new JMenuItem("初级");
        高级 = new JMenuItem("高级");
        fileMenu.add(初级);
        fileMenu.add(高级);
        bar.add(fileMenu);
        setJMenuBar(bar);
        初级.addActionListener(this);
        高级.addActionListener(this);
        开始 = new JButton("开始玩");
        开始.addActionListener(this);
        group = new ButtonGroup();
        数字玩法 = new JRadioButton("数字玩法", true);
        图像玩法 = new JRadioButton("图像玩法", false);
        group.add(数字玩法);
        group.add(图像玩法);
        puzzlePad = new PuzzlePad(3, 3, 50, 50);
        con = getContentPane();
        con.add(puzzlePad, BorderLayout.CENTER);
        JPanel pNorth = new JPanel();
        pNorth.add(数字玩法);
        pNorth.add(图像玩法);
        pNorth.add(开始);
        con.add(pNorth, BorderLayout.NORTH);
        con.validate();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
        setBounds(100, 50, 440, 360);
        validate();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == 开始) {
            if (数字玩法.isSelected()) {
                puzzlePad.随机排列数字();
            } else if (图像玩法.isSelected()) {
                puzzlePad.随机排列图像();
            }
        } else if (e.getSource() == 初级) {
            con.remove(puzzlePad);
            puzzlePad=new PuzzlePad(3,3,50,50);
            con.add(puzzlePad, BorderLayout.CENTER);
            con.validate();
            this.validate();
        } else if (e.getSource() == 高级) {
            con.remove(puzzlePad);
            puzzlePad = new PuzzlePad(4, 4, 50, 50);
            con.add(puzzlePad, BorderLayout.CENTER);
            con.validate();
            this.validate();
        }
    }

    public static void main(String args[]) {
        new PuzzleFrame();
    }
}

