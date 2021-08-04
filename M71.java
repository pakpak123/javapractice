/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.pkg7;

public class M71 {
    public static void main(String[] args) {
        // TODO code application logic here
        Acc account_01 = new Acc(112, 11244, 4.5);
        Save savingsAccount_01 = new Save(235, 4309, 4.5);
        Check checkingAccount_01 = new Check(309, 2091, 4.5, 100);

        account_01.deposit(20);

        Acc[] listAccounts = {account_01,savingsAccount_01,checkingAccount_01};

        for (Acc account : listAccounts) {
            System.out.println(account.toString());
        }

        // System.out.println(account_01.toString());
    }
}
