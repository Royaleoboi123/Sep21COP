
class P30{
	public static void main(String args[])
	{
		//Method 1: Initialization of Array	
		int []a1;
		a1 = new int[5];
		a1[0]=11;
		a1[1]=22;
		a1[2]=33;
		a1[3]=44;
		
		//Method 2: Initialization of Array	
		int b1[] = {11,22,33,44,55};
		
		//Method 1: Printing an Array
		for(int i=0;i<a1.length;i++)
		{
			//System.out.println(a1[i]);
		}
		
		//For-Each: display purpose
		//Method 2: Printing an Array
		for(int x:a1)
		{
			System.out.println(x);//11 22
		}
			
	}
}

