package JAVA2_492020;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        //Check if an ArrayList is Empty
        System.out.println("Is the topCompaintes list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + "companies tn the world");
        System.out.println(topCompanies);

        //Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("SecondBest Company: " + secondBestCompany);
        System.out.println("Last Company in the list:" + lastCompany);

        //Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list:" + topCompanies);


    }
}
