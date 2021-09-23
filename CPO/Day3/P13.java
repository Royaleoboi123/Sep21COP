
class P13
{	int x,y;
	
	
	
	P13()
	{
		x=100;
		y=200;
	}
	 
	P13(int m, int n)
	{
		x=m;
		y=n;
	}
	 
	
	public void getdata(int m, int n)
	{
		x=m;
		y=n;
	}
	
	public void adddata(int m, int n)
	{
		x=m;
		y=n;
		int z = x+y;
		System.out.println("Z="+z);
	}
	
	
	
	void show()//method declaration
	{
		System.out.println("Hi Everyone !!");
		System.out.println("X=" + x );
		System.out.println("Y=" + y );
	}
	
	public static void main(String args[])
	{
	    P13 t1 = new P13(33,55);
		P13 t2 = new P13();
		P13 t3 = new P13(88);
		t1.show();
		t2.show();
		t3.show();
		
		
		//t1.getdata(2,3);
		//t1.show();
		
			
		//t2.adddata(5,6);
		//t2.show();
		
		
	}
}

