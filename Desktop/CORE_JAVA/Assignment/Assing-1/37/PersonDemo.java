
class person{

	private String name;
	private int age;
	
	person(){
	age=18;
	}
	
	person(String name,int age){
			
			this.name=name;
			this.age=age;
		
	}
	
	void Display(){
	System.out.println("Name= "+name);
	System.out.println("Age= "+age);
	}

}

class PersonDemo{
	
	public static void main( String[] args ) 
    	{
				person p=new person("vinit",24);
				p.Display();
				
				person p1=new person("Rahul",23);
				p1.Display();
				
				person p2=new person();
				p2.Display();
				
			
		}
}