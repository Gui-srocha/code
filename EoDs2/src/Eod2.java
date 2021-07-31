public class Eod2 {
    public static void main(String[] args) {
        int g = Integer.parseInt(args[0]);
        int[] a = new int[g];
        for (int c = 0; c < a.length; c++) {
            int random = (int) (Math.random() * 100);
            a[c] = random;
        }
        System.out.println(findDuplicate(a));
    }

    public static boolean findDuplicate(int[] a) {
        boolean variable = false;
        for (int t = 0; t < a.length - 1; t++) {
            if (a[t] == a[t + 1]) {
                variable = true;
                break;
            }
        }
        return variable;
    }
}
