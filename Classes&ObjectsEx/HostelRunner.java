

public class HostelRunner {

	public static void main(String[] args) {
		
		Hostel tenent1 = new Hostel();
		
		tenent1.setFees(500000);
		tenent1.setHostelName("GRS Hostel");
		tenent1.setOwnerName("Gavirangswamy");
		tenent1.setRoomNo((byte)105);
		tenent1.setTenentName("Ravi");
		
		System.out.println(tenent1.getFees());
		System.out.println(tenent1.getHostelName());
		System.out.println(tenent1.getOwnerName());
		System.out.println(tenent1.getRoomNo());
		System.out.println(tenent1.getTenentName());

	}

}
