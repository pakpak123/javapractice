/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author fernp
 */
public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock() {
          
    }
    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void inputName(String name) {
        this.name = name;
    }
    
    public void inputSymbol(String symbol) {
        this.symbol = symbol;
    }
    
     public void inputPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
     
    public void inputCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
     
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }    

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice)*100 / previousClosingPrice;
    }
}