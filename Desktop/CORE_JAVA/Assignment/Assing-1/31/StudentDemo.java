/*31.	Create a 31.	class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another 31.	class ( main 31.	class) StudentDemo that creates Student class object and calls setData() and showData() methods.
*/

class Student{
	private int rno;
	private String name;
	
   void setData(int roll_no,String S_name){
		rno=roll_no;
		name=S_name;
	   }
	 
	void showData(){
		System.out.println("Roll No= "+rno);
		System.out.println("Name= "+name);
		
		}
}


class StudentDemo{
	
	public static void main(String args[]){
		Student s= new Student();
		s.setData(94,"Vinit");
		s.showData();
		
		}
	
}