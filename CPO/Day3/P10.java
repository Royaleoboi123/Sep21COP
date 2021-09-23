
class P10
{
	int a=100;//data member initialization
	void display1();//method declaation
	public void display()//method define
		System.out.println(a);
	}
	void show()//method declaration
	{
		System.out.println("Hi Everyone !!");
	}
	
	public static void main(String args[])
	{
	    P10 t1 = new P10();
		P10 t2 = new P10();
		
		t2.display();//method call
		
		System.out.println(t1.a);
		t1.show();
		t1.display();
		
		
	}
}

