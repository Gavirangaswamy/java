class TestBreakfast{
 public static void main(String []args){
 
 
 
  Breakfast.types(args);
 
  int bf= Breakfast.price(100);
  System.out.println(bf);



 Breakfast br=new Breakfast();
  String res=br.hotel();
  System.out.println(res);
 
     }

 }