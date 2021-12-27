class Crackers{
 String brand;
 String types;
 short price;
boolean harmful;
 String[] args=new String[5];
 
   Crackers(String []args){
   System.out.println("types of crackers");
   for(int i=0;i<args.length;i++){
    System.out.println(args[i]);
       }

}
  
  Crackers(String b){
   brand=b;
  }

 Crackers(String b ,String t,short p,boolean n){
   this(b) ;
  this.types=t ;
   this.price=p;
    this.harmful=n;
   }
  
  String printall(){
  
  String display = brand+"  "+types+"   "+price+"  "+harmful; ;
  
    return display;
     }

 }