public class Pattern {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 2 || args.length != 1) {
            System.err.println("Please, insert one integer greater or equal to two");
            System.exit(1);
        }

        int K = 0;
        int J = 0;
        for (int g = (size - 3) / 2; g > 0; g--) {
            for (int z = 0; z < size; z++) {
                for (; K < size; K++) {
                    System.out.print("-");
                }
                if (K == size) {
                    System.out.println();
                    K++;
                }
                if (z % 2 == 0) {
                    System.out.print("|");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int o = 0; o < size; o++) {
            if (o == (size / 2)) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        for (int d = (size - 3) / 2; d > 0; d--) {
            for (int c = 0; c < size; c++) {

                if (c % 2 == 0) {
                    System.out.print("|");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (; J < size; J++) {
            System.out.print("-");
        }
    }
}
