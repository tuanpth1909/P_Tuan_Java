package Java_15;

public class TestBook {
    public static void main(String[] args) {
        Author codeLean = new Author("Code Lean","codeleanvn@gmail.com",'f');
        System.out.println(codeLean);
        Book dummyBook = new Book("Java for dummy", codeLean, 19.95, 99);
        System.out.println(dummyBook);

        //Test set and get
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is:" + dummyBook.getName());
        System.out.println("price is:" + dummyBook.getPrice());
        System.out.println("qty is:" + dummyBook.getQty());
        System.out.println("Author is:" + dummyBook.getAuthor());
        System.out.println("Author's name is:" + dummyBook.getAuthor().getName());
        System.out.println("Author's email is:" + dummyBook.getAuthor().getEmail());

        //
//        Book anotherBook = new Book("more Java",
//                new Author("Pham Tuan","tuanpth1908045@fpt.edu.vn", 'f'), 29.95);
//        System.out.println(anotherBook);

        Book moreDummyBook = new Book("Java for more dummies",
                new Author("Pham Tuan", "tuanpth1908045@fpt.edu.vn", 'm'), // an anonymous Author's instance
                19.99, 8);
        System.out.println(moreDummyBook);
    }
}
