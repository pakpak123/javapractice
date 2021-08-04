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
public class Polygon {

    public static void main(String[] args) {
        ///n.....lenght.....x....y
        RegularPolygon regularPolygon1 = new RegularPolygon();
        System.out.println("Number of side = " + regularPolygon1.getn());
        System.out.println("length of each side = " + regularPolygon1.getside());
        System.out.println("x-coordinate = " + regularPolygon1.getx());
        System.out.println("y-coordinate = " + regularPolygon1.gety());
        System.out.println("Perimeter = " + regularPolygon1.getPerimeter());
        System.out.println("Area = " + regularPolygon1.getArea());

        System.out.println("");

        RegularPolygon regularPolygon2 = new RegularPolygon(5, 9);
        System.out.println("Number of side = " + regularPolygon2.getn());
        System.out.println("length of each side = " + regularPolygon2.getside());
        System.out.println("x-coordinate = " + regularPolygon2.getx());
        System.out.println("y-coordinate = " + regularPolygon2.gety());
        System.out.println("Perimeter = " + regularPolygon2.getPerimeter());
        System.out.println("Area = " + regularPolygon2.getArea());

        System.out.println("");

        RegularPolygon regularPolygon3 = new RegularPolygon(6, 7, 8, 8);
        System.out.println("Number of side = " + regularPolygon3.getn());
        System.out.println("length of each side = " + regularPolygon3.getside());
        System.out.println("x-coordinate = " + regularPolygon3.getx());
        System.out.println("y-coordinate = " + regularPolygon3.gety());
        System.out.println("Perimeter = " + regularPolygon3.getPerimeter());
        System.out.println("Area = " + regularPolygon3.getArea());
    }
}
