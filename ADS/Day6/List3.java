class List3
{
Node head;
static class Node
{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
}

public void display()
{
	Node n = head;
	while(n != null)
	{
		System.out.print(n.data+"---->");
		n=n.next;
	}
	System.out.print("#");
}

public void insert(int new_data)
	  {
		Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		
	  }
	  
 public void append(int new_data)
	  {
		  Node new_node = new Node(new_data);
			if (head == null) {
				head = new Node(new_data);
				return;
			}
			new_node.next = null;
			Node last = head;
			while (last.next != null)
				last = last.next;
			last.next = new_node;
			return;
		  
			  
	  }
public void insertAfter(Node  prev, int new_data)
{
	prev=head;
	//int n=55;
	
	Node new_node = new Node(new_data);
	while(prev.data != n)
	{
		prev=prev.next;
	}
	new_node.next = prev.next;
		prev.next = new_node;
	
}


public static void main(String args[])
{
	List3 l1 = new List3();
	
	l1.head = new Node(11);
	Node second = new Node(22);
	Node third = new Node(33);
	
	l1.head.next = second;
	second.next = third;
	
	l1.insert(44);
	l1.insert(55);
	l1.append(66);
	l1.append(88);
	l1.insertAfter(l1.head.next, 100);
	l1.display();
	
	

}
}