public class Value {
    private int val;
    private double[] sound;

    public Value(int n) {
        this.val = n;
        sound = new double[4410];
    }

    public int getValue() {
        return val;
    }

    public double[] getSound() {
        return sound;
    }

    public int compareTo(Value other) {
        if (this.val == other.val) {
            return 0;
        }
        if (this.val < other.val) {
            return -1;
        } else
            return 1;
    }

    public void setSound(int hz) {
        for (int i = 0; i < sound.length; i++) {
            sound[i] = Math.sin(2 * Math.PI * i * hz / 44100);
        }
    }

    public void draw(double x, double y) {
        StdDraw.filledRectangle(x, y, 0.5, getValue() / 2);
    }

}
