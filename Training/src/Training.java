public class Training {
    public static void main(String[] args) {

    }

    public static int ackermann(int m, int n) {
        if (m < 0 || n < 0) {
            System.err.println("Please, insert only positive values");
            System.exit(1);
        }
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static boolean balanced(String s) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            }
            if (s.charAt(i) == ')') {
                close++;
            }
        }
        if (open != close) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {

            } else if (s.charAt(i) == ')') {

            }
        }
        return true;
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] % 2 == 0) {
                    if (arr[j] % 2 == 0) {
                        if (arr[j - 1] > arr[j]) {
                            // Swap
                            int tmp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = tmp;
                        } else // We found the correct place for the element in the
                            // sorted prefix from 0 up to i (included)
                            break;
                    }
                    if (arr[j] % 2 != 0) {
                        int tmp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = tmp;
                    }
                }
                if (arr[j - 1] != 0) {
                    if (arr[j] == 0) {
                        break;
                    }
                    if (arr[j] != 0) {
                        if (arr[j - 1] > arr[j]) {
                            // Swap
                            int tmp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = tmp;
                        }
                    }
                }
            }
        }
    }
