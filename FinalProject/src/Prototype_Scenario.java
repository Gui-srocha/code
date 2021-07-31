public class Prototype_Scenario {

    public static void begin() {
        SoundTrack[] Title_Sound = new SoundTrack[10];
        for (int i = 0; i < Title_Sound.length; i++) {
            Title_Sound[i] = new SoundTrack();
        }
        for (int i = 0; i < Title_Sound.length; i++) {
            Title_Sound[i].setTitle_Sound();
        }
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You have just experienced a car crash");
        StdDraw.text(0.5, 0.45, "It is raining. The car span out of the road and fell down a small hill");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "You have no idea how you survived.");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Disoriented, you look around you but can't see much. ");
        StdDraw.text(0.5, 0.45, "You can't find your cellphone either.");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Trying to find shelter, you start running");
        StdDraw.text(0.5, 0.45, "After a few minutes, you see light and what seems to be a town");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "The rain makes it impossible to go back to the road.");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "Between you and the town, a dense forest.");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.5, 0.5, "With no other option left, you go in.");
        StdDraw.pause(4000);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.setYscale(0, 0.5);
        StdDraw.setXscale(0, 0.5);
        StdDraw.text(0.25, 0.25, "JOGUINHO DE MEDO DO GUILHERME");
        StdDraw.text(0.25, 0.2, "Press your mouse to start");
        StdDraw.pause(3000);
        //supposed to play a sound indicating that the game is starting
        /*while (!StdDraw.isKeyPressed(80)) {
            int i = 0;
            StdAudio.play(Title_Sound[i].getSound());
            i++;
            if (i == 10) {
                i = 0;
            }
        }*/
        for (int j = 0; j >= 0; j++) {
            for (int i = 0; i < 10; i++) {
                StdAudio.play(Title_Sound[i].getTitle_Sound());
            }
            if (StdDraw.isMousePressed()) {
                StdDraw.setYscale(0, 1);
                StdDraw.setXscale(0, 1);
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.5, "After walking a bit through the forest, the rain stops");
                StdDraw.pause(4000);
                StdDraw.clear();
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.5, "Being able to see more clearly, you analyze your surroundings");
                StdDraw.pause(4000);
                StdDraw.clear();
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.5, " You then realize there are three paths you can follow");
                StdDraw.pause(4000);
                StdDraw.clear();
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.5, "You can go deeper into the forest, towards the town");
                StdDraw.pause(4000);
                StdDraw.clear();
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.5, "towards a small shack");
                StdDraw.pause(4000);
                StdDraw.clear();
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.5, "or towards a glade");
                StdDraw.pause(4000);
                StdDraw.clear();
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(0.5, 0.5, 0.5);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.text(0.5, 0.8, "Where do you head towards?");
                StdDraw.text(0.2, 0.5, "SHACK");
                StdDraw.text(0.5, 0.5, "TOWN");
                StdDraw.text(0.8, 0.5, "GLADE");
                StdDraw.text(0.2, 0.45, "press a");
                StdDraw.text(0.5, 0.45, "press b");
                StdDraw.text(0.8, 0.45, "press c");
                StdDraw.pause(6500);
                for (int i = 0; i >= 0; i++) {
                    if (StdDraw.isKeyPressed(65)) {
                        Path_2.begin();
                    }
                    if (StdDraw.isKeyPressed(66)) {
                        Path_1.begin();
                    }
                    if (StdDraw.isKeyPressed(67)) {
                        Path_3.begin();
                    }
                }
            }
        }
    }
}

