/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author tp
 */
public class Lab3_2 {
    public static int[] merge(int[] list1, int[] list2)
    {
        int[] three = new int[list1.length+list2.length];
        System.arraycopy(list1, 0, three, 0, list1.length);
        System.arraycopy(list2, 0, three, list1.length,list2.length);
        
        return three;
       
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[] one = new int[5];
        for (int i = 0; i < 5; i++) {
             one[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int[] two = new int[4];
        for (int i = 0; i < 4; i++) {
             two[i] = input.nextInt();
        }
        int[] four = merge(one,two);
        Arrays.sort(four);
        for (int i = 0; i < 9; i++) {
            System.out.print(four[i]);
            System.out.print(" ");
        }
    }
}
