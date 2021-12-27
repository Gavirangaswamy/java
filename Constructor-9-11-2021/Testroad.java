class Testroad{
  public static void main(String []args){
 
  Road raj=new Road(args);
     

  Road nce=new Road("NH");
  String res=nce.printall();
  System.out.println(res);
 
    short yoc=2001;
     float length=1453.5f;

  Road nc=new Road("NH","banglore", yoc ,length);
  String result=nc.printall();
   System.out.println(result);
 
     }

}
  