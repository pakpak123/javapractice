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
public class TestEdible {
    public static void main(String[] args) {
        Apple a = new Apple();
        Chicken c = new Chicken();
        
        Edible[] e= {new Apple(),new Chicken()};
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].howtoEat());
        }
    }
}
