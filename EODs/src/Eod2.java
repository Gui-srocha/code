public class Eod2 {
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[0]);
        int[][] a = new int[rows][cols];
        for (int b = 0; b < rows; b++) {
            for (int c = 0; c < cols; c++) {
                int random = (int) (Math.random() * 20);
                a[b][c] = random;
            }
        }
        for (int b = 0; b < rows; b++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(a[b][c] + " ");
            }
            System.out.println();
        }
        for (int b = 0; b < rows; b++) {
            for (int c = 0; c < cols; c++) {
                int temp;
                temp = a[b][c];
                a[b][c] = a[c][b];
                a[c][b] = temp;
            }
        }
        System.out.println();
        for (int b = 0; b < rows; b++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(a[b][c] + " ");
            }
            System.out.println();
        }
    }
}
