public class EoD16 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String a = "*";
        String b = " ";
        if (n <= 0 || args.length != 1) {
            System.err.println("Please insert a valid number of lines");
            System.exit(1);
        }
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                int I = 0;
                while (I < n) {
                    System.out.print(a);
                    I += 1;
                    if (I < n) {
                        System.out.print(b);
                        I += 1;
                    }
                    if (I >= n) {
                        I += 1;
                        System.out.println();
                    }
                }
                I = 0;
            } else {
                int K = 0;
                while (K < n) {
                    System.out.print(b);
                    K += 1;
                    if (K < n) {
                        System.out.print(a);
                        K += 1;
                    }
                    if (K >= n) {
                        K += 1;
                        System.out.println();
                    }
                }
                K = 0;
            }
        }
    }
}
