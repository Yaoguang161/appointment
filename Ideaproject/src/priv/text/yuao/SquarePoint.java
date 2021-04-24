
import java.awt.*;
import javax.swing.JButton;

public class SquarePoint {
    int x, y;
    boolean 有方块;
    JButton block = null;
    Container con = null;

    public SquarePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean get有方块() {
        return 有方块;
    }

    public void set有方块(boolean boo) {
        有方块 = boo;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setBlock(JButton block, Container con) {
        this.con = con;
        this.block = block;
        con.add(block);
        block.setLocation(x, y);
        有方块 = true;
        con.validate();
    }

    public JButton getBlock() {
        return block;
    }
}







