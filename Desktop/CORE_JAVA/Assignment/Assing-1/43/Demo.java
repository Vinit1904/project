/*43.	Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them in instance variables. Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. 

*/

class OneBHK{
	private double roomArea;
	private  double hallArea;
	private double price;
	
	OneBHK(){
		this.roomArea=0;
		this.hallArea=0;
		this.price=0;
	
	}
	
	OneBHK(double roomArea,double hallArea,double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	
	void show(){
		
		System.out.print("roomArea= "+roomArea+"  ");
		System.out.print("hallArea= "+hallArea+"  ");
		System.out.print("price= "+price);
		
	}
	

	double total_oneBHK(OneBHK a1,OneBHK a2,OneBHK a3){
			double O_total=a1.price+a2.price+a3.price;
			return O_total;
	}
}

class TwoBHK extends OneBHK{
	private double room2Area;
	
	
	TwoBHK(){
		super();
		this.room2Area=0;
	}
	
	
	TwoBHK(double roomArea,double hallArea,double price,double room2Area){
		super(roomArea,hallArea,price);
		this.room2Area=room2Area;
	
	}
	
	
	void show(){
		super.show();
		System.out.print("  room2Area= "+room2Area);
		System.out.println("");
	}
	
	double totalPrice(TwoBHK a1,TwoBHK a2,TwoBHK a3){
			double a_total=total_oneBHK(a1,a2,a3);
			return a_total;
	}
}

class Demo{
	public static void main( String[] args ) 
    {
		TwoBHK t1=new TwoBHK(50,100,1000,50);
		t1.show();
	
		TwoBHK t2=new TwoBHK(50,100,1000,50);
		t2.show();
	
		TwoBHK t3=new TwoBHK(50,100,1000,50);
		t3.show();
		
		TwoBHK t=new TwoBHK();
		
		double total=t1.totalPrice(t1,t2,t3);
		System.out.print("totalPrice="+total);
	}

}