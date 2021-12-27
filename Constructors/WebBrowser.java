
public class WebBrowser {
	
	String browserName;
	byte browserSpeed;
	float usageInPercent;
	String ownerOfBrowser;
	
	public WebBrowser(String browserName, byte browserSpeed, float usageInPercent, String ownerOfBrowser) {
		
		this.browserName = browserName;
		this.browserSpeed = browserSpeed;
		this.usageInPercent = usageInPercent;
		this.ownerOfBrowser = ownerOfBrowser;
		
		System.out.println("Bowser name :"+browserName);
		System.out.println("Bowser speed :"+browserSpeed+"seconds");
		System.out.println("Usage share :"+usageInPercent+"%");
		System.out.println("Bowser Owner :"+ownerOfBrowser);
	}

}
