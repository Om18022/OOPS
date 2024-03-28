package OOP;

/*
Create a class Account with accountNumber, custName, balance and
interest rate. create method calculateInterest() which will calculate interest
and add to balance. create a method to displayAccountDetails()
 */


class Account{
    private int accNo ;
    private String name;
    private double balance;
    private static int intereast = 3;


    public void setdetails(int accNo, String name, int balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public int getbalance(int balance){
        return balance;
    }
    public void calculateIntereast(){
        balance = balance + (balance * intereast) / 100;
    }

    public void displaydetails() {
        System.out.println("Account No : " + accNo);
        System.out.println("Account name : " + name);
        System.out.println("Account Balance : " + balance);
        System.out.println("Interest : " + intereast);
    }


}


public class OOPAss1q2 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setdetails(1245987455, "Abhi",2000);
        a1.calculateIntereast();
        a1.displaydetails();

    }
}

