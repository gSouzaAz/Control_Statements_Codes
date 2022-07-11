package Codes;

import java.lang.Math;
import java.util.Scanner;


public class E_Aleatory_Number {
public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	
	int min = 0;
	int max = 100;
	
	int random = (int)(Math.random()*(max-min+1)+min);
	
	System.out.println("We are going to generate a random number from 0 to 100, try to find out what number it is. (You have 10 chances)");
	System.out.println("Type a number...");
	int num = reader.nextInt();
	
   int chances = 10;
	
    do {
      chances = chances - 1;
      if(chances > 0) {
    	  System.out.println("Wrong number."+"\nYou still have "+chances+" chances.");
    	  if(num > random) {
    		  System.out.println("Tip: the typed number is higher than the random number.");
    	  }else {
    		  System.out.println("Tip: the typed number is lower than the random number.");
    	  }
    	  System.out.println("Type a new number...");
    	  num = reader.nextInt();
      }else if(chances == 0) {
    	  System.out.println("Your chances are over. The random number is: "+random);
      }
    }while(num != random);
    reader.close();
    
    System.out.println("Congratulations!! You got the right number!");
	
  }	
}
