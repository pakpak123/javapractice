/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Scanner;

/**
 *
 * @author tp
 */
public class Test {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        System.out.println("(1) Student");
        System.out.println("(2) Employee");
        System.out.println("(3) Faculty");
        System.out.println("(4) Staff");
        System.out.print("Choose choice: ");
        int choice = input.nextInt();
        input.nextLine();
        
        
        //input
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Address: ");
        String address = input.nextLine();
        System.out.print("Phone: ");
        String phone = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();

        if(choice==1){
            System.out.println("(1) = Freshman");
            System.out.println("(2) = Sophomore");
            System.out.println("(3) = Junior");
            System.out.println("(4) = Senior");
            System.out.print("Status: ");
            int status = input.nextInt();
            
            Student s = new Student(name,address,phone,email,status); // name, address, phoneNum , email
            
            //output
            System.out.println(s.toString()); 
        }
        else if(choice==2){
            System.out.print("Office: ");
            String office = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            System.out.print("Date Hired(Year): ");
            input.nextLine();
            int year = input.nextInt();
            System.out.print("Date Hired(Month): ");
            int month = input.nextInt();
            System.out.print("Date Hired(Date): ");
            int date = input.nextInt();
            Employee e = new Employee(name,address,phone,email,salary,office,year,month,date);
            //output
            System.out.println(e.toString());
        }
        else if(choice==3){
            System.out.print("Office: ");
            String office = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            input.nextLine();
            System.out.print("Office hours: ");
            String officeHours = input.nextLine();
            System.out.print("Rank: ");
            String rank = input.nextLine();
            System.out.print("Date Hired(Year): ");
            int year = input.nextInt();
            System.out.print("Date Hired(Month): ");
            int month = input.nextInt();
            System.out.print("Date Hired(Date): ");
            int date = input.nextInt();
            Faculty f = new Faculty(name,address,phone,email,salary,office,year,month,date);
            f.setOfficeHours(officeHours);
            f.setRank(rank);
            //output
            System.out.println(f.toString());
        }
        else if(choice==4){
            System.out.print("Office: ");
            String office = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            input.nextLine();
            System.out.print("Office hours: ");
            String officeHours = input.nextLine();
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("Date Hired(Year): ");
            int year = input.nextInt();
            System.out.print("Date Hired(Month): ");
            int month = input.nextInt();
            System.out.print("Date Hired(Date): ");
            int date = input.nextInt();
            Staff st = new Staff(name,address,phone,email,salary,office,year,month,date);
            st.setTitle(title);
            //output
            System.out.println(st.toString());
        }
    }
}
   
