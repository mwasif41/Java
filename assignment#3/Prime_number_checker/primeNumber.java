import java.util.Scanner;

public class primeNumber {
		static public boolean isPrime(int n){
			boolean isprime = false;
			for(int i=2; i<= n/2 ; i++){
				if(n%i==0){
					return isprime;
				}
			}
			isprime = true;
			return isprime;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number to check");
			int num = s.nextInt();
			boolean check = isPrime(num);
			if(check == true)
				System.out.println("The given number is a prime number");
			else
				System.out.println("The given number is not a prime number");
			
				
			
	}

}
