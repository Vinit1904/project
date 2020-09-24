import java.util.Scanner;

class Salary{

	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Basic Salary");
		
	double HRA;
	double DA;
	double GS;
	int Basic=sc.nextInt();
	
	if(Basic<10000){
		
		HRA=(Basic*0.1);
		DA=(Basic*0.9);
			
		GS=Basic+HRA+DA;
		System.out.println("Gross Salary= "+GS);
	
	}
	else{
		HRA=2000;
		DA=(Basic*0.98);
			
		GS=Basic+HRA+DA;
		System.out.println("Gross Salary= "+GS);
	
	}	


	
	
	
	}
}