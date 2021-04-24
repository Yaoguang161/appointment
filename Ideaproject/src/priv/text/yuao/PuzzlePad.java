import priv.text.pintu.SquarePoint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Vector;
import java.awt.image.*;

public class PuzzlePad extends JPanel implements ActionListener {
    int rows, colums;
    int width, height;
    SquarePoint point[][];
    JButton block[][];
    Vector vector;
    int leftX = 50, leftY = 50;
    Image image = null;
    Toolkit tool = null;
    MediaTracker mt;
    int 图像的宽, 图像的高;
    Image blockImage[];
    boolean 画图像 = true;

    public PuzzlePad(int r, int c, int w, int h) {
        setLayout(null);
        vector = new Vector();
        rows = r;
        colums = c;
        width = w;
        height = h;
        tool = getToolkit();
        try {
            image = tool.createImage("../pintu/tu/dog.png");
            mt.addImage(image, 1);
            mt.waitForAll();
        } catch (Exception e) {
        }
        block = new JButton[rows][colums];
        point = new SquarePoint[rows][colums];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if ((i == rows - 1) && (j == colums - 1)) {
                } else {
                    block[i][j] = new JButton();
                    block[i][j].setSize(width, height);
                    block[i][j].addActionListener(this);
                    vector.add(block[i][j]);
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {

                point[i][j] = new SquarePoint(50 + j * width, 50 + i * height);
                if ((i == rows - 1) && (j == colums - 1)) {
                } else {
                    point[i][j].setBlock(block[i][j], this);

                }
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        int x = button.getBounds().x;
        int y = button.getBounds().y;
        int m=0,n=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (point[i][j].getX() == x && point[i][j].getY() == y) {
                    m = i;
                    n = j;
                }
            }
        }
        int 上 = Math.max(0, m - 1);
        int 下 = Math.min(rows - 1, m + 1);
        int 左 = Math.max(0, n - 1);
        int 右 = Math.min(colums - 1, n + 1);
        if (point[上][n].get有方块() == false) {
            point[上][n].setBlock(button, this);
            point[m][n].set有方块(false);
        } else if (point[下][n].get有方块() == false) {
            point[下][n].setBlock(button, this);
            point[m][n].set有方块(false);
        } else if (point[m][左].get有方块() == false) {
            point[m][左].setBlock(button, this);
            point[m][n].set有方块(false);
        } else if (point[m][右].get有方块() == false) {
            point[m][右].setBlock(button, this);
            point[m][n].set有方块(false);
        }
    }

    public void 随机排列数字() {
        vector.removeAllElements();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if ((i == rows - 1) && (j == colums - 1)) {
                } else {
                    vector.add(block[i][j]);
                }
            }
        }
        int i = 1;
        while (vector.size() > 0) {
            int n = (int) (Math.random() * vector.size());
            JButton b = (JButton) vector.elementAt(n);
            b.setText("" + i);
            b.setIcon(null);
            b.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
            vector.remove(n);
            i++;
        }
        画图像 = false;
        repaint();
    }

    public void 随机排列图像() {
        try {
            图像的宽 = image.getWidth(this);
            图像的高 = image.getHeight(this);
            int w = 图像的宽 / colums;
            int h = 图像的高 / rows;
            blockImage = new Image[rows * colums];
            int k = 0;
            PixelGrabber pg = null;
            ImageProducer ip = null;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < colums; j++) {
                    int pixels[] = new int[w * h];
                    pg = new PixelGrabber(image, j * w, i * h, w, h, pixels, 0, w);
                    pg.grabPixels();
                    ip = new MemoryImageSource(w, h, pixels, 0, w);
                    blockImage[k] = tool.createImage(ip);
                }
            }
            vector.removeAllElements();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < colums; j++) {
                    if ((i == rows - 1) && (j == colums - 1)) {
                    } else {
                        vector.add(block[i][j]);
                    }
                }
            }
            int num = 0;
            while (vector.size() > 0) {
                int n = (int) (Math.random() * vector.size());
                JButton b = (JButton) vector.elementAt(n);
                b.setIcon(new ImageIcon(blockImage[num]));
                b.setBorder(null);
                b.setText("");
                vector.remove(n);
                num++;
            }
            画图像 = true;
            repaint();
        } catch (Exception ee) {
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(leftX, leftY, colums * width, rows * height);
        if (画图像 == true) {
            g.drawImage(image, colums * width + 80, height, colums * width, rows * height, this);
            for (int i = 0; i < rows; i++) {
                g.setColor(Color.white);
                g.drawLine(colums * width + 80, height + i * height, colums * width + 80 + colums * width, height + i * height);
            }
            for (int j = 0; j < colums; j++) {
                g.drawLine(colums * width + 80 + j * width, height, colums * width + 80 + j * width, height + rows * height);
            }
            g.setColor(Color.black);
            g.fillRect(colums * width + 80 + (colums - 1) * width, height + (rows - 1) * height, width, height);
        }
    }
}

