public class Circle {
    public static void main(String[] args) {
        // Insert diameter as a command line argument and run it!
        double diameter = Double.parseDouble(args[0]);
        double perimeter = diameter * Math.PI;
        double area = Math.PI * Math.sqrt(diameter / 2);
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledCircle(0.5, 0.5, diameter / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(0.5, 0.16, "Circle");
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.text(0.5, 0.12, "Diameter: " + diameter);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.5, 0.08, "Perimeter: " + perimeter);
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.text(0.5, 0.04, "Area: " + area);
    }
}
