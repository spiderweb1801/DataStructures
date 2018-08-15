package DS.DS;

public class DoublyLinkedList {

	DoublyLLNode head;
	int size;
	//1.size--WORKING
	public int size() {
		return size;
	}
	//2.add first element a--EDIT WORKING
	public void addFirst(int a) {
		DoublyLLNode curr= new DoublyLLNode(a);
		
		if(size==0)
			head=curr;
		
		else
		{
			curr.next=head;
			
			head=curr;
		}
		size++;
	}
	//3.add last element a--EDIT WORKING
	public void addLast(int a) 
	{
		
		DoublyLLNode curr= new DoublyLLNode(a);
		if(size==0)
			head=curr;
		
		else
		{
			DoublyLLNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=curr;
			
		}
		size++;
	}
	//4.remove first element --WORKING
	public int removeFirst() 
	{
		int v;
		
		if(size==0)
			v=-1;
		
		else
		{
			v=head.value;
			head=head.next;
			size--;
		}
		return v;
	}
	//5.remove last element--WORKING
	public int removeLast() 
	{
		int v;
		
		if(size==0)
			v=-1;
		
		else
		{
			DoublyLLNode temp=head;
			DoublyLLNode prev=head;
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			v=temp.value;
			prev.next=null;
			size--;
		}
		
		return v;
	}
	//6.get first element--WORKING
	public int getFirst() {

		if(size==0)
			return -1;
		
		else
		{
			return head.value;
		}
	}
	//7.get last element--WORKING
	public int getLast() {

		int v;
		if(size==0)
			v=-1;
		
		else
		{
			DoublyLLNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			v=temp.value;
		}
		return v;
	}
	//8.find the value at index starting the count from 1--WORKING
	public int valueAt(int index) {
		int v;
		DoublyLLNode temp=head;
		
		if(size==0 || index>size)
			v=-1;
		
		else
		{
			int counter=1;
			for(counter=1;counter<index;counter++)
			{
				temp=temp.next;
			}
			v=temp.value;
		}
		
		return v;
	}
	//9.add a at the index
	public void addAt(int index, int a) {
		
	}
	//10.search an element a
	public boolean search(int a)
	{
		return true;
	}
	//11.delete a node
	public void deleteNode(int a) {
		
	}
	//12.adding the element a by comparing with the existing elements
	public void sortedInsert(int a)
	{
		
	}
	//13. reverse the linked list
	public void reverseLinkedList() {
		
	}
	//14.PrintList
	public void printList()
	{
		DoublyLLNode temp=head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	
	
}
