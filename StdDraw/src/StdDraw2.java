public class StdDraw2 {
    public static void main(String[] args) {
        double s = 1.0 / 6.0;
        double x = s;
        double y = s;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(x, y, s);
        x = x + (s * 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(x, y, s);
        x = x + (s * 2);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(x, y, s);
        x = s;
        y = y + (s * 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(x, y, s);
        y = y + (s * 2);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(x, y, s);
        StdDraw.setPenColor(StdDraw.RED);
        x = x + (s * 2);
        y = s;
        y = y + (s * 2);
        StdDraw.filledSquare(x, y, s);
        StdDraw.setPenColor(StdDraw.BLACK);
        y = y + (s * 2);
        StdDraw.filledSquare(x, y, s);
        y = s;
        x = x + (s * 2);
        y = y + (s * 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(x, y, s);
        y = y + (s * 2);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(x, y, s);

    }
}
