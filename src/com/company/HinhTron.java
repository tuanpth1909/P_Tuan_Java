package com.company;

public class HinhTron {
    //khai bao hang so PI
    public static final float SO_PI = 3.14f;
    //Ham tinh chu vi hinh tron
    public static float chuViHinhTron(float bankinh){
        return 2 * bankinh * SO_PI;
    }
    //Ham tinh dien tich hinh tron
    public static float dienTichHinhTron(float bankinh){
        return bankinh*bankinh*SO_PI;
    }
}

