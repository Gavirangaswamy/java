class Switch {
	
	static String typesOfSwitch[]= {"Mechanical switches","Electrical Switches"};
	
	static String aboutSwitch(){
		String about = "A Switch is a device which is designed to interrupt the current flow in a circuit. In simple words, a Switch can make or break an electrical circuit. Every electrical and electronics application uses at least one switch to perform ON and OFF operation of the device.";
		
		return about;
	}
	
	static byte countTypes(byte count){
		
		return count;
	}
	
	
	static String[] printTypes(){
			
            return typesOfSwitch;
	
	}	
	static void printTypes(String []args){
		for (String switchEtypes:args){
		 System.out.println(switchEtypes);
	
	}	
	}
}