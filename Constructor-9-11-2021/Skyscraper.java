class Skyscraper{
 String name;
 String location;
 short yoc;
 float height;
 String[] args=new String[5];
 
   Skyscraper(String []args){
   System.out.println("different Skyscraper are follows");
   for(int i=0;i<args.length;i++){
    System.out.println(args[i]);
       }

}
  
  Skyscraper (String n){
   name=n;
  }

  Skyscraper (String n ,String l,short y,float h){
   this(n) ;
  this.location=l ;
   this.yoc=y ;
    this.height=h;
   }
  
  String printall(){
  
  String display = name +"\t" +location +"\t" +yoc +"\t" +height;
  
    return display;
     }

 }