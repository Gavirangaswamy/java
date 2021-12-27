import java.util.*;

class TestStars{
	
	public static void main(String[]grs){
		String [] s = Stars.printStarsName();
		
    	 for (String star:s){
		 System.out.println(star);
		 
		 }
		 System.out.println(Arrays.toString(s));
		  
		 System.out.println("Length of array :"+Stars.getLength());
	}
}