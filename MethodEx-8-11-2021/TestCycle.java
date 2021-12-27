class TestCycle{
 public static void main(String []args){
 
 
 
   Cycle.brand(args);
 
  int res= Cycle.travel(7000);
  System.out.println(res);
  System.out.println(Cycle.travel(25.55f , 7000));


  Cycle cyc=new Cycle();
  String result=cyc.colour();
  System.out.println(result);
 
     }

 }