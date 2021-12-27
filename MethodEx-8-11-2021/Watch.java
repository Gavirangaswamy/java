class Watch{
 static void time(){
 System.out.println("watches are usually show timings");
   }
 static void brands(String []args){
 System.out.println("several names of watches are");
  for(int j=0; j<args.length;j++){
  System.out.println(args[j]);
   }
 
 }
  
  static String name(){
   System.out.println(" names of watch taken");
   String watchname="Fastrack";
   return watchname;
   } 

   String colour(){
  System.out.println("There are different colours of watches");
  String watchcolour="silver";
  System.out.println("colour of the watch is");
  return watchcolour;
  }

 int price(){
 int watchprice=2500;
 System.out.println("price of the watch is");
   return watchprice;
   }

}
   