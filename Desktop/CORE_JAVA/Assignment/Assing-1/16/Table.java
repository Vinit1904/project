import java.util.Scanner;

class Table{

 public static void main(String args[]){
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Number");
	int num = sc.nextInt();	

	int i=1;
	while(i!=11){
	int res =i*num;
	System.out.println(res);
	i++;
			
	}

}
}