

public class BankAccountRunner {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		
		System.out.println(BankAccount.getBankName());
		System.out.println("=========");
		account1.setAccountBalance(213_81_45_625);
		account1.setAccountHolderName("Varsha");
		account1.setAccountNumber(23145687995456321L);
		account1.setAccountType("Savings Bank Account");

		System.out.println("Account Holder Name :"+account1.getAccountHolderName());
		System.out.println("Account Type :"+account1.getAccountType());
		System.out.println("Account Number :"+account1.getAccountNumber());
		System.out.println("Account Balance :"+account1.getAccountBalance());
	}

}
