package lab02;

import java.util.Scanner;

public class LAB01 {

    //set program 
    public static void main(String[] args) {
        week(0);
    }

    //input day
    public static void week(int day) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        day = input.nextInt();
        //check input day
        if (day < 0 || day > 6) {
            System.out.println("ERROR");
            System.out.println("");
        } else {
            System.out.print("Enter the number of days elapsed since today : ");
            int next = input.nextInt();
            switch (day) {
                case 0:
                    System.out.print("Today is Sunday and ");
                    break;
                case 1:
                    System.out.print("Today is Monday and ");
                    break;
                case 2:
                    System.out.print("Today is Tuesday and ");
                    break;
                case 3:
                    System.out.print("Today is Wednesday and ");
                    break;
                case 4:
                    System.out.print("Today is Thursday and ");
                    break;
                case 5:
                    System.out.print("Today is Friday and ");
                    break;
                case 6:
                    System.out.print("Today is Saturday and ");
                    break;
            }
            // + day up
            int days = day + next;
            if (days > 7) {
                days = days % 7;
                switch (days) {
                    case 0:
                        System.out.println("the future day is Sunday ");
                        break;
                    case 1:
                        System.out.println("the future day is Monday ");
                        break;
                    case 2:
                        System.out.println("the future day is Tuesday ");
                        break;
                    case 3:
                        System.out.println("the future day is Wednesday ");
                        break;
                    case 4:
                        System.out.println("the future day is Thursday ");
                        break;
                    case 5:
                        System.out.println("the future day is Friday ");
                        break;
                    case 6:
                        System.out.println("the future day is Saturday ");
                        break;
                }
            } else {
                switch (days) {
                    case 0:
                        System.out.println("the future day is Sunday ");
                        break;
                    case 1:
                        System.out.println("the future day is Monday ");
                        break;
                    case 2:
                        System.out.println("the future day is Tuesday ");
                        break;
                    case 3:
                        System.out.println("the future day is Wednesday ");
                        break;
                    case 4:
                        System.out.println("the future day is Thursday ");
                        break;
                    case 5:
                        System.out.println("the future day is Friday ");
                        break;
                    case 6:
                        System.out.println("the future day is Saturday ");
                        break;
                }
            }
            System.out.println("");
        }
    }
}
