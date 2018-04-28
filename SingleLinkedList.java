package DS.DS;

public class SingleLinkedList 
{
	
	SingleLLNode head;
	int size;
	//1.size--WORKING
	public int size() {
		return size;
	}
	//2.add first element a--WORKING
	public void addFirst(int a) {
		SingleLLNode curr= new SingleLLNode(a);
		if(size==0)
			head=curr;
		else 
		{
			curr.next=head;
			head=curr;
		}
		size++;
	}
	//3.add last element a--WORKING
	public void addLast(int a) {
		SingleLLNode curr= new SingleLLNode(a);
		SingleLLNode temp=head;
		
		if(size==0)
			head.next=curr;
		else 
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=curr;
		}
		size++;
	}
	//4.remove first element --WORKING
	public int removeFirst() {
		int v;
		if(size==0)
			v=-1;
		else {
			v=head.value;
			head=head.next;
		}
		size--;
		return v;
	}
	//5.remove last element--WORKING
	public int removeLast() {
		int v;
		if(size==0)
			v=-1;
		else {
			SingleLLNode temp=head;
			SingleLLNode prev=temp;
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			v=temp.value;
			temp=prev;
			temp.next=null;
		}
		size--;
		return v;
	}
	//6.get first element--WORKING
	public int getFirst() {
		int v;
		if(size==0)
			v=-1;
		else {
			v=head.value;
		}
		return v;
	}
	//7.get last element--  WORKING
	public int getLast() {
		int v;
		if(size==0)
			v=-1;
		else {
			SingleLLNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			v=temp.value;
		}
		return v;
	}
	//8.find the element at index starting the count from 1--WORKING
	public int elementAt(int index) {
		int v;
		int counter=1;
		if(size==0 || index>size)
			v=-1;
		else {
			SingleLLNode temp=head;
			for(counter=1;counter<index;counter++)
			{
				temp=temp.next;
			}
			v=temp.value;
		}
		return v;
	}
	//9.add a at the index--WORKING
	public void addAt(int index, int a) {
		SingleLLNode curr= new SingleLLNode(a);
		SingleLLNode temp=head;
		SingleLLNode prev=temp;
		if(size==0 || index>size+1)
			{
			if(index==1)
				head=curr;
			else
				System.out.println("Element cannot be added at this index.");
			}
		else 
		{
			int counter=1;
			for(counter=1;counter<=index-1;counter++)
			{
				prev=temp;
				temp=temp.next;
			}
			curr.next=temp;
			prev.next=curr;
		}
		size++;
	}
	//10.search an element a--WORKING
	public boolean search(int a)
	{
		boolean elementPresent=false;
		SingleLLNode temp=head;
		while(temp!=null)
		{
			if(temp.value==a)
			{
				elementPresent=true;
			}
			temp=temp.next;
		}
		return elementPresent;
	}
	//11.delete a node--NOT WORKING
	public void removeNode(int a) {
		
		if(size==0)
			System.out.println("Element cannot be deleted as LinkedList is empty.");
		else 
		{
				SingleLLNode temp=head;
				
				if(head.value==a)
					head=head.next;
				
				while(temp.next!=null) 
				{
					if(temp.next.value==a)
						temp.next=temp.next.next;
					
					temp=temp.next;	
				}
				size--;		
		}
	}
	//12.adding the element a by comparing with the existing elements
	public void sortedInsert(int a)
	{
		
	}
	//13. reverse the linked list
	public void reverseLinkedList() {
		
		SingleLLNode curr=head;
		SingleLLNode next=null;
		SingleLLNode prev=null;
		
		if(isEmpty())
			System.out.println("Cannot reverse an empty linked list...");
		
		else
		{
			while(curr!=null)
			{
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			head=prev;
		}
		
	}
	//14. printing all the elements.--WORKING
	public void printList() {
	
		SingleLLNode temp=head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
		
	}
	//15.isEmpty
	public boolean isEmpty()
	{
		if (size==0)
				return true;
		else
			return false;
	}
	
}
