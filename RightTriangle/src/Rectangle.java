public class Rectangle {
    public static void main(String[] args) {
        // Insert height and length as command line arguments and run it!
        double length = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double perimeter = (2 * length) + (2 * height);
        double area = length * height;
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.filledRectangle(0.5, 0.5, length / 2, height / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(0.5, 0.16, "Rectangle");
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.text(0.5, 0.12, "Height: " + height);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.5, 0.08, "Perimeter: " + perimeter);
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.text(0.5, 0.04, "Area: " + area);
    }
}
