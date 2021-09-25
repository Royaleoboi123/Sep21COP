import java.util.Scanner;

class P31{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		int a1[] = new int[5];
		
		//User Input
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=s1.nextInt();
		}
		System.out.println("------------------");
		for(int x:a1)
		{
			System.out.println(x);//11 22
		}
			
	}
}

