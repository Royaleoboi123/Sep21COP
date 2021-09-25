
class Test{
	int hra;
	int ba;
	int da;
	Test(int m)
	{
		ba=10000;
		da=m;
		hra=1500;
	}
	
	
		public static void main(String args[])
	{
		
		Test t1 = new Test(1000);//constructor get invoked automatically.
		//System.out.println(t1.x);
		
		
		//t1.ba=20000;
		int gross = t1.hra+t1.ba+t1.da;
		System.out.println(gross);
		
		
	}
}

