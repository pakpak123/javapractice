/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author tp
 */
public class Staff extends Employee{
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

