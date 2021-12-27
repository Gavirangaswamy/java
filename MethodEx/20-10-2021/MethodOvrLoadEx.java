class MethodOvrLoadEx{
	
	public static void main(String[] grs){
	
		setAlarm();
		setAlarm(5.02f);
		setAlarm(5.30,5);
	}
	static void setAlarm(){
		
		System.out.println("");
	}
	static void setAlarm(float time){
		System.out.println("Alarm set to "+time+ "pm");
	}
	static void setAlarm(double time,int volume){
		System.out.println("Alarm set to "+time+ "0am with Volume level  "+volume);
	}
	
}

