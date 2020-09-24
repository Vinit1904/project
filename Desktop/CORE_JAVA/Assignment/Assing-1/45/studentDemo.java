/*
45.	Create a class Student with two members : rollno and percentage. Create default and parameterized constructors. Create method show() to display information. Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method that calls super class show() method and displays semester. Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. Also override show() method that calls super class show() method and displays className. Create a class( say Demo) with main method that carries out the operation of the project : -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all records from the array -- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many students are having A grade, if for A grade percentage >75. 
*/

class Student{
	private int rollno;
	private double percentage;
	
	
	Student(){
		this.rollno=0;
		this.percentage=0;
	}
	
	
	Student(int rollno,double percentage){
		this.rollno=rollno;
		this.percentage=percentage;
	}
	
	int getRoll(){
		return rollno;
	}
	
	double getPercentage(){
			return percentage;
	}
	
	void show(){
	System.out.print("RollNo= "+rollno+"  "+"Percentage= "+percentage+"  ");
	
	}
}


class CollegeStudent extends Student{
	private int semester;
	
	CollegeStudent(){
		super();
		this.semester=semester;
	}
	
	
	CollegeStudent(int rollno,double percentage,int semester){
		super(rollno,percentage);
		this.semester=semester;
	}
	

	
	void show(){
		super.show();
		System.out.println("semester= "+semester);
	}
}


class SchoolStudent extends Student{
	private int className;
	
	SchoolStudent(){
		super();
		this.className=className;
	}
	
	
	SchoolStudent(int rollno,double percentage,int className){
		super(rollno,percentage);
		this.className=className;
	}
	
	void show(){
		super.show();
		System.out.println("className= "+className);
	}
}



class studentDemo{
		
	public static void main( String[] args ) {
		Student obj[]=new Student[5];
		
		obj[0]=new CollegeStudent(102,60.2,6);
		obj[1]=new CollegeStudent(103,70.5,8);
		obj[2]=new SchoolStudent(10,75.3,10);
		obj[3]=new SchoolStudent(11,72.66,12);
		obj[4]=new SchoolStudent(12,80.3,12);
		
		for(int i=0;i<obj.length;i++){
			obj[i].show();		
		}
		
		int e_rollno=12;
		for(int i=0;i<obj.length;i++){
			if(obj[i].getRoll()==e_rollno){
					if(obj[i].getRoll()<100){
							System.out.println("School Student");
					}
					else{
						System.out.println("College Student");
					}
			}		
		}
		
		
		int count=0;
		for(int i=0;i<obj.length;i++){
			if(obj[i].getPercentage()>75){
				count++;
			}
		}
		System.out.println("Total students having A+ grade is "+count);
		
	}
}