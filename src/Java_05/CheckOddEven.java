package Java_05;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so ma ban muon kiem tra:");
        int so = nhap.nextInt();

        if( so % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
        System.out.println("Say Good Bye!");
    }
}
