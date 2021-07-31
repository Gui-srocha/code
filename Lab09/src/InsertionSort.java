public class InsertionSort {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (args.length != 1 || n < 0) {
            System.err.println("Please, insert only one positive integer");
            System.exit(1);
        }
        StdDraw.setYscale(0, n);
        StdDraw.setXscale(0, n);
        Value[] values = new Value[n];
        for (int i = 0; i < values.length; i++) {
            int j = (int) (Math.random() * n);
            values[i] = new Value(j);
        }
        int min = values[0].getValue();
        for (int i = 0; i < values.length; i++) {
            min = Math.min(min, values[i].getValue());
        }
        int max = values[0].getValue();
        for (int i = 0; i < values.length; i++) {
            max = Math.max(max, values[i].getValue());
        }
        values[min].setSound(440);
        for (int i = 0; i < values.length; i++) {
            int x = values[i].getValue();
            int hz = (int) (440 * Math.pow(2, (x - min) / 12.0));
            values[i].setSound(hz);
        }
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(n / 2, n / 2, n / 2);
        double p = 0.5;
        for (int i = 0; i < values.length; i++) {
            StdDraw.setPenColor(StdDraw.GREEN);
            values[i].draw(p, 0);
            StdAudio.play(values[i].getSound());
            p += 1.0;
        }
        for (int i = 0; i < n; i++)
            for (int j = i; j > 0; j--) {
                if (values[j - 1].compareTo(values[j]) > 0) {
                    double x = 0.5;
                    for (int o = 0; o < values.length; o++) {
                        if (o == j) {
                            StdDraw.setPenColor(StdDraw.YELLOW);
                        } else {
                            StdDraw.setPenColor(StdDraw.GREEN);
                        }
                        values[o].draw(x, 0);
                        StdAudio.play(values[o].getSound());
                        x += 1.0;
                    }
                    Value tmp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = tmp;
                    StdDraw.clear();
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(n / 2, n / 2, n / 2);
                }
            }
    }
}

