
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HospitalRunner {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		
		Hospital patient1 = new Hospital();
		
		Hospital.setHospitalName("GRS Hospital");
		patient1.setPatientID((byte)11);
		patient1.setPatientName("john");
		patient1.setpAdmitDate("11-Oct-2021 15:25:00");
		Date pADate = date.parse(patient1.getpAdmitDate());
		patient1.setDoctorName("Dr.Mahesh");
		patient1.setDisease("Cancer");
		patient1.setBill(1500000);
		
		patient1.printDetailsOfPatient(pADate);
		 
		System.out.println();
		
        Hospital patient2 = new Hospital();
		
		Hospital.setHospitalName("GRS Hospital");
		patient2.setPatientID((byte)13);
		patient2.setPatientName("Joe biden");
		patient2.setpAdmitDate("18-Oct-2021 11:25:00");
		Date pADate1 = date.parse(patient2.getpAdmitDate());
		patient2.setDoctorName("Dr.Suresh");
		patient2.setDisease("Dengue");
		patient2.setBill(50000);
		
		patient2.printDetailsOfPatient(pADate1);
		
		System.out.println();
		
        Hospital patient3 = new Hospital();
		
		Hospital.setHospitalName("GRS Hospital");
		patient3.setPatientID((byte)11);
		patient3.setPatientName("sameera");
		patient3.setpAdmitDate("01-Sep-2021 1:00:00");
		Date pADate2 = date.parse(patient3.getpAdmitDate());
		patient3.setDoctorName("Dr.Ramesh");
		patient3.setDisease("Tuberculosis");
		patient3.setBill(500000);
		
		patient3.printDetailsOfPatient(pADate2);



	}

}
