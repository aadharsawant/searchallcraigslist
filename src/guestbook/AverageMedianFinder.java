package guestbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AverageMedianFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int median;
		double mediandbl;

		double average;

		System.out
				.println("Enter the integers followed by  enter  ; type N and enter  to end entries ");
		Scanner input = new Scanner(System.in);
		// int size=input.nextInt();
		// int[] arr=new int[size];
		List<Integer> aArrayList = new ArrayList<Integer>();
		// System.out.print(arr.length+"indexes\n");
		double sum = 0;
		int temp;
		while (input.hasNextInt()) {
			temp = input.nextInt();
			aArrayList.add(temp);
			sum = sum + temp;
		}
		if (aArrayList.size() == 0) {
			System.out.println("no input");
			return;
		}

		average = sum / (aArrayList.size());

		System.out.println("Average is " + average);

		Collections.sort(aArrayList);
		if (aArrayList.size() % 2 == 0) {
			double x = aArrayList.get(aArrayList.size() / 2);
			double y = aArrayList.get((aArrayList.size() / 2) - 1);
			mediandbl = (x + y) / 2;

			System.out.println("Median is "+mediandbl);
		} else {

			// int i = Math.ceil((aArrayList.size()-1)/2) );
			median = (aArrayList.get((aArrayList.size() - 1) / 2));
			System.out.println("Median is "+median);
		}

		System.out.println(aArrayList);
		// System.out.println(median);

	}

}
