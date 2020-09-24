

class fun{
	fun(){
	this(10);
		System.out.println("No-Ags Fun class");
	}
	
	fun(int a){
	this(10,20);
		System.out.println("single-Ags Fun class");
	}
	
	
	fun(int a,int b){
	
		System.out.println("Double-Ags Fun class");
	}
	
	
}

class thisFun{
	
	public static void main( String[] args ) {
				
				fun p=new fun();
				
	}
	
	
}