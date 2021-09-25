import java.util.Scanner;

class P32{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		int a1[] = new int[5];
		
		//User Input
		for(int i=0;i<2;i++)
		{
			a1[i]=s1.nextInt();
		}
		System.out.println("------------------");
		
		
		for(int i=0;i<=a1.length;i++)
		{
			System.out.println(a1[i]);
		}	
	}
}

