public class Practice8 {

    public static boolean ToOrder(int a, int b, int c, int d) {

        return (a > d) && (b > c) && (a > b);

    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        System.out.println(ToOrder(a, b, c, d));
    }

}
