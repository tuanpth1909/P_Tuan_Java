package Java_12;

public class Account {
    //Tao bien instance
    private int accountNumber;
    private double balance;

    //Tao 2 constructor
    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    //Ham setters and getters (Note: Ham get thi phai co kieu du lieu tra ve, con Ham set thi khong nhung phai co doi so vaf khong co return
    public int getAccountNuber(){
        return this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    //tao ham tin dung (credit) khi them tien vao tai khoan
    public void credit(double amount){
        balance += amount;
    }

    //taoj ham ghi no (debit) khi rut tien ra khoan tai khoan
    public void debit(double amount){
        if(amount > balance){
            System.out.println("Amount withdrawn exceeds the current balance");
        }else{
            balance -= amount;
        }
    }

    //Mo ta chuoi sau khi suat ra man hinh
    public String toString(){
        return String.format("A/C no:%d, Balance:%.2f", accountNumber, balance);
    }


}
