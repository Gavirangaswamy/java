package com.grs.exception.jewellery;

import com.grs.exception.jewellery.dao.DataNotDeletedException;
import com.grs.exception.jewellery.dao.DataNotFoundException;
import com.grs.exception.jewellery.dao.DataNotUpdatedException;
import com.grs.exception.jewellery.dao.JewelleryDAO;
import com.grs.exception.jewellery.dto.JewelleryDTO;

public class JewelleryRunner {

	public static void main(String[] args) {

		JewelleryDAO dao = new JewelleryDAO();
		
		JewelleryDTO dto1 = new JewelleryDTO();
		dto1.setTypeOfMetal("Gold");
		dto1.setAlloy("copper");
		dto1.setCarat((byte)24);
		dto1.setColor("golden yellow");
		dto1.setDesignNumber(121);
		dto1.setPrice(550000);
		dto1.setWeight(10);
		dto1.setType("Ring");
		
		JewelleryDTO dto2 = new JewelleryDTO();
		dto2.setTypeOfMetal("Silver");
		dto2.setAlloy("copper");
		dto2.setCarat((byte)5);
		dto2.setColor("silver");
		dto2.setDesignNumber(123);
		dto2.setPrice(65000);
		dto2.setWeight(1000);
		dto2.setType("plate");
		
		JewelleryDTO dt03 = new JewelleryDTO();
		dt03.setTypeOfMetal("Platinum");
		dt03.setAlloy("iridium");
		dt03.setCarat((byte)18);
		dt03.setColor("pale grayish white");
		dt03.setDesignNumber(128);
		dt03.setPrice(650000);
		dt03.setWeight(50);
		dt03.setType("neckchain");

		dao.save(dto1);
		dao.save(dto2);
		dao.save(dt03);
		System.out.println();
		dao.printAll();
		System.out.println();
		try {
			System.out.println(dao.updatePriceByDesignNumber(121, 5587955));
		} catch (DataNotUpdatedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println();
		try {
			System.out.println(dao.updateWeightByType("neckchain", 445201));
		} catch (DataNotUpdatedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println();
		try {
			System.out.println(dao.getByColor("silver"));
		} catch (DataNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println();
		try {
			System.out.println(dao.deleteBytypeOfMetal("Gold"));
		} catch (DataNotDeletedException e) {
			System.err.println(e.getMessage());
		}
		
	
	}

}
