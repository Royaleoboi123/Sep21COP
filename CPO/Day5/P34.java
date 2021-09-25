import java.util.Scanner;

class P34{
	int EmpId;
	String EmpName;
	
	P34(int id,String name)
	{
		this.EmpId = id;
		this.EmpName = name;
	}
	public static void main(String args[])
	{
		//P34 t1 = new P34();
		P34 a1[];//declaration of array
		a1 = new P34[5];//allocating memory for 5 objects
		
		a1[0] = new P34(1,"Rahul");
		a1[1] = new P34(2,"Swati");
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("a1["+i+"]:"+a1[i].EmpId+ ""+a1[i].EmpName);
		}
		
		
		
	}
}



