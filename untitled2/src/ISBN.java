public class ISBN {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int f = Integer.parseInt(args[5]);
        int g = Integer.parseInt(args[6]);
        int h = Integer.parseInt(args[7]);
        int i = Integer.parseInt(args[8]);
        int j = 0;
        while (((10 * a) + (9 * b) + (8 * c) + (7 * d) + (6 * e) + (5 * f) + (4 * g) + (3 * h) + (2 * i) + (j)) % 11 != 0) {
            j += 1;
            if (((10 * a) + (9 * b) + (8 * c) + (7 * d) + (6 * e) + (5 * f) + (4 * g) + (3 * h) + (2 * i) + (j)) % 11 == 0) {
                System.out.print(a);
                System.out.print(b);
                System.out.print(c);
                System.out.print(d);
                System.out.print(e);
                System.out.print(f);
                System.out.print(g);
                System.out.print(h);
                System.out.print(i);
                System.out.println(j);
                
            }
        }

    }
}
