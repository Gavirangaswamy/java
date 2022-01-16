package com.grs.digitalWallet;

import com.grs.digitalWallet.dao.WalletDAOImp;
import com.grs.digitalWallet.dto.GRSWalletDTO;

public class GRSWalletRunner {

	public static void main(String[] args) {

		WalletDAOImp daoImp = new WalletDAOImp();

		GRSWalletDTO dto1 = new GRSWalletDTO();
		dto1.setMobileNo(9874563210l);
		dto1.setAvailableCurrentBalance(2562.32);
		dto1.setMaxLimit(100000);
		dto1.setNoOfTransaction((byte) 10);
		GRSWalletDTO dto2 = new GRSWalletDTO();
		dto2.setMobileNo(9852148963l);
		dto2.setAvailableCurrentBalance(25631.32);
		dto2.setMaxLimit(200000);
		dto2.setNoOfTransaction((byte) 10);
		System.out.println(dto1);
		System.out.println(dto2);
		System.out.println(daoImp.createAccount(dto1));
		System.out.println(daoImp.createAccount(dto2));
		System.out.println(daoImp.getAvailbleBalance(9874563210l));
		System.out.println(daoImp.getAvailbleBalance(985214896l));
		daoImp.addMoney(15623.25, 9874563210l);
		daoImp.pay(500, 9874563210l);
		daoImp.pay(623.57, 9874563210l);
		daoImp.pay(1000, 987456321l);
		daoImp.pay(62, 9874563210l);
		System.out.println("Available Number of Transactions is " + daoImp.getNoOfAvailableTansactions(9874563210l));
		System.out.println("Todays Transaction :"+daoImp.getTotalTodaysTransaction(9874563210l));
		System.out.println("Todays Transaction :"+daoImp.getTotalTodaysTransaction(9852148963l));
		
	}

}
