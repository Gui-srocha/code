import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Would have changed this to good spot handler and the other one to spot handler, but wasn't sure if this was allowed.
public class BadSpotHandler implements ActionListener {

    private TheGame g;
    private GameFrame frame;

    public BadSpotHandler(TheGame game1, GameFrame fr) {
        g = game1;
        frame = fr;
    }

    public void actionPerformed(ActionEvent e) {
        g.goodSpot();
        if (g.getDoneMessage() != null)
            frame.setDoneMessage(g.getDoneMessage());
        frame.repaint();
    }

}
