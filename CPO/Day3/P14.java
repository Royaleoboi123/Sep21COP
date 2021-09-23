
class P14
{	int x,y;
	
	
	
	P14()
	{
		x=100;
		y=200;
	}
	 
	P14(int m, int n)
	{
		x=m;
		y=n;
	}
	
	P14(int m)
	{
		x=m;
		
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
	   // P14 t1 = new P14(33,55);
		P14 t2 = new P14();
		P14 t1 = new P14(88);
		t1.show();
		t2.show();
		//t1.show();
		
		
		//t1.getdata(2,3);
		//t1.show();
		
			
		//t2.adddata(5,6);
		//t2.show();
		
		
	}
}

