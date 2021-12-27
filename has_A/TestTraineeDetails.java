package com.grs.has_A;

import com.grs.has_A.dao.TraineeOperation;
import com.grs.has_A.dtos.AdressDTO;
import com.grs.has_A.dtos.AreaDTO;
import com.grs.has_A.dtos.DistrictDTO;
import com.grs.has_A.dtos.StateDTO;
import com.grs.has_A.dtos.TalukDTO;
import com.grs.has_A.dtos.TraineeDetails;

public class TestTraineeDetails {
	public static void main(String[] args) {
		TraineeDetails traineedetail = new TraineeDetails();
		traineedetail.setName("Gavirangaswamy D G");
		traineedetail.setContactno(9859499994l);
		traineedetail.setEmail("gavirangaswamy.xworkz@gmail.com");
		AdressDTO adress = new AdressDTO();
		adress.setBuildingName("Srinivasa nilaya");
		traineedetail.setAdress(adress);
		AreaDTO area = new AreaDTO();
		area.setAreaName("Dasarighatta");
		adress.setArea(area);
		DistrictDTO district = new DistrictDTO();
		district.setName("Tumkur Gramantara");
		area.setDistrict(district);
		TalukDTO taluk = new TalukDTO();
		taluk.setName("Tiptur");
		district.setTaluk(taluk);
		StateDTO state = new StateDTO();
		state.setName("Karnataka");
		state.setCountry("India");
		taluk.setState(state);

		TraineeDetails traineedetail1 = new TraineeDetails();
		traineedetail1.setName("Nagesh");
		traineedetail1.setContactno(9739538340l);
		traineedetail1.setEmail("nagesh.xworkz@gmail.com");
		AdressDTO adress1 = new AdressDTO();
		adress1.setBuildingName("janani nilaya");
		traineedetail1.setAdress(adress1);
		AreaDTO area1 = new AreaDTO();
		area1.setAreaName("Anekere");
		adress1.setArea(area1);
		DistrictDTO district1 = new DistrictDTO();
		district1.setName("Tumkur");
		area1.setDistrict(district1);
		TalukDTO taluk1 = new TalukDTO();
		taluk1.setName("Turuvekere");
		district1.setTaluk(taluk1);
		StateDTO state1 = new StateDTO();
		state1.setName("Karnataka");
		state1.setCountry("India");
		taluk1.setState(state1);

		TraineeDetails traineedetail2 = new TraineeDetails();
		traineedetail2.setName("Soma");
		traineedetail2.setContactno(9743065930l);
		traineedetail2.setEmail("somashekar.xworkz@gmail.com");
		AdressDTO adress2 = new AdressDTO();
		adress2.setBuildingName("narayana nilaya");
		traineedetail2.setAdress(adress2);
		AreaDTO area2 = new AreaDTO();
		area2.setAreaName("Praja nagar");
		adress2.setArea(area2);
		DistrictDTO district2 = new DistrictDTO();
		district2.setName("Dharwad");
		area2.setDistrict(district2);
		TalukDTO taluk2 = new TalukDTO();
		taluk2.setName("Dharwad");
		district2.setTaluk(taluk2);
		StateDTO state2 = new StateDTO();
		state2.setName("Karnataka");
		state2.setCountry("Hindustan");
		taluk2.setState(state2);

		TraineeOperation operation = new TraineeOperation();
		operation.save(traineedetail);
		operation.save(traineedetail1);
		operation.save(traineedetail2);
		operation.printAll();
		System.out.println();
		TraineeDetails res = operation.updateCountryByName("Nagesh", "Bharatha");
		System.out.println(res);
		System.out.println();
		TraineeDetails response = operation.getByCountry("India");
		System.out.println(response);
		System.out.println();
		TraineeDetails response1 = operation.getByDistrict("Dharwad");
		System.out.println(response1);
	}
}
