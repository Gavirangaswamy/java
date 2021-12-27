
public class AccountRunner {

	public static void main(String[] args) {
		
		 Account acc = new Account();
		
		 Account.username("sasasasajsshas");
		System.out.println(acc.password(15895694));
		
		String[] arr = acc.typesOfAccount(args);
		
		for(int i = 0 ; i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}

	}

}
