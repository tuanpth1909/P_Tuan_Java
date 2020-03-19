package Session4;

public class Snippet10 {
    public static void main(String[] args) {
        String day = "Monday";
        String hour = "am";

        switch (day) {
            case "Sunday":
                System.out.println("Sunday is Holiday...");

                switch (hour) {
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
                break;
            case "Monday":
                System.out.println("Monday is a Working Day...");
                switch (hour) {
                    case "am":
                        System.out.println("GoodMorning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
                break;
            default:
                System.out.println("InvalidDay");
        }
    }
}
