public class MyDateTest2 {
    public static void main(String[] args) {
        MyDate2 date = new MyDate2();

        date.setYear(2018);
        date.setMonth(2);
        date.setDay(31);

        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
    }
}