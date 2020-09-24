import java.util.Scanner;

class Day_Conv{
	
	public static void main(String args[]){

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Integer");
	
	int num=sc.nextInt();
	
	int y=num/365;
	 
	num=(num-(365*y));
	
	int m=(num/30);
	
	int d=(num-(m*30));
	
	System.out.println("Year ="+y +" Month="+m +" Days="+d);
	
}

}