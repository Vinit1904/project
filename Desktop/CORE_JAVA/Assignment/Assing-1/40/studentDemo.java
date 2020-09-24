import java.util.Scanner;

class student{
	
	private String name;
	private int rollNo;
	private int age;
	private int score;
	
	student(){
	name=null;
	rollNo=0;
	age=0;
	score=0;
	}
	
	
	student(String name,int rollNo,int age,int score){
	this.name=name;
	this.rollNo=rollNo;
	this.age=age;
	this.score=score;
	}
	
	void display(student obj[]){
		for(int i=0;i<obj.length;i++){
		
			System.out.println("RollNo= "+obj[i].rollNo);
		}
		
	}
	

}

class studentDemo{
	
	public static void main( String[] args ) 
    {
			student obj[]=new student[2];
			
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<obj.length;i++){
				
			System.out.println("Enter the Paratmeter for "+(i+1)+"th Student");
				
			System.out.println("Enter "+(i+1)+"th student Name");
			String name=sc.next();
			
			
			System.out.println("Enter "+(i+1)+"th student RollNo");
			int rollNo=sc.nextInt();
			
			System.out.println("Enter "+(i+1)+"th student Age");
			int age=sc.nextInt();
			
			
			System.out.println("Enter "+(i+1)+"th student Score");
			int score=sc.nextInt();
				
			obj[i]=new student(name,rollNo,age,score);
			}
			
			student s=new student();
			
			s.display(obj);
		
	}
}