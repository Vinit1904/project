import java.util.Scanner;

class eligibility{

	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Your sex M or F");
	//String sex =sc.next();
	char sex = sc.next().charAt(0);
		
	System.out.println("Enter Your Age");
	int age =sc.nextInt();

	if(sex=='M' && age>=21)
	{
		System.out.println("You are Eligible");	
	}
	else if(sex=='F' && age>=21){
		System.out.println("You are Eligible");	
	}
	else{
	System.out.println("You are not Eligible");
	}
}
}