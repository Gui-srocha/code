// Benjamin Newman, Guilherme Santos Rocha
public class Lab1 {

    // The variable timesCalled will always contain the number of times the button has been
    // pushed, so it will be 1 the first time this method is called, 2 the second time, etc.
    int timesCalled = 0;

    public void process(int timesCalled) {

        // get the red, green and blue pixel values of image 0 (the first image on the screen

        int[][] red = Images.getRed(0);
        int[][] blue = Images.getBlue(0);
        int[][] green = Images.getGreen(0);

        int imageHeight = red.length;
        int imageWidth = red[0].length;

        System.out.println("There are " + imageHeight + " rows and " + imageWidth + " columns");

        if (timesCalled == 1) {
            // This happens the first time the button is pushed

            // declare new arrays for red, green and blue values for new image,
            // allocate new ones for blue and green (do red later)


            int[][] newblue = new int[imageHeight][imageWidth];
            int[][] newgreen = new int[imageHeight][imageWidth];
            int[][] newred;

            for (int row = 0; row < imageHeight; row++) {
                for (int column = 0; column < imageWidth; column++) {
                    newgreen[row][column] = green[row][column];
                    newblue[row][column] = blue[row][column];

                }

            }

            newred = tintRed(red, imageHeight, imageWidth);


            redStripe(imageWidth, newblue, newgreen, newred);

            // add this new image as image 1 on the screen (the second image)
            Images.setImage(newred, newgreen, newblue, 1);
            //code to paint the 20th row
            for (int x = 0; x < imageWidth; x++) {
                newblue[20][x] = 0;
                newgreen[20][x] = 0;
                newred[20][x] = 0;
            }
            //code to change the 10th column
            for (int x = 0; x < imageHeight; x++) {
                newblue[x][10] = 255;
                newgreen[x][10] = 255;
                newred[x][10] = 255;
            }
        } else if (timesCalled == 2) {
            // code for timesCalled == 2 (second button push)
            imageHeight = changeSize1(imageHeight);
            imageWidth = changeSize1(imageWidth);
        } else {
            // code for timesCalled greater than 2	}
            imageHeight = changeSize2(imageHeight) / 2;
            imageWidth = changeSize2(imageWidth) / 2;
        }
    }

    private void redStripe(int imageWidth, int[][] newblue, int[][] newgreen, int[][] newred) {
        for (int row = 100; row < 120; row++) {
            for (int column = 0; column < imageWidth; column++) {
                newred[row][column] = 255;
                newgreen[row][column] = 0;
                newblue[row][column] = 0;
            }
        }
    }

    private int[][] tintRed(int[][] red, int imageHeight, int imageWidth) {
        int[][] newred = new int[imageHeight][imageWidth];
        for (int row = 0; row < imageHeight; row++) {
            for (int column = 0; column < imageWidth; column++) {
                newred[row][column] = red[row][column] + (255 - red[row][column]) / 2;
            }
        }
        return newred;
    }

    private int changeSize1(int x) {
        x = x / 3;
        return x;
    }

    private int changeSize2(int x) {
        x = x * 2;
        return x;
    }

}
