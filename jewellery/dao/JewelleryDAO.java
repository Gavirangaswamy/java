package com.grs.exception.jewellery.dao;

import com.grs.exception.jewellery.dto.JewelleryDTO;

public class JewelleryDAO {

	JewelleryDTO[] dtos = new JewelleryDTO[3];
	int index = 0;

	public void save(JewelleryDTO dto) {
		if (index < dtos.length) {
			dtos[index] = dto;
			index++;
			System.out.println("Object saved");
		} else {
			throw new DataNotSavedException("Object is not saved");
		}
	}

	public void printAll() {
		for (JewelleryDTO jewelleryDTO : dtos) {
			if (jewelleryDTO != null) {
				System.out.println(jewelleryDTO);
			} else {
				throw new NullPointerException();
			}
		}
	}

	public JewelleryDTO updatePriceByDesignNumber(int designNumber, int price) {
		JewelleryDTO dto = null;
		boolean check = false;
		for (int i = 0; i < dtos.length; i++) {
			if (designNumber == dtos[i].getDesignNumber()) {
				dtos[i].setPrice(price);
				dto = dtos[i];
				check = true;
				System.out.println("Data updated");
			} 
		}
		if (check == false) {
			throw new DataNotUpdatedException("Data not updated");
		}
		return dto;
	}

	public JewelleryDTO updateWeightByType(String type, double weight) {
		JewelleryDTO dto = null;
		boolean check=false;
		for (int i = 0; i < dtos.length; i++) {
			if (type.equals(dtos[i].getType())) {
				dtos[i].setWeight(weight);
				dto = dtos[i];
				check =true;
				System.out.println("Data updated");

			}
		}
		if (check == false) {
			throw new DataNotUpdatedException("Data not updated");
		}
		return dto;
	}

	public JewelleryDTO getByColor(String color) {
		JewelleryDTO dto = null;
		boolean check = false;
		for (int i = 0; i < dtos.length; i++) {
			if (color.equals(dtos[i].getColor())) {
				dto = dtos[i];
				check = true;
				System.out.println("Data Found");
			
			}
		}
		if (check == false) {
			throw new DataNotFoundException("Data not Found");
		}
		return dto;
	}

	public String deleteBytypeOfMetal(String typeOfMetal) {
		boolean check = false;
		for (int i = 0; i < dtos.length; i++) {
			if (typeOfMetal == dtos[i].getTypeOfMetal()) {
				dtos[i] = null;
				check = true;
			}
		}
		if (check == false) {
			throw new DataNotDeletedException("Data not Deleted");
		}
		return "Deleted";
	}

}
