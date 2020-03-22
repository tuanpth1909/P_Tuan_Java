package Java_05;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so ma ban muon so sanh:");
        int x = nhap.nextInt();

        if(x >= 50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
