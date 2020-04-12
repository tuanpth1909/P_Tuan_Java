package JAVA2_492020;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial list: " + programmingLanguages);

        programmingLanguages.remove(5);
        System.out.println("After remove(5):" + programmingLanguages);

        boolean isRemove = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(5): " + programmingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
       // System.out.println("After removeAll(scriptingLanguages"):" + programmingLanguages);
        System.out.println("After removeAll(scriptingLanguages):" + programmingLanguages);

        programmingLanguages.removeIf(n -> (n.charAt(0) == 'T'));

        System.out.println("After Removing all elements that start with \"C\": " + programmingLanguages);
        programmingLanguages.clear();
        System.out.println("After clear():" + programmingLanguages);

    }
}
