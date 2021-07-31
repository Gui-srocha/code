public class prac {
    public static void main(String[] args) {
        int v = Integer.parseInt(args[0]);
        hailstone(v);
    }

    public static int chars(int a) {
        if (a < 0) {
            return 1 + chars(-a);
        }
        if (a < 10) {
            return 1;
        }
        return 1 + chars(a / 10);
    }

    public static int sequence(int a) {
        if (a == 1) {
            return 1;
        }
        return a + sequence(a - 1);
    }

    public static void hailstone(int a) {
        if (a == 1) {
            System.exit(0);
        }
        if (a % 2 == 0) {
            System.out.print(a + " ");
            hailstone(a / 2);
        }
        if (a % 2 != 0) {
            System.out.print(a + " ");
            hailstone((3 * a) + 1);
        }
    }

}
