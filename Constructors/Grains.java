
public class Grains {

	 String name ;
	 String colour ;
	 float protein;
	 short price;

	  Grains( String name,String colour,float protein,short price){
		  this.name=name;
          this.colour=colour;
          this.price=price;
          this.protein=protein;
		  
		  System.out.println("Name of grain :"+name);
		  System.out.println("price of the grain per kg :"+price);
		  System.out.println("colour of the grain :"+colour);
		  System.out.println("Protein :"+protein+"g/100g of grain");

	   }

	
}
