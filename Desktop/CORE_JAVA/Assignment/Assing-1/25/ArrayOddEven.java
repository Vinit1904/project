import java.util.Scanner;

class ArrayOddEven
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
			
				int oddSum=0;
				int evenSum=0;
						
			for(int i=0;i<arr.length;i++){
			
					if(arr[i]%2==0){
						evenSum=evenSum+arr[i];						
					}
					else{
							oddSum=oddSum+arr[i];
						}
					
					
			}
			System.out.println("EvenSum="+evenSum);
			System.out.println("OddSum="+oddSum);

		}
}