class TestMetro
{
  public static void main(String []args){
 
  Metro M=new Metro(args);
     

  Metro Met=new Metro("NAMMAMETRO");
  String res=Met.printall();
  System.out.println(res);
 
    byte noOfPassengers=50;
     float length=120f;

  Metro namma=new Metro("nammametro","bangalore",(byte)115,154.5f);
  String result=namma.printall();
   System.out.println(result);
 
     }

}