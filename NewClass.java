/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author tp
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the size for the matrix : ");
        int size = input.nextInt();
        int select = 0;
        int multi01 = 1;
        int multi02 = 1;
        int multi03 = 1;
        int multi04 = 1;
        System.out.println("Random matrix is : ");
        if (size < 5) {
            System.out.println("error");
        } else {
            int[][] matrix = new int[size + 1][size + 1];

            for (int i = 0; i <= size - 1; i++) {
                for (int j = 0; j <= size - 1; j++) {
                    matrix[i][j] = (int) (Math.random() * 6);
                    System.out.printf("%d ", matrix[i][j]);
                }
                System.out.printf("\n");
            }
            
            System.out.print("Input value of Row and Column : ");
            int i = input.nextInt();
            int j = input.nextInt();
            System.out.print("Select member is : ");
            System.out.printf("%d ", matrix[i][j]);
            select = matrix[i][j];
           
            //top 
            System.out.print("\nTop : ");
            if (i <= 0) {
                System.out.print("no");
            } else {
                for (int k = i - 1; k >= 0; k--) {
                    select = matrix[k][j];
                    multi01 = multi01 * matrix[k][j];
                }
                System.out.printf("%d", multi01);
            }
            //right 
            System.out.print("\nRight : ");
            if (j == size - 1) {
                System.out.print("no");
            } else {
                for (int k = j + 1; k <= size - 1; k++) {
                    select = matrix[i][k];
                    multi02 = multi02 * matrix[i][k];
                }
                System.out.printf("%d", multi02);
            }

            //bottom 
            System.out.print("\nBottom : ");
            if (i == size - 1) {
                System.out.print("no");
            } else {
                for (int k = i + 1; k <= size - 1; k++) {
                    select = matrix[k][j];
                    multi03 = multi03 * matrix[k][j];
                }
                System.out.printf("%d", multi03);
            }
            
            //left 
            System.out.print("\nLeft : ");
            if (j <= 0) {
                System.out.print("no");
            } else {
                for (int k = j - 1; k >= 0; k--) {
                    select = matrix[i][k];
                    multi04 = multi04 * matrix[i][k];
                }
                System.out.printf("%d", multi04);
            }
        }
        System.out.print("\nEnd of program.");
    }
}
