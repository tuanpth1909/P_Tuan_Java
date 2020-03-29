package NEW;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
//        System.out.println("Vui long nhap cac gia tri a b c:");
//        Scanner nhap = new Scanner(System.in);
//
//        double a = nhap.nextDouble();
//        double b = nhap.nextDouble();
//        double c = nhap.nextDouble();
//
//        if (a == 0){
//            System.out.println("Phuong trinh co nghiem la" + (-c/b));
//        }else {
//              double denta = b*b - 4*a*c;
//
//              if(denta > 0){
//                  System.out.println("Phuong trinh vo nghiem");
//              }else if(denta == 0){
//                  double x = -b/2*a;
//                  System.out.println("Phuong trinh co nghiem kep la" + x);
//            }else if(denta > 0){
//                  double x1 = (-b - Math.sqrt(denta)) / 2*a;
//                  double x2 = (-b + Math.sqrt(denta)) / 2*a;
//                  System.out.println("Phuong trinh co 2 nghiem la:");
//                  System.out.println("x1 = " + x1);
//                  System.out.println("x2 = " + x2);
//            }
//        }

        System.out.println("Vui long nhap cac gia tri a b c:");
        Scanner nhap = new Scanner(System.in);

        double a = nhap.nextDouble();
        double b = nhap.nextDouble();
        double c = nhap.nextDouble();

        if (a == 0){
            System.out.println("Phuong trinh co nghiem la: " + -c/b);
        }else{
            double delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if(delta == 0){
                double x = -b/2*a;
                System.out.println("Phuong trinh co nghiem kep x:" + -b/2*a);
            }else{
                double x1 = (-b - Math.sqrt(delta)) / 2*a;
                double x2 = (-b + Math.sqrt(delta)) / 2*a;
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
