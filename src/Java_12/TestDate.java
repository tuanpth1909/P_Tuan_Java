package Java_12;

public class TestDate {
    public static void main(String[] args) {
        //Kiem tra constructor
        Date d1 = new Date(2016, 4, 6);
        System.out.println(d1);

        //Kiem tra qua set and get
        d1.setYear(2012);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println("Year is:" + d1.getYear());
        System.out.println("Month is:" + d1.getMonth());
        System.out.println("Day is:" + d1.getDay());

        //Kiem tra ham set all date
        d1.setDate(2, 1, 2988);
        System.out.println(d1);
    }
}
