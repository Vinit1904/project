
class Employee{
	
	private int empNo;
	private double salary;
	private static double totalSalary;
	private static int empNo_auto; 
	
	Employee(double salary){
			empNo_auto++;
			this.empNo=empNo_auto;
			this.salary=salary;
			this.totalSalary=this.totalSalary+salary;
	
	}
	
	static void Display(){
		
	System.out.println("Total Employee= "+empNo_auto);
	
	System.out.println("Total Salary= "+totalSalary);
	}
	
	
}

class EmployeeDemo{
	
	public static void main( String[] args ) 
    	{
				Employee e1 =new Employee(12000);
				Employee e2 =new Employee(13000);
				Employee e3 =new Employee(14000);
				Employee e4 =new Employee(15000);
				Employee e5 =new Employee(16000);
				Employee e6 =new Employee(20000);
				
				Employee.Display();
		}
}