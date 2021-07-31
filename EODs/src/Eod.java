public class Eod {
    public static void main(String[] args) {
        int[] a = new int[(int) (Math.random() * 10)];
        for (int b = 0; b < a.length; b++) {
            int c = (int) (Math.random() * 20);
            a[b] = c;
        }
        System.out.println(switchArray(a));

    }

    public static int switchArray(int[] a) {
        if (a.length < 2) {
            System.err.println("The array does not have enough elements");
            System.exit(1);
        }
        int sum = 0;
        for (int c = 0; c < a.length; c++) {
            sum += a[c];
        }
        return sum;
    }
}

