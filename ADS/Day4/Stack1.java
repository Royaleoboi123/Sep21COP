class Stack1
{
	private int max;
	private long[] S1;
	private int top;
	
	public Stack1(int s)
	{
		top=-1;
		max=s;
		S1 =new long[max];
	}
	
	public void push(long x)
	{
		S1[++top] = x;
	}
	
	 public long pop()
	 {
		 return S1[top--];
	 }
	 
	 public long peek()
	 {
		 return S1[top];
	 }
	 
	 public boolean isEmpty()
	 {
		 return (top == -1);
	 }
	 
	 public boolean isFull()
	 {
		 return (top >= (max-1));
	 }
	 
	 public void display()
	 {
		 for(int i=0;i<max;i++)
			 System.out.println(S1[i]);
	 }
	
}

class StackApp
{
	public static void main(String args[])
	{
		Stack1 s = Stack1(5);
		
	}
}