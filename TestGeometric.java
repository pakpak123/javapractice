/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author tp
 */
public class TestGeometric {
    public static void main(String[] args) {
        Geometic g1=new Geometic();
        System.out.println(g1.getDateCreated());
        System.out.println(g1.toString());
        Circle c1=new Circle();//default constructor
        System.out.println(c1.toString());
        Circle c2=new Circle(2.5,"Red");
        System.out.println(c2.toString());
    }
}
