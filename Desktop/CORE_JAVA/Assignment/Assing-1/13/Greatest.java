

class Greatest{

	public static void main(String args[]){
	int n1=10;
	int n2=25;
	int n3=20;
	
	if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
 
	


	int Greatest=(n1 > n2)?(n1 > n3 ? n1 : n3) : 
				     (n2 > n3 ? n2 : n3);  
	

	System.out.println("Greatest No is= "+ Greatest);	
	}
}