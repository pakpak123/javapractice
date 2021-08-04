package lab02;

import java.util.Scanner;

public class Lab05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = input.nextInt();
        //set num 0 - 15
        if (num < 0 || num > 15) {
            System.out.println("Error");
        } else {
            for (int row = 1; row <= num ; row++) {
                for (int a = num - row ; a >= 1 ; a--) {
                    System.out.print("  ");
                }
                for (int b = row ; b >= 2 ; b--) {
                    System.out.print(b + " ");
                }
                for (int c = 1 ; c <= row ; c++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
    }
}
