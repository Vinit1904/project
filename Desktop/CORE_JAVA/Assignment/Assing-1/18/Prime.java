import java.util.Scanner;

class Prime{

	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	
	boolean flag=false;	

	if((num==0)||(num==1)){
	  flag=true;		
	}
	else{
		for(int i=2;i<num/2;++i){
			if(num%i==0){
			flag=true;
			break;
			}	
		
		}	
	}

		
	if(flag){
	System.out.println(num +" is Not Prime Number");
	}
	else{
	System.out.println(num +" is Prime Number");
	}

	
	}
}