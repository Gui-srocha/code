public class TestLabE {

    public static void main(String[] args) {

        new TestLabE().go();
    }

    private void go() {
        DateFactoryLabE df = new DateFactoryLabE();

        try {
            GregorianDateLabE gd = df.createDate("January", 31, 2010);
            System.out.println(gd);

            gd = df.createDate("January", 32, 2010);
            System.out.println(gd);
            System.out.println("finishing go");

        } catch (CS112DateException e) {
            System.out.println("throw exception" + e);
            e.printStackTrace();
        }

    }

}

