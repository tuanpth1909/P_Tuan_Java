package Java_12;

public class TestAccount {
    public static void main(String[] args) {
        //thu truyen vao contructor
        Account a1 = new Account(1234,99.99);
        System.out.println(a1);
        Account a2 = new Account(8888);
        System.out.println(a2);

        //thu truyen doi so vao ham set and get
        a1.setBalance(8888);
        System.out.println(a1);
        System.out.println("The AccountNumber is:" + a1.getAccountNuber());
        System.out.println("The Balance is:" + a1.getBalance());

        //Kiem tra tien trong tai khoan
        a1.credit(10);
        System.out.println(a1);
        a1.debit(5);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
    }
}
