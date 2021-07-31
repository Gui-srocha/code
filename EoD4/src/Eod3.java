public class Eod3 {
    public static void main(String[] args) {
        for (int i = 0; i < args[0].length(); i++) {
            if (args[0].charAt(i) == 'g') {
                break;
            }
            if (i == args[0].length() - 1 && args[0].charAt(i) != 'g') {
                System.err.println("The word needs to have at least one 'g'.");
                System.exit(1);
            }
        }
        System.out.println(gHappy(args[0]));
    }

    public static boolean gHappy(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (i == 0) {
                if (a.charAt(i) == 'g' && a.charAt(i + 1) != 'g') {
                    return false;
                } else {
                    continue;
                }
            }
            if (i == a.length() - 1) {
                if (a.charAt(i) == 'g' && a.charAt(i - 1) != 'g') {
                    return false;
                } else {
                    break;
                }
            }
            if (i > 0 && a.charAt(i) == 'g' && a.charAt(i + 1) != 'g' && a.charAt(i - 1) != 'g') {
                return false;
            }
        }
        return true;
    }
}
