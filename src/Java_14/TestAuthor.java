package Java_14;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan-Ah Teck","tuanpth1908045@fpt.edu.vn",'m');
        System.out.println(ahTeck);

        ahTeck.setEmail("tuanpth1908045@fpt.edu.vn");
        System.out.println(ahTeck);

        System.out.println("name is: " + ahTeck.getName());
        System.out.println("gender is: " + ahTeck.getGender());
        System.out.println("email is: " + ahTeck.getEmail());

    }
}
