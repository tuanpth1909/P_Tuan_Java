package com.company;

import java.util.Scanner;

public class TaoMENU {
    public static void main(String[] args) {
        Scanner nhap =new Scanner(System.in);

        System.out.println("Vui long chon cai ban muon:");
        System.out.println("1- Tinh chu vi va dien tich HCN");
        System.out.println("2- Tinh chu vi va dien tich HV");

        int x = nhap.nextInt();

        switch (x){
            case 1:
                int chieuDai = 10;
                int chieuRong = 30;
                int chuViHCN = HinhChuNhat.chuVi(chieuDai, chieuRong);
                System.out.println("Chu vi hinh chu nhat la:" + chuViHCN);
                int dienTichHCN = HinhChuNhat.dienTich(chieuDai, chieuRong);
                System.out.println("Dien tich hinh chu nhat la:" + dienTichHCN);
                break;
            case 2:
                int canhVuong = 50;
                int chuViHV = HinhVuong.chuVi(canhVuong);
                System.out.println("Chu vi hinh vuong la:" + chuViHV);
                int dienTichHV = HinhVuong.dienTich(canhVuong);
                System.out.println("Dien tich hinh vuong la: " + dienTichHV);
                break;
        }
        System.out.println("Ket thuc");
    }
}
