public class GameFrameRun {

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(
                    new javax.swing.plaf.metal.MetalLookAndFeel());
        } catch (Exception e) {
        }

        GameFrame frame = new GameFrame();

        frame.setUpFrame();
        frame.pack();
        frame.setVisible(true);
        frame.repaint();


        // this method must finish and return before GUI
        // handling begins
    }

}
