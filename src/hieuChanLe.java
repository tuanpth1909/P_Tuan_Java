import java.awt.desktop.SystemEventListener;

public class hieuChanLe {
    public static void main(String[] args) {
        int lowerbround = 1, upperbround = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;


        int number = lowerbround;
        while (number <= upperbround){
            if(number % 2 == 0){
                sumEven += number;
            }
            else{
                sumOdd += number;
            }
            ++number;
        }
        if(sumEven > sumOdd){
            absDiff = sumEven - sumOdd;
        }
        else{
            absDiff = sumOdd - sumEven;
        }
        System.out.println("The sum of odd numbers from " + lowerbround + " to " + upperbround + " is: " + sumOdd);
        System.out.println("The sum of even numbers from " + lowerbround + " to " + upperbround + " is: " + sumEven);
        System.out.println("The absolute difference betwen the two sums is: " + absDiff);
    }
}
