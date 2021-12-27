
public class HeadphoneRunner{

 public static void main(String []args){
	 
	Headphone E1= new Headphone();  
	System.out.println();

	Headphone E2= new Headphone("Wireless","Blue",2000);
    
	System.out.println();
	
	Headphone E3= new Headphone("Earbuds","White",9000);
	
	System.out.println();
	
    Headphone E4= new Headphone(args);  
	

   }

 }