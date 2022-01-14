package hospitalProject;

import java.util.Scanner;

public class HospitalRunner {
	
	 private static Hospital hospital1 = new Hospital();

	
	public static void main(String[] args) {
		
		Hospital hospital1= new Hospital();
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Hastaliginizi giriniz");
		String condition= scan.next();
		
		System.out.println("we will find");
	
		
	   System.out.println( findDoctorTitle(condition));
	  
		
		

	}
	
	public static String findDoctorTitle(String condition) {
		System.out.println("method");
		
		String doctorInfo = "";
		
		System.out.println("==");
		
	
		if(condition.equalsIgnoreCase("Dermatologist")||condition.equalsIgnoreCase("tumor")) {
			return hospital1.titles[0];
		}
		else if(condition.equalsIgnoreCase("Internist")||condition.equalsIgnoreCase("heart diseases")) {
			return hospital1.titles[1];
		}
		else if(condition.equalsIgnoreCase("Neurologist")||condition.equalsIgnoreCase("muscle"))
			{return hospital1.titles[2];}
		else if(condition.equalsIgnoreCase("Ophthalmologist")||condition.equalsIgnoreCase("vision"))
			{return hospital1.titles[3];}
		else if(condition.equalsIgnoreCase("Pediatrist")||condition.equalsIgnoreCase("allergy"))
			{return hospital1.titles[4];}
		else if(condition.equalsIgnoreCase("Generalist")||condition.equalsIgnoreCase("headache"))
			{return hospital1.titles[5];}
		else 
			return "wrong case";
	}

}
