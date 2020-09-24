import java.util.Scanner;

class Temp{

	public static void main(String args[]){

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Temp.");
	
	 double f=sc.nextDouble();

	double C=(5*(f-32)/9);

	System.out.println(String.format("%.3f",C));	
}
}