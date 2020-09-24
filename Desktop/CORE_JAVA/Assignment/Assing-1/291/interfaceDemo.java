interface a{
	
	void method1();
	void method2();
}

class myclass implements a{
	
	public void method1(){
	System.out.println("method1");	
	}
	
	
	public void method2(){
	System.out.println("method2");	
	}
	
}


class interfaceDemo{
	
	
	public static void main(String args[])
	{
		myclass m1=new myclass();
		m1.method1();
		m1.method2();
	}
}