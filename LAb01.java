package lab04;

public class LAb01 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.inputPreviousClosingPrice(100.0);
        stock1.inputCurrentPrice(105.0);
        System.out.println("Symbol: " + stock1.getSymbol() +"\n" + "Name: " + stock1.getName() );
        System.out.println("Previous Closing Price: " + stock1.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock1.getCurrentPrice());
        System.out.printf("Price Change: %.15f%%\n",stock1.getChangePercent());
    }
 
}