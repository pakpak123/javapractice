/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
public class Couse {
    private int count = 100;
    private String courseName;
    private String[] Students = new String[count];
    private int numberOfStudents;

    public Couse(){

    }
    public Couse(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        if(numberOfStudents==count)
        {
            String[] stu = new String[count*2];
            System.arraycopy(Students, 0, stu, 0, numberOfStudents);  
            count=count*2;
            Students = new String[count];
            System.arraycopy(stu, 0, Students, 0, numberOfStudents);  
            
            
        }
        Students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudent(){
        return Students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String[] getStudents(){
        return Students;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String Student){
        for(int i=numberOfStudents;i>=0;i--)
        {
             if(Students[i]==Student)
             {
                Students[i] = null;
                 numberOfStudents--;
                 for(int n=i;n<numberOfStudents;n++)
                 {
                    Students[n]=Students[n+1];
                 }
             }
        }
    }
    public void clear(){
        while(numberOfStudents > 0)
        {
            numberOfStudents--;
            Students[numberOfStudents] = null;
        }
    }
}

