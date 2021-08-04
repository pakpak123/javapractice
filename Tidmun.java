package lab03;

public class Tidmun {

    public static int palindom(int narak) {
        int num = narak, reversedInteger = 0, remainder, originalInteger;
        int line = 10;
        originalInteger = num;

        // reversed integer is stored in variable 
        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger != reversedInteger) {
            narak = 0;

        }
        return narak;

    }

    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 100; // Number of primes to display
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

            if (isPrime) {
                if (palindom(number) != 0) {
                    count++;
                    if (count % 10 == 0) {
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
