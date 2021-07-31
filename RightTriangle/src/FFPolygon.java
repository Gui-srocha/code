public class FFPolygon {
    public static void main(String[] args) {
        double number_of_edges = Double.parseDouble(args[0]);
        double length = Double.parseDouble(args[1]);
        double apothem = length / (2 * Math.tan(Math.PI / number_of_edges));
        double perimeter = length * number_of_edges;
        double area = (perimeter * apothem) / 2;
        double draw_length = 0.2;
        double draw_apothem = draw_length / (2 * Math.tan(Math.PI / 5));
        double Xa = 0.3;
        double Ya = 0.3;
        double Xb = Xa + draw_length;
        double Yb = Ya;
        StdDraw.setPenColor(StdDraw.CYAN);
        StdDraw.line(Xa, Ya, Xb, Yb);
        double Xc = Xb - (draw_length / 2) + Math.sqrt(Math.pow(draw_apothem, 2) + Math.pow(draw_length / 2, 2));
        double Yc = Yb + draw_apothem;
        StdDraw.line(Xb, Yb, Xc, Yc);
        double Xd = Xc - Math.sqrt(Math.pow(draw_apothem, 2) + Math.pow(draw_length / 2, 2));
        double Yd = Yc + Math.sqrt(Math.pow(draw_apothem, 2) + Math.pow(draw_length / 2, 2));
        StdDraw.line(Xc, Yc, Xd, Yd);
        double Xe = Xd - Math.sqrt(Math.pow(draw_apothem, 2) + Math.pow(draw_length / 2, 2));
        double Ye = Yd - Math.sqrt(Math.pow(draw_apothem, 2) + Math.pow(draw_length / 2, 2));
        StdDraw.line(Xd, Yd, Xe, Ye);
        StdDraw.line(Xe, Ye, Xa, Ya);
    }
}
