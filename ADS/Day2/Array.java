class Array
{
	
	public static void main(String args[])
	{
		int[] a1;
		a1= new int[100];
		int i, n=0;
		
		a1[0]=55;
		a1[1]=33;
		a1[2]=44;
		a1[3]=11;
		a1[4]=22;
		a1[5]=66;
		a1[6]=99;
		a1[7]=0;
		a1[8]=34;
		a1[9]=81;
		n=10;
		
		//display
		for(i=0;i<n;i++)
		{
			System.out.println(a1[i]);
		}
		
		//search
		int key=22;
		for(i=0;i<n;i++)
		{
			if(a1[i] == key)
				break;
		}
		if(i == n)
			System.out.println("Not found");
		else
			System.out.println("found");
			
		//Delete
		key=99;
		for(i=0;i<n;i++)
		{
			if(a1[i] == key)
				break;
		}
		
		for(int k=i;k<n;k++)
		{
			a1[k]=a1[k+1];
		}
			n--;
			
			//display
		for(i=0;i<n;i++)
		{
			System.out.println(a1[i]);
		}
				
	}
}
	