public class Eod {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }

    public static double factorial(int n) {
        if (n == 1) {
            return 0;
        }
        return factorial(n - 1) + Math.log(n);
    }
}
