// program to find prime number


import java.util.*;

class PrimeNum{
		public static void main (String []grs){
			
	    //connect input stream with the keyboard
		Scanner scan=new Scanner(System.in);
		
		//read input Now
		System.out.println("Please enter a number");
		boolean num = scan.nextInt();
			
			for ( int i=2;i<num;i++){
				
				if(num%i!=0){
				return true;
				};
			  return false;
			}
			}
		}