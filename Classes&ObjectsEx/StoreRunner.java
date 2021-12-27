
public class StoreRunner {

	public static void main(String[] args) {
		
		Store.store_Name("GRS E-World");
		System.out.println();
		Store product1 = new Store();
		
		product1.setProductID((byte)100);
		product1.setProductName("macbookpro 16");
		product1.setProductPrice(239000);
		product1.setProductStockQty(1300);
		
		
		System.out.println("Product ID :"+product1.getProductID());
		System.out.println("Product Name :"+product1.getProductName());
		System.out.println("Product Price :"+product1.getProductPrice());
		System.out.println("Product TotalStock :"+product1.getProductStockQty());
		System.out.println("Condition of product :"+product1.isProductInGoodCondition(true));
		System.out.println();
        Store product2 = new Store();
		
		product2.setProductID((byte)102);
		product2.setProductName("Iphone 13");
		product2.setProductPrice(150000);
		product2.setProductStockQty(1000);
		
		System.out.println("Product ID :"+product2.getProductID());
		System.out.println("Product Name :"+product2.getProductName());
		System.out.println("Product Price :"+product2.getProductPrice());
		System.out.println("Product TotalStock :"+product2.getProductStockQty());
		System.out.println("Condition of product :"+product2.isProductInGoodCondition(true));
		System.out.println();
        Store product3 = new Store();
		
		product3.setProductID((byte)103);
		product3.setProductName("Apple Watch");
		product3.setProductPrice(40000);
		product3.setProductStockQty(400);
		
		System.out.println("Product ID :"+product3.getProductID());
		System.out.println("Product Name :"+product3.getProductName());
		System.out.println("Product Price :"+product3.getProductPrice());
		System.out.println("Product TotalStock :"+product3.getProductStockQty());
		System.out.println("Condition of product :"+product3.isProductInGoodCondition(true));
		
	}

}
