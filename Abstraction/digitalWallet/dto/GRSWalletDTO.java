package com.grs.digitalWallet.dto;

import java.util.Objects;

public class GRSWalletDTO {

	private long mobileNo;
	private byte noOfTransaction;
	private int maxLimit;
	private double availableCurrentBalance;

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public byte getNoOfTransaction() {
		return noOfTransaction;
	}

	public void setNoOfTransaction(byte noOfTransaction) {
		this.noOfTransaction = noOfTransaction;
	}

	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	public double getAvailableCurrentBalance() {
		return availableCurrentBalance;
	}

	public void setAvailableCurrentBalance(double availableCurrentBalance) {
		this.availableCurrentBalance = availableCurrentBalance;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"[mobileNo=" + mobileNo + ", NoOfTransaction=" + noOfTransaction
				+ ", maxLimit=" + maxLimit + ", availableCurrentBalance=" + availableCurrentBalance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(noOfTransaction, availableCurrentBalance, maxLimit, mobileNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof GRSWalletDTO)) {
			return false;
		}
		GRSWalletDTO other = (GRSWalletDTO) obj;
		return noOfTransaction == other.noOfTransaction && availableCurrentBalance == other.availableCurrentBalance
				&& maxLimit == other.maxLimit && mobileNo == other.mobileNo;
	}
}
