

public class Store {

	static String storeName;
	byte productID;
	String productName;
	int productPrice;
	int productStockQty;
	boolean isProductInGoodCondition;
	
	
	public static void store_Name(String storeName) {
		Store.storeName=storeName;
		
		System.out.println("Store Name :"+storeName);
		
	}
	public byte getProductID() {
		return productID;
	}
	public void setProductID(byte productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductStockQty() {
		return productStockQty;
	}
	public void setProductStockQty(int productStockQty) {
		this.productStockQty = productStockQty;
	}
	public String isProductInGoodCondition(boolean confirm) {
		if(confirm == true)
		return "The product is in good condition and working fine";
		else
		return  "The product is not in good condition/nPlease return the product";
	}
	

}
