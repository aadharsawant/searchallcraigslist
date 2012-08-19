package guestbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordToNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String,Integer> numbMap = new HashMap<String,Integer>();
		
		numbMap.put("hundred", 100);
		numbMap.put("one", 1);
		numbMap.put("two", 2);
		numbMap.put("three", 3);
		numbMap.put("four", 4);
		numbMap.put("five", 5);
		numbMap.put("six", 6);
		numbMap.put("seven", 7);
		numbMap.put("eight", 8);
		numbMap.put("nine", 9);
		numbMap.put("ten", 10);
		numbMap.put("eleven", 11);
		numbMap.put("twelve", 12);
		numbMap.put("thirteen", 10);
		numbMap.put("fourteen", 10);
		numbMap.put("fifteen", 10);
		numbMap.put("sixteen", 10);
		numbMap.put("seventeen", 10);
		numbMap.put("eighteen", 10);
		numbMap.put("nineteen", 10);
		numbMap.put("twenty", 20);
		numbMap.put("thirty", 30);
		numbMap.put("forty", 40);
		numbMap.put("fifty", 50);
		numbMap.put("sixty", 60);
		numbMap.put("seventy", 70);
		numbMap.put("eighty", 80);
		numbMap.put("ninety", 90);
		
		// TODO Auto-generated method stub

		System.out
		.println("Please enter your number ");
		
		Scanner input = new Scanner(System.in);
		
		String wordNumber = input.nextLine();
		
		if (wordNumber!=null)
		{
			wordNumber = wordNumber.toLowerCase();
		}
		
		
		System.out.println(wordNumber);
		
//		while(input.hasNext())
//		{
//		
//		String wordNumber = input.next();
//		
//		
//		
//		}
		
	String[] wordArray = wordNumber.split("\\s");
	
	Integer number = 0;
	boolean addition = false ;
	

	for (int i = 0;i<wordArray.length;i++)
	{
		
		if (addition)
		{
			number = number + numbMap.get(wordArray[i]);
		}
	if (wordArray[i].equalsIgnoreCase("hundred") && (!addition))
	{
			
			if (i>0)
			{
				number = numbMap.get(wordArray[i-1])*100;
			}
			else
			{
				number =100 ;
			}
			addition=true;
					//*100;
	}
	
	
			
			
		
	}
		
		System.out.println("number in digit is "+number);
		
	}

}
