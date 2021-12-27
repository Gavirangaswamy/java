
import java.util.Date;

public class Hospital {

	static String hospitalName;
	byte patientID;
	String patientName;
	String doctorName;
	String disease;
	String pAdmitDate;
	int bill;
	
	public static void setHospitalName(String hospitalName) {
		Hospital.hospitalName = hospitalName;
	}
	public void setPatientID(byte patientID) {
		this.patientID = patientID;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public void setpAdmitDate(String pAdmitDate) {
		this.pAdmitDate = pAdmitDate;
	}
	
	public String getpAdmitDate() {
		return pAdmitDate;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public void printDetailsOfPatient(Date pADate) {
		
		System.out.println("Hospital Name : "+hospitalName+"\nPatient ID : "
		+patientID+"\nPatient Name : "+patientName+"\nDoctor Incharge : "
		+doctorName+"\nDisease : "+disease+"\nAdmitted Date : "+pADate);
	}
	
}
