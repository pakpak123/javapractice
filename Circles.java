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
public class Circles implements Comparable<Circles>{
    private double radius;
    public Circles(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    @Override
    public int compareTo(Circles o) {
        if(getArea()>o.getArea())return 1;
        else if(getArea()<o.getArea())return -1;
        else return 0;
    }
    
}
