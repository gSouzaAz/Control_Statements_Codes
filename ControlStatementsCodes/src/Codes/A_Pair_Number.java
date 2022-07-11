package Codes;

import java.util.Scanner;

public class A_Pair_Number {
public static void main(String[] args) {
	Scanner reader = new Scanner (System.in);
	
	System.out.println("Choose a number between 0 and 10 an we will check if it's a pair number.");
	String Strnumber = reader.nextLine();
	
	int number = Integer.parseInt(Strnumber);
	reader.close();
	
	if(number >= 0 && number <= 10) {
	   if(number % 2 == 0 ) {
		  System.out.println("The choosen number is a pair number."); 
	   }else {
		   System.out.println("The choosen number isn't a pair number.");
	   }
	}else {
		System.out.println("The submited number is not between 0 and 10.");
		System.out.println("Type again, a number between 0 and 10...");
	}
	reader.close();

 }
}
