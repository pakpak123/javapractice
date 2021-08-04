/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tp
 */
public class LAb08_2 {

    public static void main(String[] args) {
        Geometric[] a = {new Circle(7, "Red", true),
            new Circle(10, "Green", false),
            new Triengle(12, 13, 17, "Black", true),
            new Rectengle(6, 6, "Blue", true),
            new Rectengle(4, 3, "White", false)};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
            System.out.println("");
        }
        //use sum Area
        System.out.println("SumArea = " + Geometric.sumArea(a));

    }
}
