/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.pkg7;

/**
 *
 * @author tp
 */
public class Check extends Acc{
     private double overdraftLimit;

    public Check() {
        super();
        setOverdraftLimit(10);
    }
    
    public Check(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.setOverdraftLimit(overdraftLimit);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double withdraw) {
        if (getBalance() - withdraw >= overdraftLimit) {
            setBalance(getBalance() - withdraw);
        }else{
            System.out.println(getClassName()+" Error :: withdraw exceeds overdraft limit");
        }
    }
    
    public String toString() {
        return super.toString() + "\nOverdraft Limit : $"+String.format("%.2f", overdraftLimit);
    }
}
