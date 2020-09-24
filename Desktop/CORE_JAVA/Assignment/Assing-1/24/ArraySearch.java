import java.util.Scanner;

class ArraySearch
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
			
			
			System.out.println("Enter Elementto be Search in Array");
				int search=sc.nextInt();;
				
						
			for(int i=0;i<arr.length;i++){
			
					if(search==arr[i]){
						System.out.println(search+" "+"Position="+i);
						}
					
			}
			
		}
}