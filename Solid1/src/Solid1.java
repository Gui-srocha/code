public class Solid1 {
    public static void main(String[] args) {
        // Insert the values of height, breadth and length as command line arguments and run it!
        double length = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double breadth = Double.parseDouble(args[2]);
        double volume = length * height * breadth;

        StdDraw.rectangle(0.5, 0.5, 0.2, 0.1);
        StdDraw.line(0.3, 0.6, 0.4, 0.7);
        StdDraw.line(0.3, 0.4, 0.4, 0.5);
        StdDraw.line(0.7, 0.6, 0.8, 0.7);
        StdDraw.line(0.7, 0.4, 0.8, 0.5);
        StdDraw.rectangle(0.6, 0.6, 0.2, 0.1);
        StdDraw.text(0.5, 0.2, "Rectangle");
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.text(0.5, 0.16, "Length: " + length);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.text(0.5, 0.12, "Height: " + height);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.5, 0.08, "Breadth: " + breadth);
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.text(0.5, 0.04, "Volume: " + volume);

    }
}
