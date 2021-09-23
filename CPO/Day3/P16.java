
class P16
{	int x,y;
	
	
	
	int display(int m)
	{
		this.x = m;
		return this.x;
		
		
		
	}
	 
		
	void show()//method declaration
	{
		System.out.println("Hi Everyone !!");
		System.out.println("X=" + x );
		System.out.println("Y=" + y );
	}
	
	public static void main(String args[])
	{
	    P16 t1 = new P16();
		
		//t1.show();
		//Method 1:
		System.out.println(t1.display(20));
		
		
		//Method 2:
		int z =t1.display(56);
		System.out.println(z);
		
		
		
		
	}
}

