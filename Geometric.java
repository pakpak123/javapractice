/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author tp
 */
abstract class Geometric {
    private String color = " ";
    private boolean filled;

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Geometric() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String isFilled() {
        if (this.filled) {
            return "filled";
        }
        return "not filled";
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() { 
        return "Geometric{" + "color = " + color + ", " + isFilled() + '}';
    }

    //sub can use if have " abstract " 
    public abstract double getArea();

    public abstract double getPerimeter();

    public static double sumArea(Geometric[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
