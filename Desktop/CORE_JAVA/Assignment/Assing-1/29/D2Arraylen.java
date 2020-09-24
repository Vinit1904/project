import java.util.Scanner;

class D2Arraylen
{   
    	public static void main( String[] args ) 
    	{
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter Size of Array");
			
			int size=sc.nextInt();
			int arr[][]=new int[size][];
			
			for(int i=0;i<arr.length;i++){
			System.out.println("Enter size of "+i+"th array" );
			int cols=sc.nextInt();
			
			arr[i]=new int[cols];
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter Element in Array");
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int ar[]:arr){
					
					for(int a:ar){
						System.out.print(" "+a);
						}
				System.out.println("");
			}
				int sum=0;
				for(int i=0;i<arr.length;i++){
					System.out.println("Lenght of 1-D Array for "+i+"th column is "+arr[i].length);
					sum=sum+arr[i].length;
				}
				System.out.println("Total number of Element in Array is "+sum);
				
				
			

		}
}