package JAVA2_492020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names :" +names);

        //Sắp xếp một ArrayList bằng phương thức sort () của nó. bạn phải truyền một Trình so sánh cho phương thức ArrayList.sort ()
        names.sort((name1, name2) -> name1.compareTo(name2));

        //sau đây là một giải pháp ngắn gọn hơn
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted Names:" + names);
    }
}
