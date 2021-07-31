public class Ol {
    public static void main(String[] args) {
        double v = Double.parseDouble(args[0]);
        double t = Double.parseDouble(args[1]);
        if (t > 50 || v > 120 || v < 3) {
            System.err.println("Please insert valid values for velocity and temperature");
            System.exit(1);

        } else {
            double windchill = 35.74 + (0.6215 * t) + (((0.4274 * t) - 35.75) * Math.pow(v, 0.16));
            System.out.println(windchill);

        }
    }
}
