/*32.	Create a 31.	class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another 31.	class ( main 31.	class) StudentDemo that creates Student class object and calls setData() and showData() methods.

32.	Modify the above program (no. 30) to count the no of Student 32.	objects created. [ In this program 32.	static variable is required ]

*/

class Student{
	private int rno;
	private String name;
	private static int total;
   void setData(int rno,String name){
		this.rno=rno;
		this.name=name;
		total++;
	   }
	 
	void showData(){
		System.out.println("Roll No= "+rno);
		System.out.println("Name= "+name);
		System.out.println("Total No of objects Created= "+total);
		
		}
}


class StudentDemo{
	
	public static void main(String args[]){
		Student s= new Student();
		s.setData(94,"Vinit");
		s.showData();
		
		Student s1= new Student();
		s1.setData(95,"NS");
		s1.showData();
		
		Student s2= new Student();
		s2.setData(83,"Rahul");
		s2.showData();
		
	
		}
	
}