public class DateFactoryLabE {

    public GregorianDateLabE createDate(String month, int day, int year) throws CS112DateException {

        GregorianDateLabE newD = new GregorianDateLabE();
        newD.setDate(month, day, year);
        return newD;
    }


}
