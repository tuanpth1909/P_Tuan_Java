package Java_12;

public class TestTime {
    public static void main(String[] args) {
        //Test Constructor
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);
        Time t2 = new Time();
        System.out.println(t2);

        //Test set and get
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println("Hour is:" + t1.getHour());
        System.out.println("Minute is:" + t1.getMinute());
        System.out.println("Hour is:" + t1.getSecond());

        //Test setTime
        t1.setTime(58, 59, 23);
        System.out.println(t1);

        //Test nextSecond() and chaining
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
