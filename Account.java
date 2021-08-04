/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaB05;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author tp
 */
class A1 {

    public static void main(String[] args) {
        //............................Id.......balance.....rate
        Scanner input = new Scanner(System.in);

        int balance = 20000;

        System.out.print("Input Withdraw :");

        double withdraw = input.nextDouble();
        if (withdraw < 0 || withdraw > balance) {
            System.out.println("Not Withdraw");
        }
        System.out.print("Input Deposit : ");
        double deposit = input.nextDouble();
        if (deposit < 0) {
            System.out.println("Not Deposit");
        }

        Account account = new Account(1223, balance);
        //////annualInterestRate/////
        account.getAnnualInterestRate(4.5);

        account.withdraw(withdraw);
        account.deposit(deposit);

        System.out.println("Balance : " + account.getBalance());
        System.out.println("Monthly Interest : " + account.getMonthlyInterest());
        System.out.println("Date : " + account.getDateCreated());

    }

}

public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account() {

    }

    public Account(int ID, double BALANCE) {
        id = ID;
        balance = BALANCE;

    }

    public void getAnnualInterestRate(double ANNALINTERESTRATE) {
        annualInterestRate = ANNALINTERESTRATE;
    }

    public int getId() {
        return id;
    }

    public double getWithdraw(double Withdraw) {

        return Withdraw;
    }

    public double getDeposit(double Deposit) {
        return Deposit;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double withdraw(double Withdraw) {

        if (Withdraw < 0 || Withdraw > balance) {
            return balance;

        } else {
            return balance -= Withdraw;
        }

    }

    public double deposit(double Deposit) {
        if (Deposit < 0) {
            return balance;
        } else {
            balance += Deposit;
            return balance;
        }
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

}
