package com.grs.digitalWallet.dao;

import java.time.LocalDate;

import com.grs.digitalWallet.dto.GRSWalletDTO;

public class WalletDAOImp implements WalletDAO {
	GRSWalletDTO[] dtos = new GRSWalletDTO[3];
	int index = 0;
	int count = 0;
	double total_Transaction = 0.0;

	@Override
	public String createAccount(GRSWalletDTO dto) {
		if (index < dtos.length) {
			dtos[index] = dto;
			index++;
			return "Account Created";
		}
		return "Account Not Created";
	}

	@Override
	public double getAvailbleBalance(long mobileNo) {
		double balance = 0.0;
		boolean check = false;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null && mobileNo == dtos[i].getMobileNo()) {
				balance = dtos[i].getAvailableCurrentBalance();
				return balance;
			}
		}
		System.out.println("Enter Valid MobileNumber");

		return balance;
	}

	@Override
	public double addMoney(double credit, long mobileNo) {
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null && mobileNo == dtos[i].getMobileNo()) {
				double updated_balance = dtos[i].getAvailableCurrentBalance() + credit;
				dtos[i].setAvailableCurrentBalance(updated_balance);
				System.out.println("Mobile no." + dtos[i].getMobileNo() + " CREDIT with amount Rs." + credit + " on"
						+ LocalDate.now() + "." + " Upadated Balance : Rs." + updated_balance);
				count++;
				total_Transaction += credit;
			}
		}
		return credit;
	}

	@Override
	public double pay(double debit, long mobileNo) {
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null && mobileNo == dtos[i].getMobileNo()) {
				double updated_balance = dtos[i].getAvailableCurrentBalance() - debit;
				dtos[i].setAvailableCurrentBalance(updated_balance);
				System.out.println("Mobile no." + dtos[i].getMobileNo() + " DEBIT with amount Rs." + debit + " on"
						+ LocalDate.now() + "." + " Upadated Balance : Rs." + updated_balance);
				count++;
				total_Transaction += debit;
			}
		}
		return debit;
	}

	@Override
	public byte getNoOfAvailableTansactions(long mobileNo) {
		byte noOfTransaction = 0;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null) {
				if (mobileNo == dtos[i].getMobileNo())
					noOfTransaction = (byte) (dtos[i].getNoOfTransaction() - count);
				dtos[i].setNoOfTransaction(noOfTransaction);
			}
		}
		return noOfTransaction;
	}

	@Override
	public double getTotalTodaysTransaction(long mobileNo) {
		double transaction = 0.0;
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null && mobileNo == dtos[i].getMobileNo()) {
				transaction = total_Transaction;
			}
		}
		return transaction;
	}

}