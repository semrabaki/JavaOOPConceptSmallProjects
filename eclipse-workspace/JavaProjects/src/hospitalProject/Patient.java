package hospitalProject;

public class Patient {
	
	private String patientName;
	private String patientLastName;
	private int patientId;
	private Case caseDetail;
	
	public Patient()
	{
		
	}
	public Patient(String patientName, String patientLastName, int patientId, Case caseDetail) {
		this.patientName = patientName;
		this.patientLastName = patientLastName;
		this.patientId = patientId;
		this.caseDetail = caseDetail;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public Case getCaseDetail() {
		return caseDetail;
	}
	public void setCaseDetail(Case caseDetail) {
		this.caseDetail = caseDetail;
	}
	
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientLastName=" + patientLastName + ", patientId="
				+ patientId + ", caseDetail=" + caseDetail + "]";
	}
	
	
	
	
	
	
	
	

}
