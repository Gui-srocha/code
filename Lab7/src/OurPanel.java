import javax.swing.*;
import java.awt.*;

public class OurPanel extends JPanel {


    //
    // JPanels are useful as components to draw on
    //


    private Color col;
    private Color col2;

    public OurPanel() {
        // set size, otherwise Java will assume 0 x 0 and component may disappear
        setPreferredSize(new Dimension(300, 300));
        col2 = makeRandomColor();

    }


    public void randomSet() {

        col = makeRandomColor();

    }

    /*
     * This method is called whenever java wants to draw the panel
     * CHange this to change the appearance of the panel
     *
     */
    public void paintComponent(Graphics g) {

        col = makeRandomColor();
        g.setColor(col);

        g.drawString("Your First CS112 GUI Program", 50, 50);
        col2 = makeRandomColor();
        g.setColor(col2);

        g.fillArc(40, 10, 80, 110, 0, 180);
        g.fillRect(76, 20, 10, 80);
        g.fillOval(61, 90, 40, 20);
    }

    // Math.random() returns a number between 0 and 1

    private Color makeRandomColor() {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color col = new Color(red, green, blue);
        return col;
    }

}

