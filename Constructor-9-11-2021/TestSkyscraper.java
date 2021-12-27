class TestSkyscraper{
  public static void main(String []args){
 
  Skyscraper meo=new Skyscraper(args);
     

  Skyscraper sky=new Skyscraper("Effiltower");
  String res=sky.printall();
  System.out.println(res);
 
    short yoc=1887;
     float height=1063.5f;

  Skyscraper sp=new Skyscraper("Effiltower","paris", yoc ,height);
  String result=sp.printall();
   System.out.println(result);
 
     }

}
  