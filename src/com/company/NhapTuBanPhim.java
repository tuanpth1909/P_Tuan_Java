package com.company;

import java.util.Scanner;

public class NhapTuBanPhim {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Vui long nhap x:");
        int x = nhap.nextInt();
        System.out.println("Gia tri cua x la: " + x);

        //tinh tong voi tham so nhap tu ban phim
        System.out.println("Vui long nhap x va y");
        long y = nhap.nextLong();
        float d = nhap.nextFloat();

        float tong = y + d;
        System.out.println("Tong cua x va y la:" + tong);
    }
}
