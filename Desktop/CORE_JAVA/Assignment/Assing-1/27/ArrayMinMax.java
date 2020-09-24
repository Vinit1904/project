import java.util.Scanner;

class ArrayMinMax
{   
    	public static void main( String[] args ) 
    	{
		
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter Size of Array");
			
			int size=sc.nextInt();
			int arr[]=new int[size];
			
	
			for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+i+"th value" );
			int value=sc.nextInt();
			arr[i]=value;
			}
	
				int min=arr[0];
				int max=arr[0];
						
			for(int i=0;i<arr.length;i++){
			
				
				if(arr[i]>max){
					max=arr[i];
				}
				
				
				if(arr[i]<min){
					min=arr[i];
				}				
			}
			
			
			System.out.println("Min="+min);
			System.out.println("Max="+max);

		}
}