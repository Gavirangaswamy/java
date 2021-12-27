package com.grs.learnInheritence.dto;

public class Phone {

	public String brandName = "mobileBrand";
	public String type = "KeypadORtouch";
	public String ram = "Mobileram";
	public String snapdragon = "MobileSD124";
	public Boolean Camera = true;

	public String call(String calling) {
		return calling;
	}

	public String browsing(String Netbrowsing) {
		return Netbrowsing;
	}

	public String Storage(String storingData) {
		return storingData;
	}

	public String Sharing(String share) {
		return share;
	}

	public String DateTime(String datetime) {
		return datetime;
	}
}
