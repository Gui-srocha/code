public class EoD14 {

    public static void main(String[] args) {
        String x = (args[0]);
        if (x.length() == 0) {
            System.err.println("Please, insert a word for the program to work");
            System.exit(1);
        }
        System.out.println(starSandwich(x));

    }

    public static boolean starSandwich(String x) {
        int length = x.length();
        boolean z = true;
        int a = 0;
        if (x.charAt(0) == '*' || x.charAt(length - 1) == 'x') {
            System.err.println("Please, insert a valid word");
            System.exit(1);
        }
        while (a < length) {
            if (x.charAt(a) == '*') {
                char CharBefore = x.charAt(a - 1);
                char CharAfter = x.charAt(a + 1);
                if (CharBefore == CharAfter) {
                    a += 1;

                } else {
                    return !z;


                }

            } else {
                a += 1;


            }
        }

        return z;
    }

}
