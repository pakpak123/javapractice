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
public class Triengle extends Geometric {

    private double side1;
    private double side2;
    private double side3;

    public Triengle() {
    }

    public Triengle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double side = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(side * (side - this.side1) * (side - this.side2) * (side - this.side3));
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "\nTriangle{" + "side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", \nArea = " + getArea() + " , \nPerimeter = " +getPerimeter() + '}';
    }

}





