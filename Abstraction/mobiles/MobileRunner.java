package com.grs.mobiles;

import com.grs.mobiles.dao.MobileFunctionsImp;
import com.grs.mobiles.dto.MobileDTO;

public class MobileRunner {

	public static void main(String[] args) {

		MobileFunctionsImp functionsImp = new MobileFunctionsImp();

		MobileDTO dto1 = new MobileDTO();
		dto1.setBrandName("VIVO");
		dto1.setMemory((byte) 128);
		dto1.setMobileID(123654789);
		dto1.setModelName("VIVO Z1X");
		dto1.setNoOfCamera((byte) 3);
		dto1.setPrice(18000);
		dto1.setSerialNumber(147896325874l);

		MobileDTO dto2 = new MobileDTO();
		dto2.setBrandName("OnePlus");
		dto2.setMemory((byte) 128);
		dto2.setMobileID(147852369);
		dto2.setModelName("OnePlus 9R");
		dto2.setNoOfCamera((byte) 4);
		dto2.setPrice(46000);
		dto2.setSerialNumber(25896325741l);

		MobileDTO dto3 = new MobileDTO();
		dto3.setBrandName("Apple");
		dto3.setMemory((byte) 256);
		dto3.setMobileID(258963214);
		dto3.setModelName("Iphone 13");
		dto3.setNoOfCamera((byte) 3);
		dto3.setPrice(86000);
		dto3.setSerialNumber(58635712358l);

		functionsImp.add(dto1);
		functionsImp.add(dto2);
		functionsImp.add(dto3);
		System.out.println("GetAllMethod👇");
		functionsImp.getAll();
		System.out.println();
		System.out.println("Update👇");
		System.out.println(functionsImp.updatePriceBySerialNumber(58635712358l, 96258));
		System.out.println();
		System.out.println("Delete👇");
		System.out.println(functionsImp.deleteByMobileID(147852369));
		System.out.println();
		System.out.println("After deletion");
		functionsImp.getAll();
		System.out.println();
		System.out.println("GetByBrandName👇");
		functionsImp.getAllByBrandName("VIVO");
		System.out.println();
		System.out.println("hashcode");
		System.out.println(dto1.hashCode());
		System.out.println(dto2.hashCode());
		System.out.println(dto3.hashCode());

		System.out.println(dto1.equals(dto3));

	}

}
