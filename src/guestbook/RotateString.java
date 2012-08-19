package guestbook;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RotateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		System.out
		.println("Please enter your String");
		
		Scanner input = new Scanner(System.in);
		
		String inputString = input.nextLine();
		StringBuilder a = new StringBuilder(inputString);
		System.out
		.println("Please enter number of characters to rotate ");
		int characterInt = input.nextInt() ;
		
		if (characterInt>inputString.length())
		{
			System.out
			.println("Number of Character to rotate greater then length of the string");
			return;
		}
		else
		{
			String rotString = inputString.substring(0, characterInt);
			 inputString = inputString.substring(characterInt);

			inputString =inputString.concat(rotString);
			
			System.out.println("rotated string is : " + inputString);
		}
		
		
	}

}
