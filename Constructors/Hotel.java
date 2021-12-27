
public class Hotel {
	static String Hname="GRS HOTEL";
	short Fid;
	String Fname;
	String Ftype;
	Short Fprice;
	
	public Hotel(short fid, String fname, String ftype, short fprice) {
		Fid = fid;
		Fname = fname;
		Ftype = ftype;
		Fprice = fprice;
		System.out.println("Food ID :"+fid);
		System.out.println("Food Name :"+fname);
		System.out.println("Food Type :"+ftype);
		System.out.println("Food Price :"+fprice);
		
	}
	
	

}
