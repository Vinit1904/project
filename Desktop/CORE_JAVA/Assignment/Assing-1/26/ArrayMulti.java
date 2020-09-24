/*26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.*/
import java.util.Scanner;
class ArrayMulti{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 17 Elements for array");
		int sum=0;
		int addition=0;
		int []a,b,c,d,e;
		a=new int[3];
		b=new int[3];
		c=new int[3];
		d=new int[3];
		e=new int[5];
		int arr[][]=new int[5][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		

		for(int i=0;i<=2;i++){
		a[i]=sc.nextInt();
		b[i]=sc.nextInt();
		c[i]=sc.nextInt();
		d[i]=sc.nextInt();	
		}
		for(int i=0;i<=4;i++){
		e[i]=sc.nextInt();
			
		}
		
			for(int w:a){
			sum=sum+w;
			}
			for(int w:b){
			sum=sum+w;
			}

			for(int w:c){
			sum=sum+w;
			}

			for(int w:d){
			sum=sum+w;
			}

			for(int w:e){
			sum=sum+w;
			}
			
		
		System.out.println("Sum="+sum);
		int small=arr[0][0];
		int max=arr[0][0];
		for(int s[]:arr){
			for(int p:s){
			if(small>p)
			small=p;
			if(max<p)
			max=p;
			addition=p+addition;
		}
		}

		System.out.println("Small="+small);
		System.out.println("Max="+max);
		System.out.println("Addition="+addition);
	}
}