package DS.DS;

public class DoublyLLNode {
	
	DoublyLLNode next, prev;
	int value;
	
	public DoublyLLNode(int a)
	{
		value=a;
		next=null;
		prev=null;
	}

	public DoublyLLNode(int a, DoublyLLNode prv, DoublyLLNode nxt)
	{
		value=a;
		next=nxt;
		prev=prv;
	}
	
}
