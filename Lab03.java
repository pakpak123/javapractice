import java.util.Scanner;
public class Lab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        System.out.print(" Enter a number between 0 - 1000 : ");
        int num = input.nextInt();
        int first = num % 10;
        int second = (num / 10) % 10 ;
        int third = (num / 100) % 10;
        int answer = first + second + third;
    
        if ( num >= 1000 || num <= 0){
        System.out.println("There is no answer.");
        }
        else{
        System.out.println(" The sum of the digits is " + answer);
}
}
}
