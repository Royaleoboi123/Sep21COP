
class Math
{	
	
	 public static int sum(int x, int y)
	{
		return x+y;
	}
	
	static void display(int result)
	{
		System.out.println(result);
	}
}

class P24{
	public static void main(String args[])
	{
		Math m1=new Math();
	    int z=m1.sum(100,200);
		
		
		Math.display(z);
		
			
	}
}

