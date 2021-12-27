class Road{
 String name;
 String location;
 short yoc;
 float length;
 String[] args=new String[5];
 
   Road(String []args){
   System.out.println("different types of highways");
   for(int i=0;i<args.length;i++){
    System.out.println(args[i]);
       }

}
  
  Road (String n){
   name=n;
  }

  Road (String n ,String l,short y,float h){
   this(n) ;
  this.location=l ;
   this.yoc=y ;
    this.length=h;
   }
  
  String printall(){
  
  String display = name +"\t" +location +"\t" +yoc +"\t" +length;
  
    return display;
     }

 }