package Codes;

import java.util.Scanner;

public class F_Positive_Numbers_Sum {
public static void main(String[] args) {
	
	Scanner reader = new Scanner (System.in);
	
	System.out.println("Type positive numbers, we will sum them until you type a negative number or 0.");
	System.out.println("Type a number.");
	double num = reader.nextDouble();
	
	double sum = 0; 
	
	do {
		sum = sum + num;
		System.out.println("Type a new number...");
		num = reader.nextDouble();
	}while(num >= 1);
	reader.close();
	
	System.out.println("That's a negative number, shuting down the program...");
	System.out.println("The sum of the positive number is: "+sum);
	
 }
}
