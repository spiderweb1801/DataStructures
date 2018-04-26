package DS.DS;

public class SingleLLNode {

/*	addFirst()
	getFirst()
	getLast()
	addLast()
	search()
	removeFirst()
	removeLast()
	addAt()
	valueAt()*/
	
	SingleLLNode next;
	int value;
	
	public SingleLLNode(int a)
	{
		value=a;
		next=null;
	}
	
	public SingleLLNode(int a, SingleLLNode nxt)
	{
		value=a;
		next=nxt;
	}
	
}
