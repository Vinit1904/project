import java.util.Scanner;

class SimpleInterest{

	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		int prin=sc.nextInt();
		
		System.out.println("Enter Intrest");
		float rate=sc.nextFloat();
		
		System.out.println("Enter Time in years");
		int time=sc.nextInt();

		float SI=(((float)prin*(float)rate*(float)time)/100);

		System.out.println("Simple Interest ="+(float)SI);
	}
}