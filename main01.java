/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
public class main01 {
     public static void main(String[] args) {
        // TODO code application logic here
        Account account_01 = new Account(112, 11244, 4.5);
        savingAccount savingAccount_01 = new savingAccount(235, 4309, 4.5);
        checkingAccount checkingAccount_01 = new checkingAccount(309, 2091, 4.5, 100);

        account_01.deposit(20);

        Account[] listAccounts = {account_01,savingAccount_01,checkingAccount_01};

        for (Account account : listAccounts) {
            System.out.println(account.toString());
        }

        // System.out.println(account_01.toString());
    }
    
}

