import java.util.Scanner;

class Scannerdemo{

	public static void main(String args[]){
		
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the radius of Circle");
	
	float radius =(float)sc.nextFloat();
	
	float area=(float)3.14*radius*radius;
	
	float circum=(float)3.14*2*radius;
	
		
	System.out.println(String.format("%.3f",area));
	System.out.println(String.format("%.4f",circum));	
	
}

}