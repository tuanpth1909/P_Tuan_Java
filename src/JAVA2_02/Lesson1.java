package JAVA2_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        int sum = 0;
        int n, number;
        float avgTemperature;

//        List<Integer> Temperature = new ArrayList<>();
        System.out.println("Nhiet do cua ngay la");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();

        for(int count = 1; count <= n ; count++){
            System.out.println("Nhiet do la" + count);
            number = nhap.nextInt();
            sum += number;
        }
         avgTemperature = (float) sum/n;
        System.out.println("Nhiet do trung binh la:" + avgTemperature);

    }
}
