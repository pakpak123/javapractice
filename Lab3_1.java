/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author tp
 */
public class Lab3_1 {

    public static boolean palindom(int narak) {
        int num = narak, reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        boolean palindom = false;
        // reversed integer is stored in variable 
        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger) {
            palindom = true;

        }
        return palindom;
    }

    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 100; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        
// Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
// Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

// Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {

                if (palindom(number)) {
                    count++; // Increase the count
                    if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                        // Display the number and advance to the new line
                        System.out.println(number);
                    } else {
                        System.out.print(number + " ");
                    }
                }
            }
            number++;
        }
    }
}
