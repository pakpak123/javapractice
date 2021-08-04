package lab07;

import java.time.LocalDate;
import java.util.Scanner;

public class LAB0733 {
    public static void main(String[] args) {
    class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    public Person(){
        
    }
    
    public Person(String name,String address,String phoneNumber, String emailAddress){
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", emailAddress=" + emailAddress + ", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    }
    
}
         
    class Employee extends Person{
    private String office;
    private double salary;
    private LocalDate dateHires;
    private int year,month,dateOfMonth;
    
    public Employee(){
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress,double salary,String office,int year,int month,int dateOfMonth) {
        super(name, address, phoneNumber, emailAddress);
        this.setOffice(office);
        this.setSalary(salary);
        this.setDateHires(year,month,dateOfMonth);
    }

    public void setDateHires(int year,int month,int dateOfMonth) {
        this.dateHires = LocalDate.of(year,month,dateOfMonth);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDateOfMonth() {
        return dateOfMonth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDateOfMonth(int dateOfMonth) {
        this.dateOfMonth = dateOfMonth;
    }

    public double getSalary() {
        return salary;
    }

    public String getOffice() {
        return office;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Salary can not be negative");
            return;
        }
        this.salary = salary;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" + "office=" + office + ", salary=" + salary + ", dateHires=" + dateHires + '}';
    }
    
}
    
    class Faculty extends Employee{
    private String officeHours;
    private String rank;
    
    public Faculty(){
        
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress,double salary,String office,int year,int month,int dateOfMonth) {
        super(name, address, phoneNumber, emailAddress,salary,office,year,month,dateOfMonth);
        this.setOfficeHours(officeHours);
        this.setRank(rank);
    }

    public String getOfficeHours() {
        return officeHours;
    }
    /*
        - Associate Professor
        - Professor 
        - Assistant Professor
        - Lecturer
    */
    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }  
}
    
    
    class Student extends Person {
    private final int FRESHMAN = 1;
    private final int SOPHOMORE = 2;
    private final int JUNIOR = 3;
    private final int SENIOR = 4;
    private int status;
    private String statusString;
    
    public Student(){
    }

    public Student(String name, String address, String phoneNumber, String emailAddress,int status) {
        super(name, address, phoneNumber, emailAddress);
        if(status==1) statusString = "Freshman";
        else if(status==2) statusString = "Sophomore";
        else if(status==3) statusString = "Junior";
        else if(status==4) statusString = "Senior";
        else statusString = "Error";
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "status=" + statusString + '}';
    }

    
}

    
    
    class Staff extends Employee{
    private String title;
    
    public Staff(){
        
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress,double salary,String office,int year,int month,int dateOfMonth) {
        super(name, address, phoneNumber, emailAddress,salary,office,year,month,dateOfMonth);
        this.setTitle(title);
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "Staff{" + "title=" + title + '}';
    }
    
}


        
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