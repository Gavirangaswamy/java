
public class OuterClass {

	int num;
	
	class Innerclass1{
		
		String name;
	}
	
	static class InnerStaticClass{
		
		int number;
		
	}
	public static void main(String[] args) {
		
		OuterClass obj = new OuterClass();
		obj.num=5;
		
		OuterClass.Innerclass1 obj1 = obj.new Innerclass1();
		obj1.name = "ningyakbek hogale";
		
		OuterClass.InnerStaticClass obj2 = new OuterClass.InnerStaticClass();
		obj2.number =45;
	}

}
