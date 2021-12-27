import java.time.*;
class Time{
	
	 static void getCurrentTime(){
		     
			 System.out.println(java.time.LocalTime.now());
		   }
		  
	static String getTimeZone(String zone ){
		      
		     return zone; 
	
		   }
	static int getHoursInADay(int hours ){
		      
		     return hours; 
	
		   } 
	static int getTime(int NO_HRS_IN_A_DAY,int NO_MIN_IN_AN_HR){
		     int minutes = (NO_HRS_IN_A_DAY*NO_MIN_IN_AN_HR);
		     return minutes; 
	
		   } 
	static int getTime(int NO_HRS_IN_A_DAY,int NO_MIN_IN_AN_HR,int NO_SEC_IN_AN_HR){
		     int seconds = (NO_HRS_IN_A_DAY*NO_MIN_IN_AN_HR*NO_SEC_IN_AN_HR); 
		     return seconds; 
	
		   } 
	
	
}