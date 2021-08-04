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
public class Rectengle extends Geometric {

    private double h = 0;
    private double w = 0;

    public Rectengle() {
    }
    
    public Rectengle(double h, double w, String color, boolean filled) {
        super(color, filled);
        this.h = h;
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public double getArea() {
        return h * w;
    }

    @Override
    public double getPerimeter() {
        return 2 * h + 2 * w;
    }

    @Override
    public String toString() {
        return super.toString() + " " +"\nRectangle{" + "h = " + h + ", w = " + w + ", Area = " + getArea() + " , Perimeter" + getPerimeter() + '}';
    }
}


