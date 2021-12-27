class TestTime{
	
	
  public static void main(String []values){
	  
	    Time.getCurrentTime();
	    System.out.println(Time.getTimeZone("GMT+5.30"));
		System.out.println(Time.getHoursInADay(24));
		System.out.println(Time.getTime(24,60));
		System.out.println(Time.getSecondsInADay(24,60,60));
		
   }

}
	
	
	