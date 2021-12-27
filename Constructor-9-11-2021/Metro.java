class Metro
{
 String name;
 String location;
 byte noOfPassengers ;
 float length;
 
 String[] args=new String[5];
 
   Metro(String []args){
   System.out.println("metro transport is the best transport for the traffc city like bangalore");
   for(int i=0;i<args.length;i++){
    System.out.println(args[i]);
       }

}
  
  Metro(String n){
   name=n;
  }

  Metro (String n ,String l,byte no,float h){
   this(n) ;
  this.location=l ;
   this.noOfPassengers=no ;
    this.length=h;
   }
  
  String printall(){
  String display = name +"\t" +location +"\t" +noOfPassengers +"\t" +length;
  
    return display;
     }

 }