
class P19
{	
	 int Cube(int x)
	 {
		 return (x*x*x);
		 
	 }
	 
	 static int Cube1(int x)
	 {
		 return (x*x*x);
		 
	 }
	
	public static void main(String args[])
	{
	    
		P19 t1 = new P19();
		//Call for Instance method
		System.out.println(t1.Cube(5));
		
		//Call for Static method
		System.out.println(Cube1(6));
		
		
			
	}
}

