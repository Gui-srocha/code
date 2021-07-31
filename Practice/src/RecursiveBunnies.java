public class RecursiveBunnies {
    public static void main(String[] args) {
        int bunnies = Integer.parseInt(args[0]);
        if (bunnies <= 0) {
            System.err.println("There needs to be at least one bunny");
            System.exit(1);
        }
        int[] a = bunnyEars(bunnies);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] bunnyEars(int a) {
        int[] b = new int[a];
        for (int i = b.length; i > 0; i--) {
            b[i - 1] = bunnyEarsHelper(i);
        }
        return b;
    }

    public static int bunnyEarsHelper(int a) {
        if (a == 0) {
            return 0;
        }
        if (a % 2 == 0) {
            return 3 + bunnyEarsHelper(a - 1);
        } else {
            return 2 + bunnyEarsHelper(a - 1);
        }
    }
}
