public class DLL1 {
	Node head; // head of list

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) { data = d; }
	}

	public void insert(int new_data)
	{
		
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.prev = null;
		if (head != null)
			head.prev = new_Node;
		head = new_Node;
	}

	
	public static void main(String[] args)
	{
		DLL1 dll = new DLL1();
		dll.insert(11);
		dll.insert(22);
		dll.insert(33);
		

		System.out.println("Created DLL !!! ");
		
	}
}
