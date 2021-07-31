public class TheGame {

    // Notice that the Game does not know about the interface to the game
    // Now the game works in a different way. The player has 6 tries to find two buttons. If they do, the win. If not
    // they lose. The buttons are random.

    private int howManyPushed = 0;
    private int winCount = 0;
    private int limit;
    private String doneMessage = null;
    private int howMany = 11;
    private int[] goodButtons = {(int) (Math.random() * 11), (int) (Math.random() * 11)};

    public TheGame(int i) {
        limit = i;
    }

    public void goodSpot() {
        if (winCount == 1) {
            doneMessage = "You win!";
        } else {
            winCount++;
            howManyPushed++;
        }
    }

    public void spot() {
        howManyPushed++;
        if (howManyPushed > 5)
            doneMessage = "You Lose - Good!";
    }

    public boolean isButtonBad(int c) {
        for (int a : goodButtons)
            if (c == a) return true;
        return false;
    }

    public String getDoneMessage() {
        return doneMessage;
    }

    public int howManyButtons() {
        return howMany;
    }
}
