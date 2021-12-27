class Application{
	
  
	 static String about(String description ){
		     
			return description; 
		   }
 	   
	static boolean isMultiTaskingApp(String confirm ){
		   String s =  confirm.toLowerCase();
		    if(s =="yes")
		        return true;
			else
				return true;	
		   }
		
	static String type(String type ){
		    if(type =="computer")
		        return "Computer Application";
			else  if(type =="mobile")
		        return "Mobile Application";
			else
				return "No match";
		   }
		   
	static void type(int noTypes){
		System.out.println(noTypes+"types of application");
		       System.out.println("1.Computer Application");
			
		       System.out.println("2.mobile Application");
	
		   }

}
	
	
	
