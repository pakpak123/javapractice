/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.time.LocalDate;

/**
 *
 * @author tp
 */
public class Employee {
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
}
