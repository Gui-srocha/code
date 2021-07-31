public class Practice {
    public static boolean ToOrder(int a) {
        boolean DogIsBarking;
        double b = Math.random();
        DogIsBarking = b >= 0.5;
        boolean Trouble;
        if ((8 <= a) && (22 >= a) && (DogIsBarking)) {
            Trouble = true;

        } else {
            Trouble = false;

        }
        return Trouble;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        if (ToOrder(a)) {
            System.out.println("You're in trouble");
        } else {
            System.out.println("You're safe");
        }
        System.out.println(22);

    }
}

