public class Eod3 {
    public static void main(String[] args) {
        int g = Integer.parseInt(args[0]);
        int[] a = new int[g];
        for (int c = 0; c < a.length; c++) {
            int random = (int) (Math.random() * 100);
            a[c] = random;
        }
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c] + " ");
        }
        shuffle(a);
        System.out.println();
        System.out.println(minima(a));
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c] + " ");
        }
    }

    public static void shuffle(int[] deck) {
        for (int src = 0; src < deck.length - 1; src++) {
            int dest = src + (int) (Math.random() * (deck.length - src));
            int tmp = deck[dest];
            deck[dest] = deck[src];
            deck[src] = tmp;
        }
    }

    public static int minima(int[] deck) {
        int minimavalue = deck[0];
        int minima = 0;
        for (int src = 0; src < deck.length - 1; src++) {
            if (deck[src] < minimavalue) {
                minimavalue = deck[src];
                minima++;
            }
        }
        return minima;
    }
}
