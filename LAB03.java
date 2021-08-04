package lab02;

import java.util.Scanner;

public class LAB03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        if (year < 0) {
            System.out.println("Error");
        } else {
            System.out.print("Enter month: 1-12: ");
            int month = input.nextInt();
            if (month < 0 || month > 12) {
                System.out.println("Error");
            } else if (month == 1) {
                month = 13;
                year--;
                System.out.print("Enter the day : 1-31: ");
                int dayMonth = input.nextInt();
                if (dayMonth < 0 || dayMonth > 31) {
                    System.out.println("Error");
                } else {
                    int dayWeek = (dayMonth + (26 * (month + 1)) / 10 + (year % 100)
                            + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
                    System.out.print("Day of the week is ");
                    switch (dayWeek) {
                        case 0:
                            System.out.println("Saturday");
                            break;
                        case 1:
                            System.out.println("Sunday");
                            break;
                        case 2:
                            System.out.println("Monday");
                            break;
                        case 3:
                            System.out.println("Tuesday");
                            break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                        case 5:
                            System.out.println("Thursday");
                            break;
                        case 6:
                            System.out.println("Friday");
                    }
                }
            } else if (month == 2) {
                month = 14;
                year--;
                System.out.print("Enter the day : 1-31: ");
                int dayMonth = input.nextInt();
                if (dayMonth < 0 || dayMonth > 31) {
                    System.out.println("Error");
                } else {
                    int dayWeek = (dayMonth + (26 * (month + 1)) / 10 + (year % 100)
                            + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
                    System.out.print("Day of the week is ");
                    switch (dayWeek) {
                        case 0:
                            System.out.println("Saturday");
                            break;
                        case 1:
                            System.out.println("Sunday");
                            break;
                        case 2:
                            System.out.println("Monday");
                            break;
                        case 3:
                            System.out.println("Tuesday");
                            break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                        case 5:
                            System.out.println("Thursday");
                            break;
                        case 6:
                            System.out.println("Friday");
                    }
                }
            } else {
                System.out.print("Enter the day : 1-31: ");
                int dayMonth = input.nextInt();
                if (dayMonth < 0 || dayMonth > 31) {
                    System.out.println("Error");
                } else {
                    int dayWeek = (dayMonth + (26 * (month + 1)) / 10 + (year % 100)
                            + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
                    System.out.print("Day of the week is ");
                    switch (dayWeek) {
                        case 0:
                            System.out.println("Saturday");
                            break;
                        case 1:
                            System.out.println("Sunday");
                            break;
                        case 2:
                            System.out.println("Monday");
                            break;
                        case 3:
                            System.out.println("Tuesday");
                            break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                        case 5:
                            System.out.println("Thursday");
                            break;
                        case 6:
                            System.out.println("Friday");
                    }
                }
            }
        }
    }
}
