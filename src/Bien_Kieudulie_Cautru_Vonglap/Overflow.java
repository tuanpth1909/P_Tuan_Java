package Bien_Kieudulie_Cautru_Vonglap;

public class Overflow {
    public static void main(String[] args) {
        int i1 = 2147483647;
        System.out.println(i1 + 1);
        System.out.println(i1 + 2);
        System.out.println(i1 + 3);
        System.out.println(i1 * 2);
        System.out.println(i1 * 1);

        System.out.println("\n");

        int i2 = -2147483647;
        System.out.println(i2 - 1);
        System.out.println(i2 - 2);
        System.out.println(i2 * i2);


    }
}
