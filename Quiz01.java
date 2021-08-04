/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author fernp
 */
public class Quiz01 {

    public static void main(String[] args) {
    
        Random R = new Random();
        char C = (char)(R.nextInt(9) + 'a');
        String Roll ="abcdefghij";
        
        char letter = Roll.charAt(R.nextInt(Roll.length()));
        Random rand_int = new Random();
        Random rand = new Random();
        int[] Choice_1 = new int[5];
        int[] Choice_2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
               
        
            char C1 = (char)(R.nextInt(9)+'a'); 
            System.out.print(""+R.nextInt(9)+'a');
            System.out.print(" ");
            int random = rand.nextInt(10);
            Choice_1[1] = random;
            System.out.print(Choice_1[1]);
            System.out.print(" ");
        
       

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (Choice_1[j] == Choice_2[i]) {
                    Choice_2[i] = 20;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (Choice_2[i] == 20) {
            } else {
                System.out.print(Choice_2[i]);
                System.out.print(",");
            }
        }
    }
}

