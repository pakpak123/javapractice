/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author tp
 */
public class Quiz02 {
   	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input size of matrix: ");
		int size = input.nextInt();
		
		int[][] matrix = new int[size+1][size+1];
        int matrix1=0,m=0,n=0;
        if(size<5) {
        	
        }
        else {
        	System.out.println("Random matrix: ");
        	for(int i=0;i<=size-1;i++){
                for(int j=0;j<=size-1;j++){
                    matrix[i][j] = 0+(int)(Math.random()*10);
                    System.out.printf("%d ",matrix[i][j]);
                    if(matrix[i][j]>matrix1) {
                    	matrix1 = matrix[i][j];
                    	m=i;
                    	n=j;
                    }
                }
                System.out.printf("\n");
            }
            
            System.out.println("The first found largest member is: "+matrix1+" at " + "(" + m + "," + n + ")");
            
            System.out.print("Top: ");
            if(m==0) {
            	System.out.print("No");
            }
            else {
            	for(int k=m-1;k>=0;k--) {
            		System.out.print(matrix[k][n]);
            		if(k!=0) {
            			System.out.print(",");
            		}
            	}
            }
            
            System.out.print("\n");
            
            System.out.print("Right: ");
            if(n==size-1) {
            	System.out.print("No");
            }
            else {
            	for(int k=n+1;k<=size-1;k++) {
            		System.out.print(matrix[m][k]);
            		if(k!=size-1) {
            			System.out.print(",");
            		}
            	}
            }
            System.out.print("\n");
            
            System.out.print("Botton: ");
            if(m==size-1) {
            	System.out.print("No");
            }
            else {
            	for(int k=m+1;k<=size-1;k++) {
            		System.out.print(matrix[k][n]);
            		if(k!=size-1) {
            			System.out.print(",");
            		}
            	}
            }
            System.out.print("\n");
        }
        }
}

