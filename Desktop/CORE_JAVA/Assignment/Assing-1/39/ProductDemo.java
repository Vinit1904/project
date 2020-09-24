import java.util.Scanner;
class Product{

	private int pid;
	private double price;
	private int quantity;
	
	Product(){
			pid=0;
			price=0;
			quantity=0;
	}	
	Product(int pid,double price,int quantity){
	
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;		
	}
	
	
	
	int HighestPid(Product obj[]){
		int p=0;
		//double pr;
			for(int i=0;i<obj.length;i++){
				
				if(obj[i].price>p){
					p=obj[i].pid;
				}
			}
			
		return p;
	}
	
	
	static double totalSpent(Product obj[]){
		
		double totalSpent=0;
		for(int i=0;i<obj.length;i++){
			
			double singleSpent=obj[i].price*obj[i].quantity;
			totalSpent=totalSpent+singleSpent;
		
		}
		
		return totalSpent;
		
	}
	
	

}

class ProductDemo{
	
	
	public static void main( String[] args ) 
    {
		Product obj[]=new Product[5];
	
		Scanner sc= new Scanner(System.in);
	
		for(int i=0;i<obj.length;i++){
		
			System.out.println("Enter the Paratmeter for "+i+"th object");
		
			System.out.println("Enter "+i+"th object PID");
			int pid=sc.nextInt();
		
			System.out.println("Enter "+i+"th object Price");
			double price=sc.nextDouble();
		
		
			System.out.println("Enter "+i+"th object quantity");
			int quatity=sc.nextInt();
		
			obj[i]=new Product(pid,price,quatity);
		
		}
		
		Product p=new Product();
		int H_pid=p.HighestPid(obj);
		System.out.println("");
		System.out.println("Highest Price Pid= "+H_pid);
		
		double total=Product.totalSpent(obj);
		System.out.println("Total Amount Spent on all product= "+total);
		
	
	}
	
}