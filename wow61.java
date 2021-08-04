/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tp
 */
public class wow61 {
    public static void main(String[] args) {

        BMI bmi = new BMI("Hoi", 19, 100, 5, 0.63);

        System.out.println("");
        System.out.println("Name : " + bmi.getName());
        System.out.println("Age : " + bmi.getAge());
        System.out.println("Weight : " + bmi.getWeight() +" kg");
        System.out.printf("Height : %.0f cm",bmi.getHeight() * 100);
        System.out.println("");
        System.out.println("BMI : " + bmi.getBMI());

        if (bmi.getBMI() < 18.5) {
            System.out.println("Underweight\n");
        } else if (bmi.getBMI() >= 18.5 && bmi.getBMI() < 25.0) {
            System.out.println("Normal\n");
        } else if (bmi.getBMI() >= 25.0 && bmi.getBMI() < 30.0) {
            System.out.println("Overweight\n");

        } else if (bmi.getBMI() >= 30.0) {
            System.out.println("Obese\n");

        } else {
            System.out.println("\nError\n");
        }
        
        
    }
}
/*class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;

        /////////pond = weight *  0.45359237///////
        this.weight = weight * 0.45359237;

        ///////feet to inches = feet*12/////////
        //////inches to m = inches * 0.0254//////
        inches = (feet * 12) + inches;
        this.height = inches * 0.0254;
    }

    public BMI() {

    }

    public double getBMI() {
        return weight / Math.pow(height, 2);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}*/