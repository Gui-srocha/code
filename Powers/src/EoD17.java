public class EoD17 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n <= 0 || args.length != 1) {
            System.err.println("Please insert a valid value for n");
            System.exit(1);
        }
        int[] g = new int[n];
        g[0] = 1;
        g[1] = 2;
        g[2] = 3;
        g[3] = 4;
        g[4] = 5;
        for (int j = 0; j < n; j++) {
            int temp = g[j];
            g[j] = g[n - (j + 1)];
            g[n - (j + 1)] = temp;
            System.out.print(g[j] + " ");
            System.out.println(g[n - (j + 1)]);
        }
    }
}
