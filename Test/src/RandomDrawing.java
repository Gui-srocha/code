public class RandomDrawing {
    public static void person(double x, double y, double radius) {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.circle(x, y, radius);
        StdDraw.line(x, (y - radius), x, (y - (radius + 0.08)));
        StdDraw.line(x, (y - (radius + 0.08)), (x + 0.005), (y - (radius + 0.13)));
        StdDraw.line(x, (y - (radius + 0.08)), (x - 0.005), (y - (radius + 0.13)));
        StdDraw.line(x, (y - (radius + 0.02)), (x - 0.03), (y + (radius + 0.02)));
        StdDraw.line(x, (y - (radius + 0.02)), (x + 0.01), (y - (radius + 0.08)));
    }


    public static void tree(double x, double y, double halflength, double halfheight) {
        StdDraw.setPenColor(StdDraw.BROWN);
        StdDraw.filledRectangle(x, y, halflength, halfheight);
        StdDraw.setPenColor(StdDraw.DARK_GREEN);
        StdDraw.filledCircle(x, (y + 0.1), 0.075);

    }

    public static void sailboat(double x, double y, double halflength, double halfheight) {
        StdDraw.setPenColor(StdDraw.BROWN);
        StdDraw.filledRectangle(x, y, halflength, halfheight);
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.filledRectangle(x, (y + halfheight + 0.05), 0.01, 0.05);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.filledRectangle(x + 0.025, (y + halfheight + 0.08), 0.025, 0.02);

    }

    public static void smileyface(double x, double y, double hl, double hh) {
        StdDraw.setPenColor(StdDraw.BROWN);
        StdDraw.filledEllipse(x, y, hl, hh);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.arc(x, y - 0.05, 0.05, 180, 0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledEllipse(x + 0.03, y + 0.06, hl / 7, hh / 7);
        StdDraw.filledEllipse(x - 0.03, y + 0.06, hl / 7, hh / 7);

    }

    public static void main(String[] args) {
        double Tree_x = Math.random();
        double Tree_y = Math.random();
        double Tree_halflength = 0.005;
        double Tree_halfheight = 0.1;
        double Person_x = Math.random();
        double Person_y = Math.random();
        double Person_radius = 0.01;
        double scared_x = Math.random();
        double scared_y = Math.random();
        double sailboat_x = Math.random();
        double sailboat_y = Math.random();
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledRectangle(0.5, 0.6, 0.5, 0.4);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledRectangle(0.5, 0.1, 0.5, 0.2);
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.filledCircle(0.8, 0.8, 0.06);
        if (Person_x < 0.2 && Person_y > 0.7) {
            //Doesn't print anything
        } else {
            if (Person_x > 0.5) {
                person(Person_x, Person_y, Person_radius);

            } else {
                person(Person_x, Person_y, Person_radius);
                person(Person_x + 0.1, Person_y, Person_radius);
                person(Person_x + 0.2, Person_y, Person_radius);

            }

        }

        if (Tree_y > 0.8) {
            //Doesn't print anything

        } else {
            if (Tree_x > 0.5 || Tree_y < 0.3) {
                tree(Tree_x + 0.1, Tree_y, Tree_halflength, Tree_halfheight);
                tree(Tree_x - 0.1, Tree_y, Tree_halflength, Tree_halfheight);
                tree(Tree_x + 0.2, Tree_y, Tree_halflength, Tree_halfheight);
                tree(Tree_x - 0.2, Tree_y, Tree_halflength, Tree_halfheight);

            } else {
                tree(Tree_x, Tree_y, Tree_halflength, Tree_halfheight);

            }
            if (scared_x < 0.2) {
                //Doesn't print anything

            } else {
                if (scared_x % 0.3 != 0) {
                    smileyface(scared_x + 0.1, scared_y, 0.1, 0.2);
                    smileyface(scared_x + 0.3, scared_y, 0.1, 0.2);
                    smileyface(scared_x + 0.5, scared_y, 0.1, 0.2);

                } else {
                    smileyface(scared_x, scared_y - 0.2, 0.1, 0.2);
                    smileyface(scared_x, scared_y + 0.2, 0.1, 0.2);
                }
            }
        }
        if (sailboat_x < 0.4 && sailboat_y > 0.5) {
            //Doesn't print anything

        } else {
            if (sailboat_x > 0.7) {
                sailboat(sailboat_x, sailboat_y, 0.06, 0.05);
                sailboat(sailboat_x - 0.2, sailboat_y, 0.06, 0.05);
                sailboat(sailboat_x - 0.4, sailboat_y, 0.06, 0.05);


            } else {
                sailboat(sailboat_x, sailboat_y, 0.06, 0.05);

            }

        }
    }
}
