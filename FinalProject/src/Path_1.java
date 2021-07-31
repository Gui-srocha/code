import java.awt.event.KeyEvent;

public class Path_1 {
    public static void begin() {
        //The path of the forest
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You enter the forest, the trees shelter you from the rain");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "However, it's so dark you can barely see around you");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You hear what seems to be some movement behind you");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Instinctively, you start walking faster, as far away as you can");
        StdDraw.pause(4000);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "(To escape, keep pressed the buttons that appear on the screen)");
        StdDraw.pause(4000);
        StdDraw.clear();
        for (int i = 0; i < 100; i++) {
            int random1 = 20 + (int) (Math.random() * 100);
            int random2 = 20 + (int) (Math.random() * 100);
            int random3 = 20 + (int) (Math.random() * 100);
            int random4 = 20 + (int) (Math.random() * 100);
            int random5 = 20 + (int) (Math.random() * 100);
            String a1 = KeyEvent.getKeyText(random1);
            String a2 = KeyEvent.getKeyText(random2);
            String a3 = KeyEvent.getKeyText(random3);
            String a4 = KeyEvent.getKeyText(random4);
            String a5 = KeyEvent.getKeyText(random5);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(0.5, 0.5, 0.5);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.text(0.5, 0.5, a1);
            StdDraw.pause(4000);
            if (StdDraw.isKeyPressed(random1)) {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.5, a2);
                StdDraw.pause(4000);
                if (StdDraw.isKeyPressed(random2)) {
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.filledSquare(0.5, 0.5, 0.5);
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.text(0.5, 0.5, a3);
                    StdDraw.pause(4000);
                    if (StdDraw.isKeyPressed(random3)) {
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.filledSquare(0.5, 0.5, 0.5);
                        StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.text(0.5, 0.5, a4);
                        StdDraw.pause(4000);
                        if (StdDraw.isKeyPressed(random4)) {
                            StdDraw.setPenColor(StdDraw.BLACK);
                            StdDraw.filledSquare(0.5, 0.5, 0.5);
                            StdDraw.setPenColor(StdDraw.WHITE);
                            StdDraw.text(0.5, 0.5, a5);
                            StdDraw.pause(4000);
                            if (StdDraw.isKeyPressed(random5)) {
                                succeed();
                            } else {
                                fail();
                            }
                        } else {
                            fail();
                        }
                    } else {
                        fail();
                    }
                } else {
                    fail();
                }
            } else {
                fail();
            }
        }
        no_object();
    }

    public static void no_object() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You feel like whatever was following you, stopped.the forest gets less dense");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "After some time walking, the forest gets less dense");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You see the town, now much closer than before");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "As soon as you start walking again, however, the noise comes back");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "This time something is coming, faster than before");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Without thinking twice, you start running");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "(To escape, keep pressed the buttons that appear on the screen)");
        StdDraw.pause(4000);
        StdDraw.clear();
        for (int i = 0; i < 30; i++) {
            int random1 = 20 + (int) (Math.random() * 100);
            int random2 = 20 + (int) (Math.random() * 100);
            int random3 = 20 + (int) (Math.random() * 100);
            int random4 = 20 + (int) (Math.random() * 100);
            int random5 = 20 + (int) (Math.random() * 100);
            String a1 = KeyEvent.getKeyText(random1);
            String a2 = KeyEvent.getKeyText(random2);
            String a3 = KeyEvent.getKeyText(random3);
            String a4 = KeyEvent.getKeyText(random4);
            String a5 = KeyEvent.getKeyText(random5);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(0.5, 0.5, 0.5);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.text(0.5, 0.5, a1);
            StdDraw.pause(4000);
            if (StdDraw.isKeyPressed(random1)) {
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.5, a2);
                StdDraw.pause(4000);
                if (StdDraw.isKeyPressed(random2)) {
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.filledSquare(0.5, 0.5, 0.5);
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.text(0.5, 0.5, a3);
                    StdDraw.pause(4000);
                    if (StdDraw.isKeyPressed(random3)) {
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.filledSquare(0.5, 0.5, 0.5);
                        StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.text(0.5, 0.5, a4);
                        StdDraw.pause(4000);
                        if (StdDraw.isKeyPressed(random4)) {
                            StdDraw.setPenColor(StdDraw.BLACK);
                            StdDraw.filledSquare(0.5, 0.5, 0.5);
                            StdDraw.setPenColor(StdDraw.WHITE);
                            StdDraw.text(0.5, 0.5, a5);
                            StdDraw.pause(4000);
                            if (StdDraw.isKeyPressed(random5)) {
                                succeed();
                            } else {
                                fail();
                            }
                        } else {
                            fail();
                        }
                    } else {
                        fail();
                    }
                } else {
                    fail();
                }
            } else {
                fail();
            }
        }
    }

    public static void succeed() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You were able to run away somehow");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You finally arrive in town");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Although relieved, you cannot but wonder what happened there");
        StdDraw.pause(4000);
        StdDraw.clear();
    }

    public static void fail() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "GAME OVER");
        StdDraw.pause(4000);
        System.exit(0);
    }
}
