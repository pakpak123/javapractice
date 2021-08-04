/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Date;

public class Lab07 {

    public static void main(String[] args) {
        Account account = new Account(1122, 5000);
        SavingAccount save = new SavingAccount(account.getId(), account.getBalance());
        CheckingAccount check = new CheckingAccount(account.getId(), account.getBalance());
        save.setAmountWithdraw(6000);
        System.out.println("Checkings");
        check.Overlimit(save.getAmountWithdraw());
        System.out.println("Overdraft Limit : " + check.getOverlimit());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Withdraw : " + save.getAmountWithdraw());
        save.Withdaw(save.getAmountWithdraw());
        System.out.println("Balance : " + (account.getBalance() - save.getAmountWithdraw()));
        System.out.print("This account was created at");
        System.out.println(" " + account.getDateCreated());
    }

}

class Account {

    private int id;
    private double balance;
    private Date dateCreated = new Date();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    int getId() {
        return this.id;
    }

    void setBalance(double Balance) {
        this.balance = Balance;
    }

    double getBalance() {
        return this.balance;
    }

    Date getDateCreated() {
        return dateCreated;
    }
}

class SavingAccount
        extends Account {

    private double amountWithdraw;
    private double amountDeposit;

    public SavingAccount() {
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    void setAmountWithdraw(double AmountWithdraw) {
        this.amountWithdraw = AmountWithdraw;
    }

    void setAmountDeposit(double AmountDeposit) {
        this.amountDeposit = AmountDeposit;
    }

    double getAmountWithdraw() {
        return amountWithdraw;
    }

    double getAmountDeposit() {
        return amountDeposit;
    }

    void Withdaw(double amount) {
        this.amountWithdraw = amount;
        if (amount >= 0 || amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdraw more than Balance");
        }
    }

    void deposit(double amount) {
        this.amountDeposit = amount;
        if (amount >= 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Not Deposit");
        }
    }
}

class CheckingAccount
        extends Account {

    private double overlimit = 0;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    void Overlimit(double withdraw) {
        // Checking has an overdraft of up to LIMIT
        if (withdraw > 0 && withdraw > getBalance()) {
            overlimit = withdraw - getBalance();
            setOverlimit(overlimit);
        } else {
            System.out.println("Not overlimit");
        }
    }

    void setOverlimit(double Overlimit) {
        this.overlimit = Overlimit;
    }

    double getOverlimit() {
        return overlimit;
    }
}
