package Codes;

import java.util.Scanner;

public class C_Grade_Avarage {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	
	System.out.println("The minimum avarage to aprovance is 7.0");
	
	System.out.println("Type the first grade.");
	String strGrade1 = reader.nextLine();
	double grade1 = Double.parseDouble(strGrade1);
	
	System.out.println("Type the second grade");
	String strGrade2 = reader.nextLine();
	double grade2 = Double.parseDouble(strGrade2);
	
	System.out.println("Type the third grade.");
	String strGrade3 = reader.nextLine();
	double grade3 = Double.parseDouble(strGrade3);
	
	reader.close();
	
	double avarage = (grade1 + grade2 + grade3) / 3;
	
	System.out.println("The grade avarage is "+avarage);
	
	if(avarage >= 7.0) {
		System.out.println("The studant are aproved.");
	}else {
		System.out.println("The studant is reproved.");
	}
	
 }	
}
