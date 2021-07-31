public class ScaledPalindrome {
    public static void main(String[] args) {
        int[] arr = {2, 3, 24, 16};
        int i = 8;
        boolean a = scaledPalindrome(i, arr);
        System.out.println(a);
        System.out.println(findX(arr));
    }

    public static boolean scaledPalindrome(int x, int[] z) {
        // error statement for x = 0
        if (x == 0) {
            System.err.println("The value of x cannot be zero");
            System.exit(1);
        }
        //if statement for array of size 0
        if (z.length == 0) {
            return true;
        }
        //if statement for a array of size 1
        if (z.length == 1 && z[0] == x) {
            return true;
        }
        //For loop that checks if the palindrome is true for all numbers in the array
        for (int index = 0; index < z.length / 2; index++) {
            if (z[z.length - 1 - index] / z[index] == x) {
                continue;
            } else if (z[z.length - 1 - index] / z[index] != x) {
                return false;
            }
        }

        return true;
    }

    public static int findX(int[] z) {
        if (z.length == 1) {
            return z[0];
        }
        int x = z[z.length - 1] / z[0];
        for (int index = 0; index < z.length / 2; index++) {
            if (z[z.length - 1 - index] / z[index] == x) {
                continue;
            } else if (z[z.length - 1 - index] / z[index] != x) {
                return 0;
            }
        }
        return x;
    }

}
