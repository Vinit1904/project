import java.util.Scanner;

class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number to check prime or not");
			
int num=sc.nextInt();

	boolean flag=false;
	for(int i=2;i<=num/2;++i){
	
		if(num%i==0){
		flag=true;
		break;
	}
	}

	int num_plus=num;
	int num_minus=num;
	
	if(flag==true){
	num_minus--;
	
	Task:
	for(int i=2;i<=num_minus/2;i++){
		//System.out.println(num_minus+" "+i);
		if(num_minus%i==0){
		//System.out.println("valid");
			num_minus--;
			i=2;
			continue Task;
		}
				
		}
		
	}
	System.out.println(num_minus);
	
	
	
	
	

	if(flag==true){
	num_plus++;
		
	Task:
	for(int i=2;i<=num_plus/2;i++){
		//System.out.println(num1+" "+i);
		if(num_plus%i==0){
		//System.out.println("valid");
			num_plus++;
			i=2;
			continue Task;
		}
				
		}
		System.out.println(num_plus);
	}
	
	
}

}