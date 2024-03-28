package OOP;

/*
Create a class Account with the attributes accountNo, custName,accountBalance and
methods setAccountDetails() which set the values to these attributes.
withdraw() which subtracts the given amount from the available balance
deposit() which adds a given amount to the available balance and
dispAccountDetails() which displays accountNo, custName,
accountBalance.
Create a class Main1 which contains the main() method to test the functionality of
Account class.
 */


class ACcount{
    private long accNo ;
    private String name;
    private int balance;
    private static int intereast = 3;

    public void setDetails(long accNo, String name, int balance){
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(int amount){
        this.balance = balance - amount;
    }

    public void deposit(int amount){
        this.balance = balance + amount;
    }

    public void display(){
        System.out.println("AC No. : " + accNo);
        System.out.println("AC Name : " + name);
        System.out.println("Ac balance : " + balance);
    }
}


public class OOPAss1q3 {
    public static void main(String[] args) {
        ACcount a1 = new ACcount();
        a1.setDetails(1654894651, "Abhi", 23000);
        a1.withdraw(1000);
        a1.deposit(5000);
        a1.display();
    }
}

