
class MathOperation{
 		
		static int multiply(int num1,int num2){
		
		return (num1*num2);
		}
				
		static float multiply(float num1,float num2,float num3){
		
		return (num1*num2*num3);
		}
		
		
		static float multiply(int arr[]){
		int total=1;
		for(int a:arr){
		total=total*a;	
		}
		return total;
		}
		
		static double multiply(double num1,int num2){
		
		return num1*num2;
		}

 
 
 }
 
 class Demo
{   
    	public static void main( String[] args ) 
    	{
			
			int multiply=MathOperation.multiply(10,20);
			double multiply1=MathOperation.multiply(2.5f,10.2f,5.6f);
			
			int []arr=new int[]{4,3,5};
			double multiply2=MathOperation.multiply(arr);
			
			
			double multiply3=MathOperation.multiply(10.2,2);
			
			
			System.out.println("multiply= "+multiply);
			System.out.println("multiply1= "+multiply1);
			System.out.println("multiply2= "+multiply2);
			System.out.println("multiply3= "+multiply3);
		}
}