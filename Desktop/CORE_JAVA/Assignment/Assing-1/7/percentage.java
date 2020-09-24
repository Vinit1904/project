import java.util.Scanner;

class percentage{

	public static void main(String args[]){
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the 1st Subject Marks");
	int a= sc.nextInt();

	System.out.println("Enter the 2st Subject Marks");
	int b=sc.nextInt();

	System.out.println("Enter the 3rd Subject Marks");	
	int c=sc.nextInt();

	System.out.println("Enter the 4th Subject Marks");
	int d=sc.nextInt();

	System.out.println("Enter the 5th Subject Marks");
	int e=sc.nextInt();

	int Obt_marks=a+b+c+d+e;
	int total_marks=500;
	
	//System.out.println(Obt_marks);
	
	float perc=(((float)Obt_marks/(float)total_marks)*100);
	
	
	//System.out.println((float)perc*100);
	System.out.println("percentage marks ="+(int)perc +"%");

	}

}