package Session4;

import java.util.Scanner;

public class Snippet5 {
    public static void main(String[] args) {
       // int totalMarks = 59;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a totalMarks: ");
        int totalMarks = input.nextInt();
      //  int num = input.nextInt();

        if(totalMarks >= 90){
            System.out.println("Grade = A+");
        }
        else if(totalMarks >= 60){
            System.out.println("Grade = A");
        }
        else if(totalMarks >=40){
            System.out.println("Grade = B");
        }
        else if(totalMarks >= 30){
            System.out.println("Grade = C");
        }else{
            System.out.println("Fail");
        }
    }
}
