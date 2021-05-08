package Interfaces;
import Classes.*;
public interface Statement {

    public void bill(double amount);

    public void payment(double amount);

   public void transfer(Account a, double amount);
}
