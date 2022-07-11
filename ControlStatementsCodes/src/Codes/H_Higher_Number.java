package Codes;

import java.util.Scanner;

public class H_Higher_Number {
 public static void main(String[] args) {
	 
	 Scanner reader = new Scanner (System.in);
	 
	 System.out.println("Type 10 numbers, we will recognize the higher one and put it on the console.");
	 System.out.println("Type a number.");
	 double num = reader.nextDouble();
	 
	 int counter = 0;
	 int numCounter = 2;
	 double higherNum = 0;
	 
	 do {
		 counter++;
		 if(num > higherNum) {
			 higherNum = num;
		 }
		 System.out.println("Type the "+numCounter+"º number.");
		 numCounter++;
		 num = reader.nextDouble();
	 }while(counter != 9);
	 reader.close();
	 
	 System.out.println("The higher value was "+higherNum);
 }
}
