class StringEx
{
  public static void main(String ar[])
  {
        //creating string object
		String str = new String("LearnJava");
		
		String name = "     Gavirangaswamy      ";
		
		System.out.println("str value is  "+str);
		System.out.println("name:  "+name);
		int len_name = name.length();
		String trim_name = name.trim();
		
		System.out.println("length of string : "+len_name);
		System.out.println("after trim : "+trim_name);
		System.out.println("index of r : "+name.indexOf("r"));
		System.out.println("uppercase : " +name.toUpperCase());
		System.out.println("lowerrcase : " +name.toLowerCase());
		System.out.println("String starts with : " +name.endsWith("G"));
		System.out.println("String ends with : " +name.startsWith("G"));
		System.out.println("String startsWith : " +name.startsWith(" "));
		System.out.println("replacing with Y : "+name.replace("y","Y"));
		System.out.println("after replacing : "+name); // value not changed bcz String is immutable
  }
  
}