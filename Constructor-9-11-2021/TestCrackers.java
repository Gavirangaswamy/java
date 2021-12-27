class TestCrackers{
  public static void main(String []args){
 
  Crackers rs=new Crackers(args);
     

  Crackers cr=new Crackers("peacock");
  String res=cr.printall();
  System.out.println(res);
 
    short price=2000;
     boolean harmful=true;
  Crackers ke=new Crackers("namdhi","rocket", price ,harmful);
   System.out.println(ke.printall());
 
     }

}
  