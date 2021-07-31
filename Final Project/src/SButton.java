import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SButton extends JButton implements ActionListener {

    private int count = 0;


    public SButton() {
        this.addActionListener(this);
    }
    

    public void beenHere() {
        if (count == 0) {
            this.setText("1");
            count++;
        } else if (count == 1) {
            this.setText("2");
            count++;
        } else if (count == 2) {
            this.setText("3");
            count++;
        } else if (count == 3) {
            this.setText("4");
            count++;
        } else if (count == 4) {
            this.setText("1");
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
