package priv.text.计算器;

/**
 * Created by Enzo Cotter on 2020/12/6.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OperationButton extends Button {
    String operator;

    public OperationButton(String s) {
        super(s);
        operator = s;
        setForeground(Color.red);
    }

    public String getOperator() {
        return operator;
    }
}