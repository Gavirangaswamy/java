class Pilot{
	
	static char getFirstLetterOfName(){
		String name = "Gavirangaswamy";
		char ch = name.charAt(0);
		return ch;
		
	}  
	static void getAllChar(){
      String name = "Gavirangaswamy";	
	  for(int i=0; i<name.length();i++){	  
        char c = name.charAt(i);  
        System.out.println("char at "+i+" index is: "+c);  
      } 
	}
	static boolean canPilotControlsAircraft(String fitness){
		if(fitness=="Good"){
	return true;
		}else{
		return false;}
}
}