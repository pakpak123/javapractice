/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tp
 */
public class OMG6_1 {
    public static void main(String[] args) {
        BMI bmi = new BMI("Ko", 18, 100, 5, 0.63);

        System.out.println("");
        System.out.println("Name : " + bmi.getName());
        System.out.println("Age : " + bmi.getAge());
        System.out.println("Weight : " + bmi.getWeight() + " kg");
        System.out.printf("Height : %.0f cm", bmi.getHeight() * 100);
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

class BMI {

    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private double kilo;
    private double meter;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;

        //Note that one pound is 0.45359237 kilograms, and one inch is 0.0254 meters. 
        this.kilo = weight * 0.45359237;
        this.meter = ((feet * 12) + inches) * 0.0254;
        double BMI = kilo / (meter * meter);
    }

    public double getBMI() {
        return kilo / Math.pow(meter, 2);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return kilo;
    }

    public double getHeight() {
        return meter;
    }
}


