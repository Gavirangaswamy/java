class TestCalculator{
  public static void main(String []values){
	  
	  
	  int arr[] = Calculator.readValues(values);
	  for(int i = 0;i<arr.length;i++){
		  arr[i] = Integer.parseInt(values[i]);
		  System.out.println(arr[i]);
	  }
      System.out.println(Calculator.calculate(values)+"\n");
      System.out.println(Calculator.calculate(values,1000));
   }

}