public class Eod3 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x < 2) {
            System.err.println("The array needs to have at least two values");
            System.exit(1);
        }
        int[] a = new int[x];
        for (int c = 0; c < a.length; c++) {
            int random = (int) (Math.random() * 100);
            a[c] = random;
            System.out.print(a[c] + " ");
        }
        System.out.println();
        System.out.println(getDiff(a));
    }

    public static int getDiff(int[] a) {
        int diff = 0;
        int max = a[0];
        int min = a[0];
        for (int d = 0; d < a.length; d++) {
            if (a[d] > max) {
                max = a[d];
            }
            if (a[d] < min) {
                min = a[d];
            }
        }
        diff = max - min;
        return diff;
    }
}
