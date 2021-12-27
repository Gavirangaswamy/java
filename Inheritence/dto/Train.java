package com.grs.learnInheritence.dto;

public class Train {

	public String type = "IntrencityORlongdistance";
	public String name = "trfainName";
	public String runBy = "deiselORelectric";
	public float lengthinKM = 1.5f;
	public String purpose = "carrying passengers";

	public String run(String trainRuns) {
		return "trainRuns";
	}

	public String carrying(String load) {
		return load;
	}

	public String makingSound(String sound) {
		return sound;
	}

	public String pullingBogies(String chainLink) {
		return chainLink;
	}

	public String catering(String catering) {
		return catering;
	}

}
