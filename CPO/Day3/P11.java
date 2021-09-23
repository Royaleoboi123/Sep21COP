
class P11
{	int x,y;
	
	public void getdata(int m, int n)
	{
		x=m;
		y=n;
	}
	
	
	
	void show()//method declaration
	{
		System.out.println("Hi Everyone !!");
		System.out.println("X=" + x );
		System.out.println("Y=" + y );
	}
	
	public static void main(String args[])
	{
	    P11 t1 = new P11();
		t1.getdata(10,20);
		t1.show();
		
		
		
	}
}

