package basic;

import java.util.Scanner;

public class Checkstring {
        public static void main(String[] args) {
        	String str1, str2;
            Scanner sc = new Scanner(System.in);
     
            System.out.println("Enter first String");
            str1 = sc.nextLine();
     
            System.out.println("Enter second String");
            str2 = sc.nextLine();
            // Comparing two input string
            if (str1.equals(str2))
                System.out.print("Equal Strings");
            else
                System.out.print("Not Equal Strings");
        }
		}
       

