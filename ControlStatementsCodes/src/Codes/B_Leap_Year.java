package Codes;

import java.util.Scanner;
import java.util.Date;

public class B_Leap_Year {
public static void main(String[] args) {
	
	Scanner reader = new Scanner (System.in);
	
	Date d=new Date();  
    @SuppressWarnings("deprecation")
	int year=d.getYear();
    int currentYear=year+1900; 
    
    if(currentYear % 4 == 0) {
    	System.out.println("The current year is a leap year.");
    }else {
    	System.out.println("The current year isn't a leap year.");
    }
    
    System.out.println("Type a year to see if it was or will be a leap year...");
    int typedYear = reader.nextInt();
    
    reader.close();
    
    if(typedYear % 4 == 0) {
    	System.out.println("The choosen year was/will be a leap year.");
    }else {
    	System.out.println("The choosen year wasn't/will not be a leap year.");
    }
	
 }
}
