
import java.util.Scanner;

class Circle{
 
 private static double radius;
 private static double area;
 
 static void init(){
	 Scanner sc=new Scanner(System.in); 
	 
	System.out.println("Enter Radius");
	radius= sc.nextFloat();
	
	 }
	 
	  static void calculateArea(){
			area=3.14*radius*radius;
	 }
 
	 static void display(){
			System.out.println("Radius "+radius);
			System.out.println("Area "+area);
		}
 
 
 
 }
 
 class CircleDemo
{   
    	public static void main( String[] args ) 
    	{
			Circle.init();
			Circle.calculateArea();
			Circle.display();
		}
}