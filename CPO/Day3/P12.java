
class P12
{	int x,y;
	
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
	    P12 t1 = new P12();
		P12 t2 = new P12();
		t1.getdata(2,3);
		t1.show();
		
			
		t2.adddata(5,6);
		t2.show();
		
		
	}
}

