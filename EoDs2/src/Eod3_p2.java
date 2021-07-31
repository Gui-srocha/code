public class Eod3_p2 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[0]);
        int[] a = new int[m];
        for (int c = 0; c < a.length; c++) {
            int random = (int) (Math.random() * 100);
            a[c] = random;
        }
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c] + " ");
        }
        int[] minima = new int[n];
        int sum = 0;
        for (int g = 0; g < n; g++) {
            shuffle(a);
            System.out.println();
            minima[g] = minima(a);
            System.out.println(minima[g]);
            for (int c = 0; c < a.length; c++) {
                System.out.print(a[c] + " ");
            }
        }
        for (int t = 0; t <= n - 1; t++) {
            sum += minima[t];
        }
        System.out.println();
        System.out.println("Average: " + sum / n);
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
