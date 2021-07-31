import java.awt.event.KeyEvent;

public class Path_2 {
    public static void begin() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You go towards the shack");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You look inside one of the windows and see nothing");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You see a wooden door that seems to be unlocked");
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
        StdDraw.text(0.5, 0.5, "You are worried that it might be some sort of animal");
        StdDraw.pause(4000);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.8, "What do you do?");
        StdDraw.text(0.2, 0.5, "RUN");
        StdDraw.text(0.8, 0.5, "HIDE");
        StdDraw.text(0.2, 0.45, "press a");
        StdDraw.text(0.8, 0.45, "press b");
        StdDraw.pause(4000);
        for (int i = 0; i >= 0; i++) {
            if (StdDraw.isKeyPressed(65)) {
                RUN();
            }
            if (StdDraw.isKeyPressed(66)) {
                HIDE();
            }
        }
    }

    public static void RUN() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You run as fast as you can, without looking back");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You feel something coming after you");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "There is not much light, so you can't see what is after you");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "But, whatever it is, is not good");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "(To escape, keep pressed the buttons that appear on the screen)");
        StdDraw.pause(4000);
        StdDraw.clear();
        for (int i = 0; i < 50; i++) {
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
                                succeed_RUN();
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

    public static void HIDE() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Without thinking twice, you enter the shack");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You search for somewhere to hide, and goes under the bed");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You hear something coming inside");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You try to be silent, and control your breathing");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "(To hide, keep pressed the buttons that appear on the screen)");
        StdDraw.pause(4000);
        StdDraw.clear();
        for (int i = 0; i < 50; i++) {
            int random1 = (int) (Math.random() * 100);
            int random2 = (int) (Math.random() * 100);
            int random3 = (int) (Math.random() * 100);
            int random4 = (int) (Math.random() * 100);
            int random5 = (int) (Math.random() * 100);
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
                                succeed_HIDE();
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

    public static void succeed_RUN() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You were able to run away somehow");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You have delved deeper into the forest");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "With no idea of where you are, you keep walking");
        StdDraw.pause(4000);
        StdDraw.clear();
    }

    public static void succeed_HIDE() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Whatever it was, it goes away");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Not feeling safe to leave, you decide to stay inside");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You use whatever you can to barricade the door");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "It is going to be a long night...");
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

