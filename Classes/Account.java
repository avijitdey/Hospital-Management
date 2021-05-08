package Classes;
import Interfaces.*;
public  class Account implements Statement {
    protected int accountNumber;
    protected double balance;
	public double addedBalance = 0;
	public double subbedBalance = 0;
    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }
    public void setBalance(double bal) {
        this.balance = bal;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
     public void showInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + this.getBalance());
    }
    
    public void bill(double amount) {
        
        if (amount > 0) {
            addedBalance = this.getBalance() + amount;
            this.setBalance(addedBalance);
            System.out.println("Successfully Billed");
			System.out.println("New Balance = "+addedBalance);
        } else {
            System.out.println("Invalid Amount");
        }
    }
   
    public void payment(double amount) {
       
        if (amount <= this.getBalance() && amount > 0) {
            subbedBalance = this.getBalance() - amount;
            this.setBalance(subbedBalance);
            System.out.println("Successfully Paid");
			System.out.println("New Balance = "+subbedBalance);
        } else {
            System.out.println("Invalid Amount");
        }
    }
   
    public void transfer(Account a, double amount) {
        System.out.println(this.getBalance());
        System.out.println(amount);
        if (this.getBalance() >= amount) {
            this.payment(amount);
            a.bill(amount);
            System.out.println("Transfer Succesfull");
        }
    }
}