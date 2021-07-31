public class Powers {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0])
        foo(a);


    }

    public static double[] foo(double a) {
        double b = 2 * a;
        double c = a / 2;
        double d = a + b + c;
        double[] g = new double[4];
        g[0] = a;
        g[1] = b;
        g[2] = c;
        g[3] = d;
        return g;
    }
}
