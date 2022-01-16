package com.grs.digitalWallet.dao;

import com.grs.digitalWallet.dto.GRSWalletDTO;

public interface WalletDAO {

	String createAccount(GRSWalletDTO dto);
	
	double getAvailbleBalance(long mobileNo);

	double addMoney(double credit,long mobileNo);

	double pay(double debit,long mobileNo);

	double getTotalTodaysTransaction(long mobileNo);

	byte getNoOfAvailableTansactions(long mobileNo);

}
