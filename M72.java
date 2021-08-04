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
public class M72 {
    public static void main(String[] args) {
         // TODO code application logic here
        Acc1 account_01= new Acc1("Hui", 112, 1109, 1.65);

        account_01.deposit(1030);
        account_01.deposit(40);
        account_01.deposit(50);
        account_01.withdraw(50);
        account_01.withdraw(40);
        account_01.withdraw(2139);

        System.out.println(account_01.toString());
        account_01.transactionToString();
        
    }
}
