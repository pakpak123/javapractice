/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.pkg7;

import java.util.Date;

/**
 *
 * @author tp
 */
public class Acc {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;

    public Acc() {
        this(0, 0, 0);
    }

    public Acc(int id, double balance, double annualInterestRate) {
        this.setId(id);
        this.setBalance(balance);
        this.setAnnualInterestRate(annualInterestRate);
        dateCreate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    // public void setDateCreate(Date dateCreate) {
    // this.dateCreate = dateCreate;
    // }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public String getClassName() {
        return getClass().getSimpleName() + " id:" + id;
    }

    public void withdraw(double withdraw) {
        if (withdraw <= 0) {
            System.out.println(getClassName() + " Error :: withdraw is not a negative number");
        } else if (withdraw > balance) {
            System.out.println(getClassName() + " Error :: withdraw is much than balance");
        } else {
            balance -= withdraw;
        }

    }

    public void deposit(double deposit) {
        if (deposit <= 0) {
            System.out.println(getClassName() + " Error :: deposit is not a negative number");
        } else {
            balance += deposit;
        }
    }

    public String toString() {
        return "\nAccount ID : " + id + "\nDate Created : " + dateCreate +"\nBalance : "+ String.format("%.2f", balance)+"\nMonthly Interest : $"+ String.format("%.2f", getMonthlyInterest());
    }
}

