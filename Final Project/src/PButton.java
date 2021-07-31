import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PButton extends JButton implements ActionListener {

    private int count = 0;


    public PButton() {
        this.addActionListener(this);
    }


    public void beenHere() {
        if (count == 0) {
            this.setText("R");
            count++;
        } else if (count == 1) {
            this.setText("B");
            count++;
        } else if (count == 2) {
            this.setText("G");
            count++;
        } else if (count == 3) {
            this.setText("Y");
            count++;
        } else if (count == 4) {
            this.setText("R");
            count = 1;
        }
        this.setEnabled(true);
    }

    public int getCount() {
        return count;
    }

    public void actionPerformed(ActionEvent e) {
        beenHere();
    }
}
