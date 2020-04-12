package JAVA2_492020;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");


        //Kiem tra xem Mang c chua phan tu da cho hay khong
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));

        //tìm chỉ mục xuất hiện đầu tiên của một phần tử trong ArrayList
        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " +names.indexOf("Mark"));

        //tìm chỉ mục xuất hiện cuổi của một phần tử trong ArrayList
        System.out.println("lastIndexOf \"John\": " + names.lastIndexOf("John"));
        System.out.println("LastIndexOf \"Bill\": " + names.lastIndexOf("Bill"));
    }
}
