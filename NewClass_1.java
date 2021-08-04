/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author tp
 */
public class NewClass_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] Choice_1 = new int[5];
        int[] Choice_2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] Choose_1 = new char[5];
        char[] Choose_2 ={'a','b','c','d','e','f','g','h','i','j'};
        System.out.print("Random characters are : ");

        for (int i = 0; i < 5; i++) {
            int first = rand.nextInt(2);
            if (first == 1) {
                char c = (char) (97 + rand.nextInt(10)); //98=a ic aski ngaila
                Choose_1[i] = c;
                System.out.print(Choose_1[i]);
                System.out.print(" ");
                int random = rand.nextInt(10);
                Choice_1[i] = random;
                System.out.print(Choice_1[i]);
                System.out.print(" ");
            } else {
                int random = rand.nextInt(10);
                char c = (char) (97+rand.nextInt(10));

                Choice_1[i] = random;
                Choose_1[i] = c;
                System.out.print(Choose_1[i]);
                System.out.print(" ");
                System.out.print(Choice_1[i]);
                System.out.print(" ");
            }
        }

        System.out.print("\nSelect group of characters [1]character or [2]numeric : ");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        
        if (select == 2) {
            System.out.print("Numerics not in the list are : ");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    if (Choice_1[j] == Choice_2[i]) {
                        Choice_2[i] = 20;
                    }
                }
            }

            for (int i = 0; i < 10; i++) {
                if (Choice_2[i] == 20) {
                } else {
                    System.out.print(Choice_2[i]);
                    System.out.print(" ");
                }
            }
        } else if (select == 1) {
            System.out.print("Characters not in the list are : ");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    if (Choose_1[j] == Choose_2[i]) {
                        Choose_2[i] = 26;
                    }
                }
            }

            for (int i = 0; i < 10; i++) {
                if (Choose_2[i] == 26) {
                } else {
                    System.out.print(Choose_2[i]);
                    System.out.print(" ");
                }
            }
        } else {
            System.out.println("Error");
        }

    }
}

