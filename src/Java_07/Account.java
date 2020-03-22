package Java_07;

public class Account {
    //the privare intance variable
    private int accountNumber;
    private double balance;

    //the constructor (overloaded)
    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    //the public getters/ setters for the private instance variable.
    //No setter for accountNumber because it is not designed to be changed.
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance (double balance){
        this.balance = balance;
    }

    //add the given amount to the balance
    public void credit(double amount){
        balance += amount;
    }
    public void debit(double amount){
        if (balance < amount){
    System.out.println("amount withdrawn esceeds the current balance!");
        }else{
    balance -= amount;
        }
    }
    public String toString(){
        return String.format("A/C no:%d, Balance=%.2f", accountNumber,balance);
    }
}
