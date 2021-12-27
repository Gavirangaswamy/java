class StringConversion{
	
	public static void main(String[]marks){
			for(int mark=0;mark<marks.length;mark++){
			String CGPA = marks[mark];
			
			int per = Integer.parseInt(CGPA);
			
			float avg = Float.parseFloat(CGPA);
			
			System.out.println(CGPA+" "+per+" "+avg);
			
	}
}