public class RightTriangle {
    public static void main(String[] args) {
        // Insert height and base length as command line arguments and run it!
        double base_length = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double perimeter = height + base_length + Math.sqrt(Math.pow(height, 2) + Math.pow(base_length, 2));
        double area = (base_length * height) / 2;
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.line(0.3, 0.3, 0.3, 0.8);
        StdDraw.line(0.3, 0.3, 0.8, 0.3);
        StdDraw.line(0.3, 0.8, 0.8, 0.3);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(0.5, 0.20, "Right Triangle");
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.text(0.5, 0.16, "Base length: " + base_length);
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.text(0.5, 0.12, "Height: " + height);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.5, 0.08, "Perimeter: " + perimeter);
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.text(0.5, 0.04, "Area: " + area);
    }
}
