class BS
{
	static int bsearch(int a1[], int key)
	{
		int l=0, h=a1.length-1;
		while(l <= h)
		{
			int m=l+(h-l)/2;
			
			if(a1[m] == key)
				return m;
			
			if(a1[m] < key)
				l=m+1;
			else
				h=m-1;
		}	
		return -1;	
		
	}
	
	public static void main(String args[])
	{
		int a1[]={11,33,55,88,99};
		int key =99;
		int res=bsearch(a1,key);
		if(res == -1)
			System.out.println("Not Found !!!");
		else
			System.out.println("Found !!!");
		
	}
}