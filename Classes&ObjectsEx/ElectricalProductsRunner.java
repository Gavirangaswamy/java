

public class ElectricalProductsRunner {

	public static void main(String[] args) {
		 ElectricalProducts bulb = new ElectricalProducts();
		 
		 bulb.setCurrent(2.4f);
		 bulb.setName("fluorescent bulb");
		 bulb.setPrice(500);
		 bulb.setVoltage((short)240);
		 System.out.println(bulb.getCurrent());
		 System.out.println(bulb.getVoltage());
		 System.out.println(bulb.getPrice());
		 
		 int temp=ElectricalProducts.temperature(38);
		 System.out.println(temp);

		 bulb.illuminatingmaterial();

	}

}
