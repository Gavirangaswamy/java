class TestAeroplane{
 public static void main(String []args){
 
 
 
  Aeroplane.brand(args);
 
  int res= Aeroplane.travel(7000);
  System.out.println(res);



 Aeroplane aer=new Aeroplane();
  String result=aer.colour();
  System.out.println(result);
 
     }

 }