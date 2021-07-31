public class Eod4 {
    public static void main(String[] args) {
        int index = Integer.parseInt(args[0]);
        int[] a = new int[index];
        for (int c = 0; c < a.length; c++) {
            int random = (int) (Math.random() * 100);
            a[c] = random;
        }

    }

    public static int[] histogram(int[] a) {
        int[] h = new int[a.length];
        return h;
    }
}
