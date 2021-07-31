public class EoD15 {
    public static String decayingPrefix(String s, int n) {
        String P = "";
        while (n > 0) {
            for (int j = 0; j < n; j++) {
                P += s.charAt(j);
            }
            n -= 1;
        }
        return P;
    }


    public static void main(String[] args) {
        String s = (args[0]);
        int n = Integer.parseInt(args[1]);
        if (n <= 0) {
            System.err.println("Please insert a word");
            System.exit(1);
        }
        String Result = decayingPrefix(s, n);
        System.out.println(Result);
    }
}
