package Codes;

import java.util.Scanner;

public class D_Prime_Number {
public static void main(String[] args) {
	  
	Scanner reader = new Scanner(System.in);

	System.out.println("Type a number and to see if it is a prime number.");
	int number = reader.nextInt();
	reader.close();
	
	boolean flag = false;
	
	for (int i = 2; i <= number / 2; i++) {
		if(number % i == 0) {
			flag = true;
			break;
		}
	  }
	
	if(!flag) {
		System.out.println("The number is a prime number.");
	}else {
		System.out.println("The number isn't a prime number.");
	}
	
   }	
 }

