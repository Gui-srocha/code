public class SoundTrack {
    private double[] Title_Sound = new double[10];
    private int[] hz = new int[10];

    public void Soundtrack() {
    }

    public void setTitle_Sound() {
        hz[0] = 550;
        hz[1] = 670;
        hz[2] = 350;
        hz[3] = 870;
        hz[4] = 750;
        hz[5] = 270;
        hz[6] = 150;
        hz[7] = 270;
        hz[8] = 150;
        hz[9] = 270;
        for (int i = 0; i < this.Title_Sound.length; i++) {
            this.Title_Sound[i] = Math.sin(2 * Math.PI * i * hz[i] / 44100);
        }
    }

    public double[] getTitle_Sound() {
        return Title_Sound;
    }
}
