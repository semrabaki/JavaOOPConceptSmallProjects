package hospitalProject;

public class Hospital extends Data {
	
	private static Doctor doctor;
	private static Patient patient;

	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Object object) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	
	Patient patient1= new Patient();
	Doctor doctor1= new Doctor();
	Case case1= new Case();
	
	
	

}
