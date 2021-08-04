/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
public class Main3 {
    public static void main(String[] args) {
        Couse c = new Couse("latkrabang");
        c.addStudent("Alice");
        c.addStudent("Benz");
        c.addStudent("Zico");
        c.addStudent("Dean");

        System.out.println("Number of student : " + c.getNumberOfStudents());
        for(int n=0;n<c.getNumberOfStudents();n++)
        {
            System.out.println(c.getStudents()[n]);
        }
        System.out.println("dropStudent name : Alice");
        c.dropStudent("Alice");
        System.out.println("Number of student : " + c.getNumberOfStudents());
        for(int n=0;n<c.getNumberOfStudents();n++)
        {
            System.out.println(c.getStudents()[n]);
        }

        c.clear();
        System.out.println("Number of student : " + c.getNumberOfStudents());
        for(int n=0;n<c.getNumberOfStudents();n++)
        {
            System.out.println(c.getStudents()[n]);
        }
    }
}

