package com.nisum.number;
import java.util.Scanner;

/**
 * PrimeNumber class is the class that is used to implement
 * a method which tells weather a number is prime or not 
 * 
 * @author mwasif
 *
 */
public class PrimeNumber {
		/**
		 * @param number an integer number that is being checked
		 * @return isprime aa boolean that is true when a number is prime
		 * and false when a number is false
		 */
		static public boolean isPrime(int number){
			boolean isprime = false;
			// this loop will check weather a number is prime or not
			for(int selectedNumber=2; selectedNumber<= number/2 ; selectedNumber++){
				if(number%selectedNumber==0){
					return isprime;
				}
			}
			isprime = true;
			return isprime;
		}
		
		/** a test method to use the above method in a loop and tells the amount of 
		 * prime number before the given number
		 * @param args
		 */
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number to check");
			int number = scanner.nextInt();
			scanner.close();
			// count is for counting prime number
			int count = 0;
			for(int selectedNumber=2;selectedNumber<number;selectedNumber++){
				if(isPrime(selectedNumber)){
					count++;
				}
			}
			System.out.println("The count of prime number less than the given number is :" + count);
			
				
			
	}

}
