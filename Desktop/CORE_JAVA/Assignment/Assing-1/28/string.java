import java.util.Scanner;
class string{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		String name[]=new String[x];
		
		
		for(int i=0;i<x;i++){
		String n=sc.next();
		name[i]=n;
		}		
		
		
		System.out.println("The Name You Stored in Array");
		
		for(String a:name){
		System.out.println(a);
		}
			
	}
}