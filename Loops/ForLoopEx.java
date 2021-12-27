//program for for loop
import java.util.*;
class ForLoopEx{
	
	public static void main(String [] grs){
		//connect input stream with the keyboard
		Scanner obj=new Scanner(System.in);
		
		//read input Now
		System.out.println("Please enter 1st number");
		int n = obj.nextInt();
		System.out.println("Please enter 2nd number");
		int m = obj.nextInt();
		
		for ( int i=1;i<=10;i++){
			System.out.println(n+"x"+i+"="+(n*i));
		}
		
		for ( int i=1;i<=10;i++){
			System.out.printf("%d * %d = %d\n",m,i,(m*i));
		}
	}
	
	
}