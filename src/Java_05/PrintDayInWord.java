package Java_05;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so ma ban muon biet la thu may (1-7)");
        int date = nhap.nextInt();

        if (date == 1) {
            System.out.println("This day is Sunday!");
        } else
            if (date == 2) {
            System.out.println("This day is Monday!");
        } else if (date == 3) {
            System.out.println("This day is Tuesday!");
        } else if (date == 4) {
            System.out.println("This day is Wednesday!");
        } else if (date == 5) {
            System.out.println("This day is Thursday!");
        } else if (date == 6) {
            System.out.println("This day is Friday!");
        } else if (date == 7) {
            System.out.println("This day is Saturday!");

    }
    }
}
