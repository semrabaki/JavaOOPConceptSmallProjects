package hospitalProject;

import java.util.Scanner;

public class HospitalRunner {
	
	 private static Hospital hospital1 = new Hospital();

	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Hastaliginizi giriniz");
		String condition= scan.next();
		
	    String title=findDoctorTitle(condition);
	    int patientId= findPatientId(condition);
	    
	   System.out.println(title);
	   
	   System.out.println(patientId);
	 
	
	   //System.out.println();
	   
	   findDoctorInfo(title);
	   
	   findPatientInfo(patientId);
	
	    
	  System.out.println(hospital1.doctor1.toString());
	  System.out.println(hospital1.patient1.toString());
	 System.out.println(hospital1.case1.toString());
	   
	   
	
		

	}
	
    private static void setEmergency(String condition) {
		
		if(condition.equalsIgnoreCase("Dermatologist")||condition.equalsIgnoreCase("tumor")) {
			hospital1.case1.setEmergency(true);
		}
		else if(condition.equalsIgnoreCase("Internist")||condition.equalsIgnoreCase("heart diseases")) {
			hospital1.case1.setEmergency(true);
		}
		else if(condition.equalsIgnoreCase("Neurologist")||condition.equalsIgnoreCase("muscle"))
			{
			hospital1.case1.setEmergency(false);
			}
		else if(condition.equalsIgnoreCase("Ophthalmologist")||condition.equalsIgnoreCase("vision"))
			{ 
			hospital1.case1.setEmergency(false);
			
			}
		else if(condition.equalsIgnoreCase("Pediatrist")||condition.equalsIgnoreCase("allergy"))
			{
			hospital1.case1.setEmergency(false);
			}
			
		else if(condition.equalsIgnoreCase("Generalist")||condition.equalsIgnoreCase("headache"))
			{
			hospital1.case1.setEmergency(true);
			}
		
	}


	private static void findPatientInfo(int patientId) {
		
		for(int i=0; i<hospital1.patientIds.length; i++)
		{
			if(patientId==hospital1.patientIds[i])
			{
				hospital1.patient1.setPatientId(hospital1.patientIds[i]);

				hospital1.patient1.setPatientName(hospital1.patientNames[i]);
				hospital1.patient1.setPatientLastName(hospital1.patientLastNames[i]);
				
				
				
			}
		}
		
	}


	private static void findDoctorInfo(String title) {
		for(int i=0; i<hospital1.titles.length; i++)
		{
			if(title.equalsIgnoreCase(hospital1.titles[i]))
			{
				hospital1.doctor1.setName(hospital1.doctorNames[i]);
				hospital1.doctor1.setLastname(hospital1.doctorLastNames[i]);
				hospital1.doctor1.setTitle(hospital1.titles[i]);
				
				
			}
		}
		
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

	public static int findPatientId(String condition) {
		System.out.println("method");
		
		String patientInfo = "";
		
		System.out.println("==");
	
		if(condition.equalsIgnoreCase("Dermatologist")||condition.equalsIgnoreCase("tumor")) {
			return hospital1.patientIds[0];
		}
		else if(condition.equalsIgnoreCase("Internist")||condition.equalsIgnoreCase("heart diseases")) {
			return hospital1.patientIds[1];
		}
		else if(condition.equalsIgnoreCase("Neurologist")||condition.equalsIgnoreCase("muscle"))
			{return hospital1.patientIds[2];}
		else if(condition.equalsIgnoreCase("Ophthalmologist")||condition.equalsIgnoreCase("vision"))
			{return hospital1.patientIds[3];}
		else if(condition.equalsIgnoreCase("Pediatrist")||condition.equalsIgnoreCase("allergy"))
			{return hospital1.patientIds[4];}
		else if(condition.equalsIgnoreCase("Generalist")||condition.equalsIgnoreCase("headache"))
			{return hospital1.patientIds[5];}
		else 
			return 0;
	}

}

