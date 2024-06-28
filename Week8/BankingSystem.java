package Week8;

public class BankingSystem{
    public static void main(String[] args){
        BankAccount ba = new BankAccount(
            "1001-A", "Albert", 10
        );
        System.out.println(ba.getAccountBalance());
        ba.deposit(100);
        System.out.println(ba.getAccountBalance());
        ba.withdraw(5);
        System.out.println(ba.getAccountBalance());
        ba.withdraw(10000);
        System.out.println(ba.getAccountBalance());
    }
}
// You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind. 
// Include private instance variables for the
// account number, account holder name, and account balance. 
// Provide public methods to allow clients to deposit and withdraw funds, 
// as well as access the account balance. 
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// Note make contructor to fill the attribute on account opening
// Make getter for account number and account holder name
class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    BankAccount(
        String accountNumber, 
        String accountHolderName, 
        double accountBalance
    ){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }
    public void deposit(double money){
        this.accountBalance += money;
    }
    public void withdraw(double money){
        if(money > accountBalance){
            System.out.println("You are poor");
        }else{
            this.accountBalance -= money;
            System.out.println("Withdrawn");
        }
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
} 
