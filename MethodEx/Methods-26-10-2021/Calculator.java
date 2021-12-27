class Calculator{
 	  static int[] readValues(String []values){
		      int size = values.length;
		      int[] arr = new int [size];
		      //for(int i=0; i<size; i++) {
		        //arr[i] = Integer.parseInt(values[i]);
		         //System.out.print(arr[i]+"  ");
			  
		       return arr; 
		   }
		  
		 static byte calculate (String []values){
		      byte sum = 0;
		      byte size = (byte) values.length;
		      byte [] arr = new byte [size];
		      for(int i=0; i<size; i++) {
		       arr[i] = Byte.parseByte(values[i]);
			   sum = (byte) (sum + arr[i]);
			  }
			  return sum;
		}
		   static int calculate ( String []values,int dif){
		      int size = values.length;
		      int [] arr = new int [size];
		      for(int i=0; i<size; i++) {
		       arr[i] = Integer.parseInt(values[i]);
			  dif  = dif- arr[i];
			  }
			  return dif;
}

}
    