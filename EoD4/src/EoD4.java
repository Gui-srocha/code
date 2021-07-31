public class EoD4 {
    public static void main(String[] args) {
        System.out.println(parenBit(args[0]));
    }

    public static String parenBit(String s) {
        int begin = 0;
        int end = 0;
        int parenthesis = 0;
        String g = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                parenthesis++;
            }
        }
        if (parenthesis > 2 || parenthesis == 1) {
            System.err.println("The word needs to have a single set of parenthesis at maximum");
            System.exit(1);
        }
        if (parenthesis == 0) {
            return null;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                begin = i;
            }
            if (s.charAt(i) == ')') {
                end = i + 1;
                g = s.substring(begin, end);
            }
        }
        return g;
    }
}
