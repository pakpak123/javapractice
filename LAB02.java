package lab02;

import java.util.Random;
import java.util.Scanner;

public class LAB02 {

    public static void main(String[] args) {
        me(0);
    }

    public static void me(int count) {
        Random rand = new Random();
        int num = rand.nextInt(3);
        Scanner input = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");
        count = input.nextInt();
        if (count < 0 || count > 2) {
            System.out.println("error");
        } else {
            switch (num) {
                case 0:
                    System.out.print("The computer is scissor.");
                    break;
                case 1:
                    System.out.print("The computer is rock.");
                    break;
                case 2:
                    System.out.print("The computer is paper.");
                    break;
            }
            switch (count) {
                case 0:
                    System.out.print("You are scissor.");
                    break;
                case 1:
                    System.out.print("You are rock.");
                    break;
                case 2:
                    System.out.print("You are paper.");
                    break;
            }
            if (count == num) {
                System.out.println("It is a draw");
            } else if (num - count == -1) {
                System.out.println("You won");
            } else if (num - count == 2) {
                System.out.println("You won");
            } else if (num - count == 1) {
                System.out.println("You lose");
            } else {
                System.out.println("You lose");
            }
        }
        System.out.println("");
    }

}
