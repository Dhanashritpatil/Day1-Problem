package basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
         int year;
		System.out.println("Enter the year:");
		Scanner y = new Scanner(System.in);
		year=y.nextInt();
		
		if(year%400 ==0 || year%4 == 0 && year% 100!= 0)
		{System.out.println("Year is Leap");
	}
		else {
			System.out.println("Year is Not Leap");
		}
			
		}
}
