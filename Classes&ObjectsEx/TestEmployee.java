class TestEmployee
{

	public static void main(String[] args) {
		Employee manoj = new Employee();
		manoj.setEid((byte) 101);
		manoj.setSalary(100000);
		manoj.setEgender("Male");
		
		Employee larry = new Employee(); 
		larry.setEid((byte) 102);
		larry.setSalary(95000);
		larry.setEgender("Male");
		
		Employee varun = new Employee(); 
		varun.setEid((byte) 102);
		varun.setSalary(105000);
		varun.setEgender("Male");
		
		manoj.print_Details();
		larry.print_Details();
		varun.print_Details();
	}
}