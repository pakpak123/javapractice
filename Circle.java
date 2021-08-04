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
public class Circle extends Geometric {

    private double r = 1;

    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "\ncircle{" + "r = " + r + ", Area = " + getArea() + " , Perimeter" + getPerimeter() + '}';
    }
}

