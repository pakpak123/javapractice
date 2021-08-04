/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaB05;

/**
 *
 * @author tp
 */
public class RegularPolygon {

    private int n = 3;
    //length of the side
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
    }

    public RegularPolygon(int N, double Side) {
        n = N;
        side = Side;
    }

    public RegularPolygon(int N, double Side, double X, double Y) {
        n = N;
        side = Side;
        x = X;
        y = Y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan((Math.PI) / n));
    }

    public int getn() {
        return n;
    }

    public double getside() {
        return side;
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }
}
