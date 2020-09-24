import java.util.Scanner;

class ArrayAvarage
{   
    	public static void main( String[] args ) 
    	{
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter Size of Array");
			
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			int sum=0;
			for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+i+"th value" );
			int value=sc.nextInt();
			arr[i]=value;
			
			}
			
			
			
			for(int i=0;i<arr.length;i++){
			int value=arr[i];
			
			sum=sum+value;
			
			}
			System.out.println("");
			System.out.println("Sum= "+sum);
			
			int Average=sum/size;
			
			System.out.println("Average= "+Average);
		

		}
}