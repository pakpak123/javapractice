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
public class Save extends Acc{
     public Save() {
        super();
    }

    public Save(int id, double balance, double annualInterestRate) {
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
