package com.grs.armory.gun;

import com.grs.armory.gun.dao.GunDAO;
import com.grs.armory.gun.dto.Bullet;
import com.grs.armory.gun.dto.Company;
import com.grs.armory.gun.dto.GunDTO;
import com.grs.armory.gun.dto.GunTypes;

public class GunRunner {

	public static void main(String[] args) {
		
		GunDAO dao = new GunDAO();
		
		GunDTO gun1 = new GunDTO();
		gun1.setMaterial("Bronze");
		gun1.setTypes(GunTypes.ASSAULTRIFLES);
		gun1.setRange(440.5f);
		gun1.setMagzineSize(30);
		
		Bullet bullet1 = new Bullet();
		bullet1.setMaterial("copper");
		bullet1.setShapes("Round nose");
		bullet1.setExplosive("Nitrate powder");
		bullet1.setCaliber("3.56gms & 5.55");
		gun1.setBullet(bullet1);
		
		Company company1 = new Company();
		company1.setCname("GRS ARMORY");
		company1.setFounder("Gavirangaswamy");
		company1.setContact(9632587410l);
		company1.setMail("grs@mail.com");
		company1.setAddress("Bangalore");
		gun1.setcDetails(company1);
		
		GunDTO gun2 = new GunDTO();
		gun2.setMaterial("Aluminum");
		gun2.setTypes(GunTypes.PISTOL);
		gun2.setRange(540.5f);
		gun2.setMagzineSize(6);
		
		Bullet bullet2 = new Bullet();
		bullet2.setMaterial("Steel");
		bullet2.setShapes("Round nose");
		bullet2.setExplosive("Nitrate powder");
		bullet2.setCaliber("4.56gms & 7.55");
		gun2.setBullet(bullet2);
		
		Company company2 = new Company();
		company2.setCname("ARUN ARMORY");
		company2.setFounder("Arun");
		company2.setContact(9874125896l);
		company2.setMail("arun@mail.com");
		company2.setAddress("Tumkur");
		gun2.setcDetails(company2);
		
		GunDTO gun3 = new GunDTO();
		gun3.setMaterial("bismuth");
		gun3.setTypes(GunTypes.SNIPERS);
		gun3.setRange(860.5f);
		gun3.setMagzineSize(20);
		
		Bullet bullet3 = new Bullet();
		bullet3.setMaterial("Tin");
		bullet3.setShapes("Round nose");
		bullet3.setExplosive("Nitrate powder");
		bullet3.setCaliber("4.56gms & 7.55");
		gun3.setBullet(bullet3);
		
		Company company3 = new Company();
		company3.setCname("NAGESH ARMORY");
		company3.setFounder("Nagesh");
		company3.setContact(9875665478l);
		company3.setMail("nagesh@mail.com");
		company3.setAddress("Mysore");
		gun3.setcDetails(company3);
		
		System.out.println(dao.insert(gun1));
		System.out.println(dao.insert(gun2));
		System.out.println(dao.insert(gun3));
		dao.printAll();
		System.out.println();
		System.out.println("Get Method 👇👇👇");
		GunDTO[] bytype = dao.getByType(GunTypes.SNIPERS);
		for (GunDTO gunDTO : bytype) {
			System.out.println(gunDTO);
		}
		GunDTO[] bycompany = dao.getAllByCompany(company2);
		for (GunDTO gunDTO : bycompany) {
			System.out.println(gunDTO);
		}
		System.out.println();
		System.out.println("Update Method 👇👇👇");
		System.out.println(dao.updateRangeByType(500, GunTypes.ASSAULTRIFLES));
		System.out.println();
		System.out.println("Delete Method 👇👇👇");
		System.out.println(dao.deleteByMagzinesize(30));
		System.out.println(dao.deleteByMaterial("Aluminum"));
		System.out.println();
		dao.printAll();
		
		System.out.println();
		System.out.println("Inserting GunDTO Array");
		GunDTO[] guns$ = {gun1,gun2,gun3};
		dao.insertAll(guns$);
		for (GunDTO gunDTO : guns$) {
			System.out.println(gunDTO);
			
		}
		

	}

}
