/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Date;

/**
 *
 * @author tp
 */
public class lab073 {
     public static void main(String[] args) {
        // Create a Person, Student, Employee, Faculty, and Staff objects
		Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "012-345-6789", "somsak@mymail.com", 1 );

		//Employee employee = new Employee("Mike", "34 West street", "6189999999","mike80@aol.com", "910", 60000);

		//Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333","sue28@aol.com", "101", 50000, "4pm to 6pm", "Professor");

		//Staff staff = new Staff("Tom", "90 Country road", "2030000000","tomcat@aol.com", "12", 65000, "Executive Assistant");

		// Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(student.toString());
                /*System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());*/
    }
}

class Person {
    //data field 
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
   
    public Person(String name,String address,String phoneNumber,String email)
    {
        this.name = name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    
    // Return a string discription of the class //
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNumber + "\nEmail address: " + email;
	}
    
}


//////////////////////////////// STUDENT ////////////////////////////////
class Student 
        extends Person {
    //data field 
    private int status;
    public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;
    
    public Student(String name, String address,String phoneNumber, String email, int status)
    {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    
   public void setStatus(int status) {
		this.status = status; 
	}
    
    public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}
    
    // Return a string discription of the class //
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	} 
}


//////////////////////////////// EMPLOYEE ////////////////////////////////
class Employee
        extends Person {
    //data field 
    private String office;
    private double salary;
    private Date dateHired=new Date();

    public Employee(String name, String address,String phoneNumber, String email,String office, double salary)
    {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
	this.dateHired = new Date();
    }
    
    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
    }
    
    // Return a string discription of the class //
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
    
}

class Faculty 
        extends Employee{
    //data field 
    private String officeHour;
    private String rank;

    public Faculty(String name, String address, String phone, String email, String office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHour = officeHours;
		this.rank = rank;
	}
    
    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    
    public String getOfficeHour() {
        return officeHour;
    }

    public String getRank() {
        return rank;
    }
    
    // Return a string discription of the class //
	public String toString() {
		return super.toString()+"\noffice hours"+ officeHour + "\nRank: "+rank;
}}

class Staff
extends Employee{
    //data field
    private String title;
    public Staff(String name,String address,String phone,String email,String office,double salary,String title){
    super(name,address,phone,email,office,salary);
    this.title=title;
}
    public void setTitle(String title){
        this.title=title;
    }
    
    public String getTitle(){
        return title;
    }
    
    //Return a string discription of the class
    public String toString(){
        return super.toString()+"\nTitle:"+title;
    }
}
    