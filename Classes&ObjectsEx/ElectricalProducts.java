

public class ElectricalProducts {
	
	 String name;
	 short voltage;
	 float current;
	 int price;
	 

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getVoltage() {
		return voltage;
	}

	public void setVoltage(short voltage) {
		this.voltage = voltage;
	}

	public float getCurrent() {
		return current;
	}

	public void setCurrent(float current) {
		this.current = current;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void illuminatelight(){
	 System.out.println("Bulbs illuminated by supplying power");
	  }

	 static int temperature(int temp){
	 System.out.println("while illuminating temperature will increases ");
	  return temp;
	   }
	 
	 void illuminatingmaterial(){
	 System.out.println("Bulb are illuminate due to neon gas get reacted b/w two metal electrodes");

}
}
