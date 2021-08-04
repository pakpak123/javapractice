/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
public class savingAccount extends Account{
     public savingAccount() {
        super();
    }

    public savingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public void withdraw(double withdraw) {
        if (getBalance() >= withdraw) {
            setBalance(getBalance() - withdraw);
        } else {
            System.out.println(getClassName() + "Error :: account overdrawn transtaction rejected");
        }
    }

}
