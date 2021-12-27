public class Seeds {
	
	 String brand;
	 String name;
	 float quantity;
	 int price;
	 char colour;
String[] names= new String[4];

	  Seeds(String []names){
		  this.names=names;
		  for(int i=0;i<names.length;i++)
			 System.out.println(names[i]);
	  }
	 Seeds()
	 {
	 System.out.println("seeds are used to grow plants ");
	
	 
	 }
	 Seeds( String brand, String name,float size,int price,char colour){
	  this.brand=brand;
	  this.name=name;
	  this.quantity=quantity;
	  this.price=price;
	  this.colour=colour;
	  System.out.println(brand +"\t" +name +"\t" +quantity +"\t" +price +"\t" +colour);
         }
	  
   }
	 
	 
	