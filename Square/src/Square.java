public class Square {
    public static void main(String[] args) {
        // Please insert the Length and run the program
        double Length = Double.parseDouble(args[0]);
        double Perimeter = 4 * Length;
        double Area = Math.pow(Length, 2);
        double draw_length = 0.25;
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.filledSquare(0.5, 0.5, draw_length);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(0.5, 0.2, "Square");
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.text(0.5, 0.16, "Edge length: " + Length);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.text(0.5, 0.12, "Perimeter: " + Perimeter);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.5, 0.08, "Area: " + Area);

    }
}
