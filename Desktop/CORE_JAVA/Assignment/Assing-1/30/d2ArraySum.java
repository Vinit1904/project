import java.util.Scanner;

class d2ArraySum
{   
    	public static void main( String[] args ) 
    	{
			Scanner sc=new Scanner(System.in);

			System.out.println("Size of Array is[3][3]");
			
			int arr[][]=new int[3][3];
			
			for(int i=0;i<arr.length;i++){
			System.out.println(i+"th array" );
			
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter Element in Array"+i+"th Array");
					arr[i][j]=sc.nextInt();
				}
			}
			
			int sum=0;
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					if(i==j){
						
						sum=sum+arr[i][j];
						}
					}
				}
				
				System.out.println("Sum of Diagonal Element is "+sum);

		}
}