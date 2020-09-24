import java.util.Scanner;

class prime
{   
    	public static void main( String[] args ) 
    	{
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter Number staring number");
			int intial=sc.nextInt();			
		
			System.out.println("Enter Number last number");
			int end=sc.nextInt();			
		
			
		
			for(int i=intial;i<=end;i++){
				boolean flag=false;
				for(int j=2;j<i/2;j++){
					if(i%j==0){
					flag=true;
					break;				
				}
			}
				if(!flag){
				
				System.out.println(i);
				flag=false;
				}
		}
	
		
		
    	}
}