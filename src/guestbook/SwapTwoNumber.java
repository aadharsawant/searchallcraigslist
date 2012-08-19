package guestbook;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwapTwoNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		System.out
		.println("Please enter your first number ");
		
		Scanner input = new Scanner(System.in);
		
		BigDecimal number1 = input.nextBigDecimal();
		System.out
		.println("Please enter your second number number ");
		BigDecimal number2 = input.nextBigDecimal();
		
		number1 = number1.add(number2) ;
		number2= number1.subtract(number2);
		number1=number1.subtract(number2);
		
		System.out.println("the swapped numbers are first number :" + number1);
		System.out.println("the swapped numbers are second number :" + number2);

		
	}

}
