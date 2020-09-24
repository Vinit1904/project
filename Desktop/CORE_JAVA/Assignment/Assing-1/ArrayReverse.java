import java.util.Scanner;

class ArraySort
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
			
			for(int i=0;i<arr.length;i++){
				for(int j=arr.length-1;j=>0;j--){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
						
					
					}
				}
			
			
			
			
			
			
			
			
			
			for(int i=0;i<arr.length;i++){
			int value=arr[i];
			System.out.println(value);
			}
			
		}
}