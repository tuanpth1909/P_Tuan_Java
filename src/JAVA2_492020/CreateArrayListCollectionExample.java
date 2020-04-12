package JAVA2_492020;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListCollectionExample {
    public static void main(String[] args) {
        List<Integer> firtsFivePrimeNumber = new ArrayList<>();
        firtsFivePrimeNumber.add(29);
        firtsFivePrimeNumber.add(3);
        firtsFivePrimeNumber.add(2020);
        firtsFivePrimeNumber.add(30);
        firtsFivePrimeNumber.add(5);
        firtsFivePrimeNumber.add(2017);

        //Tao mot mang moi CREATE AN ARRAYLIST FROM ANOTHER COLLECTION

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firtsFivePrimeNumber);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(8);
        nextFivePrimeNumbers.add(4);
        nextFivePrimeNumbers.add(2001);

        List<Integer> thenPrimeNumbers = new ArrayList<>(firstTenPrimeNumbers);
        thenPrimeNumbers.add(15);
        thenPrimeNumbers.add(3);
        thenPrimeNumbers.add(2001);

        //Adding an entire collectiion to an ArraayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        firstTenPrimeNumbers.addAll(thenPrimeNumbers);
        System.out.println(firstTenPrimeNumbers);
    }
}
