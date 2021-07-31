public class TenHellos {
    public static void main(String[] args) {
        int number_of_hellos = Integer.parseInt(args[0]);
        int q = 1;
        while (q < number_of_hellos) {
            if (q == 1 || q % 10 == 1) {
                System.out.println(q + "st Hello");

            } else {
                if (q == 2 || q % 10 == 2) {
                    System.out.println(q + "nd Hello");
                } else {
                    if (q == 3 || q % 10 == 3) {
                        System.out.println(q + "rd Hello");
                    } else {
                        System.out.println(q + "th Hello");
                    }
                }
            }
            q += 1;
        }

    }
}
