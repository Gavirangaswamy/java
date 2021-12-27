
public class Zoo {
	
	
	 static String zooName="GRS Vanyajeevidhama";
	 String name;
	 String colour;
	 float length;
	 short weight;
	 boolean isHealthy;
	 
	     Zoo(String name,String colour,float length,short weight,boolean isHealthy){
			this.name=name;
			System.out.println("Animal name :"+name);
			this.colour=colour;
			System.out.println("Animal colour :"+colour);
			this.length=length;
			System.out.println("Animal length :"+length+"cm");
			this.weight=weight;
			System.out.println("Animal weight :"+weight+"kg");
			this.isHealthy=isHealthy;
			if(isHealthy==true) {
				System.out.println(name+"health contition is good");
			}else {
				System.out.println(name+"health contition is bad");
			}
		
}
}
