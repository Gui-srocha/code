public class Eod {
    public static void main(String[] args) {
        int g = Integer.parseInt(args[0]);
        int[] a = new int[g];
        for (int c = 0; c < a.length; c++) {
            int random = (int) (Math.random() * 100);
            a[c] = random;
        }
        System.out.println(tripleTime(a));
    }

    public static boolean tripleTime(int[] a) {
        boolean tripleTime = false;
        for (int i = 0; i < a.length - 4; i++) {
            if (a[i] < a[i + 1]) {
                if (a[i + 2] > a[i + 1] && a[i + 2] > a[i]) {
                    tripleTime = true;
                    break;
                }
            }
        }

        return tripleTime;
    }
}
