package JAVA2_492020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47));
        people.add(new Person("Chris", 34));
        people.add(new Person("Rajeev", 25));
        people.add(new Person("David", 31));

        System.out.println("Person List: " + people);

        //Sắp xếp mọi người theo độ tuổi của họ
        people.sort((person1, person2) ->{
            return person1.getAge() - person2.getAge();
        });

        //Một cách ngắn gọn hơn để viết chức năng sắp xếp ở trên
        people.sort(Comparator.comparing(Person::getAge));
        System.out.println("Sorted Person List bt Age : " + people);

        //Bạn cũng có thể sắp xếp bằng phương thức Collections.sort () bằng cách chuyển Trình so sánh tùy chỉnh
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name: " + people);
    }
}
