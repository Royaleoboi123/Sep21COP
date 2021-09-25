
class P22
{	
	static int x =100;//static variable
	int y = 200;//instance variable or non-static
	
	void display()//instance method or normal
	{
		System.out.println("---Non-Staticmethod-------");
		System.out.println(x);
		System.out.println(y);
	}
	
	 static void show()//static method 
	{
		System.out.println("---Staticmethod-------");
		System.out.println(x);
		//System.out.println(y);//Compilation Error
		//Instance variable cannot be accessed in static method.
	}
	
}

class P21{
	public static void main(String args[])
	{
	    
		P22 t1 = new P22();
		
		System.out.println(x);//static var
		System.out.println(t1.y);// non static
		
		t1.display();
		show();
		
		
			
	}
}

