/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author tp
 */
public class Lab03_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = input.nextInt();
        if (size <= 0) {
            System.out.println("ERROR");
        } else {
            int[][] m = new int[size][size];

            generateMatrix(m);
            displayMatrix(m);

            int column = 0;
            int row = 0;
            for (int k = 0; k < 2; k++) {
                for (int i = 0; i < m.length; i++) {
                    if (rowSequence(m, k, i)) {
                        System.out.println("All " + k + "s on row " + i);
                        row++;
                    }
                }

            }
            for (int k = 0; k < 2; k++) {
                for (int i = 0; i < m.length; i++) {
                    if (columnSequence(m, k, i)) {
                        System.out.println("All " + k + "s on column " + i);
                        column++;
                    }
                }

            }
            if (column == 0) {
                System.out.println("No same numbers on a column");
            }
            if (row == 0) {
                System.out.println("No same numbers on a row");
            }
            boolean diagonal0 = majorDiagonal(m, 0);
            boolean diagonal1 = majorDiagonal(m, 1);

            if (diagonal0) {
                System.out.println("All " + 0 + "s on diagonal");
            } else if (diagonal1) {
                System.out.println("All " + 1 + "s on diagonal");
            } else {
                System.out.println("No same numbers on the diagonal");
            }

            boolean p0 = subDiagonal(m, 0);
            boolean p1 = subDiagonal(m, 1);

            if (p0) {
                System.out.println("All " + 0 + "s on subdiagonal");
            } else if (p1) {
                System.out.println("All " + 1 + "s on subdiagonal");
            } else {
                System.out.println("No same numbers on the subdiagonal");
            }

            boolean L0 = superDiagonal(m, 0);
            boolean L1 = superDiagonal(m, 1);
            if (L0) {
                System.out.println("All " + 0 + "s on superdiagonal");
            } else if (L1) {
                System.out.println("All " + 1 + "s on superdiagonal");
            } else {
                System.out.println("No same numbers on the superdiagonal");
            }

        }
    }

    public static boolean rowSequence(int[][] m, int n, int row) {

        for (int k = 0; k < m[row].length; k++) {
            if (m[row][k] != n) {
                return false;
            }
        }
        return true;
    }

    public static boolean columnSequence(int[][] m, int n, int column) {

        for (int i = 0; i < m.length; i++) {
            if (m[i][column] != n) {
                return false;
            }
        }
        return true;
    }

    public static void displayMatrix(int[][] m) {

        System.out.println("");
        for (int[] m1 : m) {
            for (int k = 0; k < m1.length; k++) {
                System.out.print(m1[k]);
            }
            System.out.println("");
        }
    }

    public static void generateMatrix(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                m[i][k] = (int) (Math.random() * 2);
            }
        }
    }

    public static boolean majorDiagonal(int[][] m, int n) {

        boolean topLeftDown = true; // top left to bottom right

        for (int i = 0; i < m.length; i++) {
            if (m[i][i] != n) {
                topLeftDown = false;
            }
        }

        boolean bottomLeftDown = true; // bottom left to top right

        int k = 0;
        for (int i = m.length - 1; i >= 0; i--) {
            if (m[i][k++] != n) {
                bottomLeftDown = false;
            }

        }

        return topLeftDown || bottomLeftDown;
    }

    public static boolean subDiagonal(int[][] m, int n) {

        // sub-diagonal entry is one that is directly below and to the left of the main diagonal
        // row is i
        // column is j
        // j = i - 1
        for (int i = 1; i < m.length; i++) {
            if (n != m[i][i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean superDiagonal(int[][] m, int n) {

        // super-diagonal entry is one that is directly below and to the left of the main diagonal
        // row is i
        // column is j
        // j = i + 1
        for (int i = 0; i < m.length - 1; i++) {
            if (n != m[i][i + 1]) {
                return false;
            }
        }

        return true;
    }
}
