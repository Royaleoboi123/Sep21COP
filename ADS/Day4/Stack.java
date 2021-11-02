class Stack
{
	static final int MAX = 5;
	int top;
	int a1[] =new int[MAX];
	
	Stack()
	{
		top=-1;
	}
	
	 boolean isEmpty()
	 {
		 return (top < 0);
	 }
	 
	 boolean isFull()
	 {
		 return (top > (MAX-1));
	 }
	 
	 boolean push(int x)
	 {
		 if(top >= (MAX-1))
		 {
			 System.out.println("Overflow !!!!");
		     return false;
		 }
		 else
		 {
			a1[++top] = x; 
			//top=top+1;=>preincrement
			//a1[top] = x;
			System.out.println("Push :"+x);
			return true;
		 }
	 }
	 
	 int pop()
	 {
		 if(top < 0 )
		 {
			 System.out.println("Underflow !!!");
			 return 0;
		 }
		 else
		 {
			 int x = a1[top--];
			 //top=top-1;
			 return x;
		 }
			 
	 }
	 
	 public static void main(String args[])
	 {
		 Stack s1 = new Stack();
		 s1.push(10);
		 s1.push(101);
		 s1.push(105);
		 s1.push(106);
		 s1.push(107);
		 System.out.println("Pop= "+s1.pop());
		 s1.push(108);
		 System.out.println("Pop= "+s1.pop());
		 System.out.println("Pop= "+s1.pop());
		 
		 
	 }
	 
	 
	
}