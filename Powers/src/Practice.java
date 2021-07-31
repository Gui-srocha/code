public class Practice {
    public static void main(String[] args) {
        boolean[][] a = new boolean[5][5];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (; k < 5; k++) {
                System.out.print(a[k][i] + " ");
            }
            System.out.println();
            k = 0;
        }
    }
}

