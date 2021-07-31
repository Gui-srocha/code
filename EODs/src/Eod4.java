public class Eod4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fizzBuzz(n));
    }

    public static String fizzBuzz(int n) {
        String fizzbuzz = "";
        for (int a = 0; a < n; a++) {
            if (a == n - 1) {
                if (a % 3 == 0 && a % 5 == 0) {
                    fizzbuzz += "fizzbuzz.";
                } else if (a % 3 == 0) {
                    fizzbuzz += "fizz.";
                } else if (a % 5 == 0) {
                    fizzbuzz += "buzz.";
                } else {
                    fizzbuzz += String.valueOf(a + ".");
                }
            } else {
                if (a % 3 == 0 && a % 5 == 0) {
                    fizzbuzz += "fizzbuzz, ";
                } else if (a % 3 == 0) {
                    fizzbuzz += "fizz, ";
                } else if (a % 5 == 0) {
                    fizzbuzz += "buzz, ";
                } else {
                    fizzbuzz += String.valueOf(a + ", ");
                }
            }
        }
        return fizzbuzz;
    }
}
