class Testwatch{
 public static void main(String []args){

  Watch.time();
 
  Watch.brands(args);
  
  String res= Watch.name();
  System.out.println(res);

  Watch col = new Watch();
  String result = col.colour();
  System.out.println(result);

  Watch rate = new Watch();
  int slt= rate.price();
  System.out.println(slt);
 
   }

}