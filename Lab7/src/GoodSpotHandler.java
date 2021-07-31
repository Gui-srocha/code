import java.awt.event.*;

public class GoodSpotHandler implements ActionListener {

	
	private TheGame g;
	private GameFrame frame;
	
	public GoodSpotHandler(TheGame game1, GameFrame fr) {
		g = game1;
		frame = fr;
	}

	public void actionPerformed(ActionEvent e) {
		g.spot();
		if (g.getDoneMessage() != null)
			frame.setDoneMessage(g.getDoneMessage());
		// ask for the Lab7Frame to be repainted
		frame.repaint();
	}

}
