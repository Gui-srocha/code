public class EoD {
    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]);
        int[] a = marr(b);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] marr(int v) {
        int[] x = new int[v];
        for (; v > 0; v--) {
            x[v - 1] = M(v);
        }
        return x;
    }

    public static int M(int v) {
        if (v > 100) {
            return v - 10;
        } else {
            return M(M(v + 11));
        }
    }
}
