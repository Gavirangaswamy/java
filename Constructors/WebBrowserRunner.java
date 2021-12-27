

public class WebBrowserRunner {

	public static void main(String[] args) {
		
		WebBrowser browser1 = new WebBrowser("Google Crome", (byte)64,0.49f, "Google, Inc.,");
		System.out.println();
		WebBrowser browser2 = new WebBrowser("Safari", (byte)19, 0.72f, "Apple, Inc.,");
		System.out.println();
		WebBrowser browser3 = new WebBrowser("Mozilla Firefox", (byte)3.5, 0.84f, "the Mozilla Foundation and its subsidiary, the Mozilla Corporation.");

	}

}
