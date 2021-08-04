/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;
import java.util.Scanner;
/**
 *
 * @author tp
 */
public class Lab_83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        do {
            System.out.print("Menu (1.Circle, 2.Rectangle, 3.Triangle, 4.Exit)\nYour choice : ");
            select = input.nextInt();
            if (select == 1) {

                System.out.print("Circle (1) (name/radius/color/true or false): ");
                String name1 = input.next();
                double r1 = input.nextInt();
                String Color1 = input.next();
                boolean fill1 = input.nextBoolean();

                System.out.println("");

                System.out.print("Circle (2) (name/radius/color/true or false): ");
                String name2 = input.next();
                double r2 = input.nextInt();
                String Color2 = input.next();
                boolean fill2 = input.nextBoolean();

                ComparableCircle A = new ComparableCircle(r1, Color1, fill1);
                Circle B = new Circle(r2, Color2, fill2);

                System.out.println("Equal Circles : " + A.compareEqual(A.compareTo(B)));
                System.out.print("Larger object : ");
                A.MaxArea(A.compareTo(B), B);

            } else if (select == 2) {

                System.out.print("Rectangle (1) (name/side1/side2/color/true or false): ");
                String name1 = input.next();
                double S11 = input.nextInt();
                double S12 = input.nextInt();
                String Color1 = input.next();
                boolean fill1 = input.nextBoolean();

                System.out.print("\n");

                System.out.print("Rectangle (2) (name/side1/side2/color/true or false): ");
                String name2 = input.next();
                double S21 = input.nextInt();
                double S22 = input.nextInt();

                String Color2 = input.next();
                boolean fill2 = input.nextBoolean();

                ComparableRectangle A = new ComparableRectangle(S11, S12, Color1, fill1);
                Rectangle B = new Rectangle(S21, S22, Color2, fill2);

                System.out.println("Equal Circles : " + A.compareEqual(A.compareTo(B)));
                System.out.print("Larger object : ");
                A.MaxArea(A.compareTo(B), B);

            } else if (select == 3) {

                System.out.print("Triangle (1) (name/side1/side2/side3/color/true or false): ");
                String name1 = input.next();
                double S11 = input.nextInt();
                double S12 = input.nextInt();
                double S13 = input.nextInt();
                String Color1 = input.next();
                boolean fill1 = input.nextBoolean();

                System.out.println("");

                System.out.print("Triangle (2) (name/side1/side2/side3/color/true or false): ");
                String name2 = input.next();
                double S21 = input.nextInt();
                double S22 = input.nextInt();
                double S23 = input.nextInt();

                String Color2 = input.next();
                boolean fill2 = input.nextBoolean();

                ComparableTriangle A = new ComparableTriangle(S11, S12, S13, Color1, fill1);
                Triengle B = new Triengle(S21, S22, S23, Color2, fill2);

                System.out.println("Equal Circles : " + A.compareEqual(A.compareTo(B)));
                System.out.print("Larger object : ");
                A.MaxArea(A.compareTo(B), B);

            } else if (select == 4) {
            } else {
                System.out.println("Error");
            }
            System.out.println("");
        } while (select != 4);
    }
}

////////////////////////////////ComparableCircle////////////////////////////////
class ComparableCircle extends Circle
        implements Comparable<Circle>, Cloneable {

    public ComparableCircle(double r, String color, boolean filled) {
        super(r, color, filled);
    }

    public ComparableCircle() {
    }

    public void MaxArea(int a, Circle o) {
        a = compareTo(o);
        if (a == 0) {
            System.out.println("EQUAL");
        } else if (a == 1) {
            System.out.println(toString());
        } else if (a == -1) {
            System.out.println(o.toString());
        }
    }

    public boolean compareEqual(int a) {
        if (a != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Circle o) {
        if (getR() > o.getR()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}

////////////////////////////////ComparableTriangle////////////////////////////////
class ComparableTriangle extends Triengle implements Comparable<Triengle> {

    public ComparableTriangle() {
    }

    public ComparableTriangle(double side1, double side2, double side3, String color, boolean filled) {
        super(side1, side2, side3, color, filled);
    }

    public void MaxArea(int a, Triengle o) {
        a = compareTo(o);
        if (a == 0) {
            System.out.println("EQUAL");
        } else if (a == 1) {
            System.out.println(toString());
        } else if (a == -1) {
            System.out.println(o.toString());
        }
    }

    public boolean compareEqual(int a) {
        if (a != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Triengle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}

////////////////////////////////ComparableRectangle////////////////////////////////
class ComparableRectangle extends Rectangle implements Comparable<Rectangle> {

    public ComparableRectangle(double h, double w, String color, boolean filled) {
        super(h, w, color, filled);
    }

    public ComparableRectangle() {
    }

    public void MaxArea(int a, Rectangle o) {
        a = compareTo(o);
        if (a == 0) {
            System.out.println("EQUAL");
        } else if (a == 1) {
            System.out.println(toString());
        } else if (a == -1) {
            System.out.println(o.toString());
        }
    }

    public boolean compareEqual(int a) {
        if (a != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
