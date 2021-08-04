/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
public class main02 {
    public static void main(String[] args) {
        // TODO code application logic here
        Account1 account_01= new Account1("George", 112, 1109, 1.65);

        account_01.deposit(30);
        account_01.deposit(40);
        account_01.deposit(50);
        account_01.withdraw(5);
        account_01.withdraw(4);
        account_01.withdraw(2);

        System.out.println(account_01.toString());
        account_01.transactionToString();

        // ArrayList<Transaction> transtactionList = new ArrayList<Transaction>();

        // transtactionList.add(new Transaction('D', 100.0, account_01.getBalance(), ""));

        // System.out.println(account_01.toString());

        // System.out.println("Date\t\t\t\t\tType\t\tAmount\t\tBalance");
        // for (Transaction tsn : transtactionList) {
        //     System.out.println(tsn.getDataCreated() +"\t\t"+tsn.getType()+"\t\t"+tsn.getAmount()+"\t\t"+tsn.getBalance()+"\t\t"+tsn.getDescription());
        // }
        
    }

}

