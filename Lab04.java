import java.util.Scanner;
public class Lab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                 
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
                
		weight = weight * 0.45359237;
		height = height * 0.0254;

		double Bmi = weight / (height*height);
		System.out.printf("BMI = %.4fBmi" ,Bmi);
    }
}
