class Employee{
	byte eid;
	int salary;
	String egender;
	static String ceo = "Gavirangaswamy";
	
	public void setEid(byte eid) {
		this.eid = eid;
	}

	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public void setEgender(String egender) {
		this.egender = egender;
	}
	
	void print_Details(){
		System.out.println("Empolyee ID :"+eid+"\nEmpolyee Salary : "+salary+"\nEmpolyee Gender : "+egender+"\nEmpolyee CEO : "+ceo);
	}
}