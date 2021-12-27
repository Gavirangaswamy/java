class TestIndianrailway{
 public static void main(String []args){
  
  Indianrailway.Types(args);

  String res=Indianrailway.name();
  System.out.println(res);
  
  Indianrailway rail=new Indianrailway();
  int trainlength= rail.length();
  System.out.println(trainlength);

  Indianrailway train = new Indianrailway();
   short ticket= train.price();
   System.out.println(ticket);

    }

}