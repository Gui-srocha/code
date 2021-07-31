import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KakurasuButton extends JButton implements ActionListener {

    private int color = 0;
    private Color backgroundColor;
    private int buttonIndex;
    private boolean pressed;
    private Solver solution;

    public KakurasuButton(int index, Color backgroundColor) {
        this.setBackgroundColor(backgroundColor);
        buttonIndex = index;
        this.addActionListener(this);
        solution = new Solver();
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isPressed() {
        return pressed;
    }


    public Solver getSolution() {
        return solution;
    }

    public void beenHere() {
        if (color == 0) {
            this.setBackground(Color.BLACK);
            color++;
            pressed = true;
            solution.pressed(buttonIndex);
        } else if (color == 1) {
            this.setBackground(Color.WHITE);
            color--;
            pressed = false;
            solution.unPressed(buttonIndex);
        }
        this.setEnabled(true);
    }

    public void actionPerformed(ActionEvent e) {
        beenHere();
    }
}
