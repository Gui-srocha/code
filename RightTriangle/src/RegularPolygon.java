public class RegularPolygon {
    // Insert number of edges and length as command line arguments and run it!
    public static void main(String[] args) {
        double number_of_edges = Double.parseDouble(args[0]);
        double length = Double.parseDouble(args[1]);
        double apothem = length / (2 * Math.tan(Math.PI / number_of_edges));
        double perimeter = length * number_of_edges;
        double area = (perimeter * apothem) / 2;
        double angle = Math.toRadians(108);
        double Xa = 0.6;
        double Ya = 0.3;
        double Xb = 0.3;
        double Yb = 0.3;
        StdDraw.line(Xa, Ya, Xb, Yb);
        double Xc = Xb + (Xa - Xb) * Math.cos(angle) - (Ya - Yb) * Math.sin(angle);
        double Yc = Yb + (Xa - Xb) * Math.sin(angle) + (Ya - Yb) * Math.cos(angle);
        StdDraw.line(Xb, Yb, Xc, Yc);
        double Xd = Xc + (Xb - Xc) * Math.cos(angle) - (Yb - Yc) * Math.sin(angle);
        double Yd = Yc + (Xb - Xc) * Math.sin(angle) + (Yb - Yc) * Math.cos(angle);
        StdDraw.line(Xc, Yc, Xd, Yd);
        double Xe = Xd + (Xc - Xd) * Math.cos(angle) - (Yc - Yd) * Math.sin(angle);
        double Ye = Yd + (Xc - Xd) * Math.sin(angle) + (Yc - Yd) * Math.cos(angle);
        StdDraw.line(Xd, Yd, Xe, Ye);
        StdDraw.line(Xe, Ye, Xa, Ya);
        StdDraw.text(0.5, 0.24, "Polygon");
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.text(0.5, 0.2, "Number of edges: " + number_of_edges);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.5, 0.16, "Edge length: " + length);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.text(0.5, 0.12, "Perimeter: " + perimeter);
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.text(0.5, 0.08, "Area: " + area);
    }
}
