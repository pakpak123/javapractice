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
public class LAB08_1 {

    private static Object A1;
    public static void main(String[] args) {
         int x1, x2, x3, y1, y2, y3;
        double dis1, dis2, dis3;
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 4;
        x3 = 9;
        y3 = 0;
        dis1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        //System.out.println("" + dis1);
        dis2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        //System.out.println("" + dis2);
        dis3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        //System.out.println("" + dis3);
        
        //Triangle A1 = new Triangle(dis1, dis2, dis3, "Green", true);
        System.out.println(A1.toString());
        System.out.println("");
       
    }

}

