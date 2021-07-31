public class Practice3 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        boolean d;
        d = (a < b + c) && (b < a + c) && (c < a + b);

        System.out.println(d);
    }
}
