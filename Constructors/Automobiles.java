class Automobiles{
 String type;
 String brand;
 short model ;
 long price ;
 String colour ;
 short maxspeed ;

      Automobiles(String type,String colour,String brand,long price,short model,short maxspeed)
	  {
		  this.type=type;
          this.brand=brand;
          this.model=model;
          this.price=price;
          this.colour=colour;
          this.maxspeed=maxspeed;
		  
          System.out.println("Type of the vehicle :"+type);
		  System.out.println("Brand name :"+brand);
		  System.out.println("Model of the vehicle :"+model);
		  System.out.println("price of the vehicle :"+price);
		  System.out.println("colour of the vehicle :"+colour);
		  System.out.println("MaxSpeed of the vehicle :"+maxspeed+"kmph");
      }

      Automobiles()
      {
         System.out.println("BMW G 310 R");
      }

}
 