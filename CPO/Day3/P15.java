
class P15
{	int x,y;
	
	
	
	P15(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	
	void display(int x)
	{
		this.x = x;
		System.out.println(x);
	}
	 
		
	void show()//method declaration
	{
		System.out.println("Hi Everyone !!");
		System.out.println("X=" + x );
		System.out.println("Y=" + y );
	}
	
	public static void main(String args[])
	{
	    P15 t1 = new P15(11,22);
		
		t1.show();
		
		
		
		
	}
}

