/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author tp
 */
public class Neo {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.inputPreviousClosingPrice(34.5);
        stock1.inputCurrentPrice(34.35);
        System.out.println("Symbol: " + stock1.getSymbol() +"\n" + "Name: " + stock1.getName() );
        System.out.println("Previous Closing Price: " + stock1.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock1.getCurrentPrice());
        System.out.printf("Price Change: %.15f%%\n",stock1.getChangePercent());
    }
    
}
