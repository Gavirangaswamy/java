class Cycle{
 static void travel(){
 System.out.println("using cycle we can travel from one place to another");
  }
 static void brand(String []args){
  System.out.println("several brands of cycles are");
  for(int i=0; i<args.length; i++){
  System.out.println(args[i]);
   }
 
 }
 
 static int travel(int cycleprice){
  System.out.println("using cycle we can travel from one place to another" +"\t" + cycleprice);
   System.out.println("price of hero cycle is");
  return cycleprice;
   }
   
 static float travel(float cycleweight , int cycleprice){
   System.out.println("using cycle we can travel from one place to another" +"\t" + cycleprice +"\t" +cycleweight);
 System.out.println("weight of the cycle hero is");
  return cycleweight;
   }

  String colour(){
   String cyclecolour ="cementblack";
  System.out.println("colour of hero cycle is");
  return cyclecolour;
    } 
 

}
  
 
 