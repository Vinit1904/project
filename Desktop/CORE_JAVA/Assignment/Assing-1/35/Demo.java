import java.lang.Math;
import java.util.Scanner;

class MathOperation{
 
		static int add(int num1,int num2){
			return (num1+num2);
		}	
	 
		static int subtract(int num1,int num2){
				return (num2-num1);
		}
 
		static int multiply(int num1,int num2){
		
		return (num1*num2);
		}
		
		
		static double power(int a,int b){
		
			return (Math.pow(a,b));
		}
 
 
 
 }
 
 class Demo
{   
    	public static void main( String[] args ) 
    	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first Number");
			int a= sc.nextInt();
			System.out.println("Enter Second Number");
			int b= sc.nextInt();
			
			
			
			int sum=MathOperation.add(a,b);
			int subtract=MathOperation.subtract(a,b);
			int multiply=MathOperation.multiply(a,b);
			double power=MathOperation.power(a,b);
			
			System.out.println("Sum= "+sum);
			System.out.println("Subtract= "+subtract);
			System.out.println("Multiply= "+multiply);
			System.out.println("Power= "+power);
		}
}