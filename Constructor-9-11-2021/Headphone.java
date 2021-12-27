public class Headphone{
	
	 String type;
	 int price ;
	 String colour ;
	 String[] brands = new String[5];

	 Headphone()
	 		{
	 			System.out.println("Used for listening to sound from a computer,music player, or other such electronic device.");
	 		}
	 Headphone(String[] brands)
		    {
			    this.brands =brands;
			  
			  	for(int i = 0; i<brands.length;i++){
		        System.out.println("Brand :"+brands[i]);
	 		}
			} 			
     Headphone(String type)
		    {
			  this.type=type;
			} 			 			
	 Headphone(String type,String colour,int price)
		    {
			  this(type); 
	          this.price=price;
	          this.colour=colour;

	        
	          System.out.println("Type of the Headphone :"+type);
			  System.out.println("price of the Headphone :"+price);
			  System.out.println("colour of the Headphone :"+colour);
	       }
	}