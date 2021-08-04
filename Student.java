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
public class Student extends Person {
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

