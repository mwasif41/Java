import java.util.Scanner;

public class simpleCalculator {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int firstNum,secondNum;
		System.out.println("Enter first number");
		firstNum = input.nextInt();
		System.out.println("Enter second number");
		secondNum = input.nextInt();
		System.out.println("enter a option you want to enter");
		System.out.println("Add " + " Subtract " + " Multiply " + " Divide ");
		input.nextLine(); // That's because the Scanner.nextInt method does not consume the last newline character of your input, and thus that newline is consumed in the next call to Scanner.nextLine.
		String userChoice = input.nextLine();
		userChoice=userChoice.toUpperCase();
		
		float output=0;
		switch(userChoice){
			case "ADD" :
				output = firstNum + secondNum;
			break;
			case "SUBTRACT" :
				output = firstNum - secondNum;
			break;
			case "MULTIPLY" :
				output = firstNum * secondNum;
			break;
			case "DIVIDE" :
				output = firstNum / secondNum;
			break;
			
			default:
			System.out.println("invalid choice");
		}
		System.out.println("your result is " + output);
		
	}
}