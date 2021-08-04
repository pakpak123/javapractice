/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tp
 */
public class Lab72 {

    public static void main(String[] args) {
        Account2 account = new Account2("George", 1122, 1000, 1.65);
        System.out.println("Name : George");
        System.out.println("Account ID : " + account.getId());
        System.out.println("Annual interest rate : " + account.getAnnualInterestRate());
        account.setBalance((account.getBalance() + (account.getAnnualInterestRate() * account.getBalance())));
        System.out.println("Balance : " + account.getBalance());

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.Withdraw(5);
        account.Withdraw(4);
        account.Withdraw(2);
        account.Withdraw(10);

        System.out.println("Date\t\t\t\t\tType\t\tAmount\t\tBalance");
        for (int i = 0; i < account.getTransactions().size(); i++) {
            System.out.print(account.getDate() + "\t\t");
            System.out.print((account.getTransactions()).get(i).getType() + "\t\t");
            System.out.print((account.getTransactions()).get(i).getAmount() + "\t\t");
            System.out.println((account.getTransactions()).get(i).getBalance());
            System.out.println("");
        }
    }
}

class Transaction {

    private Date date = new Date();
    private char type;
    private double amount;
    private double balance;

    public Transaction() {
    }

    public Transaction(char type, double amount, double balance) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;

    }
           
    void setType(char type) {
        this.type = type;
    }

    void setAmount(double amount) {
        this.amount = amount;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    char getType() {
        return type;
    }

    double getAmount() {
        return amount;
    }

    double getBalance() {
        return balance;
    }
}

class Account2 {
    // Data fields

    private String name = " ";
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    private double withdraw;
    private double deposit;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account2() {
    }

    public Account2(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate ;
    }

    double getAnnualInterestRate() {
        return annualInterestRate/1200;
    }

    double getBalance() {
        return balance;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    Date getDate() {
        return dateCreated;
    }

    ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setWithdraw(double amount) {
        this.withdraw = amount;
    }

    void setDeposit(double amount) {
        this.deposit = amount;
    }

    void Withdraw(double amount) {
        this.withdraw = amount;
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - this.withdraw);
            transactions.add(new Transaction('W',this.withdraw , balance));
        } else {
            System.out.println("Withdraw more than Balance");
        }
    }

    void deposit(double amount) {
        this.deposit = amount;
        if (amount > 0) {
            setBalance(getBalance() + this.deposit);
            transactions.add(new Transaction('D', amount, getBalance()));
        } else {
            System.out.println("Not Deposit");
        }
    }
}
