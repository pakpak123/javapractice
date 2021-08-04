/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
public class Main4 {

    public static void main(String[] args) {

        Queue00 test = new Queue00();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);
        test.enqueue(6);
        test.enqueue(7);
        test.enqueue(8);
        test.enqueue(9);
        test.enqueue(10);
        test.enqueue(11);
        test.enqueue(12);
        test.enqueue(13);
        test.enqueue(14);
        test.enqueue(15);
        test.enqueue(16);
        test.enqueue(17);
        test.enqueue(18);
        test.enqueue(19);
        test.enqueue(20);
        System.out.println("Size : " + test.getSize());
        for (int n = 0; n < test.getSize(); n++) {
            System.out.println(test.getElements()[n]);
        }

        System.out.println("-------------------------------------------");

        test.dequeue();
        System.out.println("Size : " + test.getSize());
        for (int n = 1; n < test.getSize(); n++) {
            System.out.println(test.getElements()[n]);
        }
    }

}
