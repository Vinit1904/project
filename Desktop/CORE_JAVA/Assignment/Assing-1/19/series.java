import java.util.Scanner;

class series 
{   
    	public static void main( String[] args ) 
    	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number end with _ _2=");
		
		int number=sc.nextInt();			
		int i,sum=0;
		if(number%10==2)
		{
			for(i=12;i<=number;i=i+10)
			{
				System.out.print(i);
				if(i<number)
					System.out.print("+");
				sum = sum + i;
			}
			System.out.print("\n Sum is : " + sum);
		}
		else{	
			System.out.println("Invalid number");
		}
    	}
}