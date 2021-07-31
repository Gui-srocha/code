public class Solid2 {
    public static void main(String[] args) {
        // Insert the values of height and base length as command line arguments and run it!
        double height = Double.parseDouble(args[0]);
        double base_length = Double.parseDouble(args[1]);
        double volume = (height * base_length) / 3;

        StdDraw.line(0.25, 0.25, 0.45, 0.5);
        StdDraw.line(0.25, 0.25, 0.6, 0.25);
        StdDraw.line(0.45, 0.5, 0.8, 0.5);
        StdDraw.line(0.8, 0.5, 0.6, 0.25);
        StdDraw.line(0.25, 0.25, 0.5, 0.8);
        StdDraw.line(0.6, 0.25, 0.5, 0.8);
        StdDraw.line(0.45, 0.5, 0.5, 0.8);
        StdDraw.line(0.8, 0.5, 0.5, 0.8);
        StdDraw.text(0.5, 0.2, "Quadrangular Pyramid");
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.text(0.5, 0.16, "Height: " + height);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.text(0.5, 0.12, "Base length: " + height);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.5, 0.08, "Volume: " + volume);
    }
}
