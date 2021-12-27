
class TestSwitch{
	
	public static void main(String[]args){
		
		String[] switches = Switch.printTypes();
		
    	 for (String switchtypes:switches){
		 System.out.println(switchtypes);
		 }
		 System.out.println(Switch.aboutSwitch());
		 System.out.println(Switch.countTypes((byte) 2)+"Types");
		 Switch.printTypes(args);
		 
		
    	 
		 
	}
}