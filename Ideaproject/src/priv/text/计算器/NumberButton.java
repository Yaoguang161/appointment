package priv.text.计算器;

/**
 * Created by Enzo Cotter on 2020/12/6.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberButton extends Button {
    int number;

    public NumberButton(int number) {
        super(" " + number);
        this.number = number;
        setForeground(Color.blue);
    }

    public int getNumber() {
        return number;
    }
}