package DS.DS;

public class Queue {
	
	int arr[];
	int size;
	int head;
	int tail;
	int maxSize;
	
	public Queue() {
		arr= new int[10];
		maxSize=10;
	}
	
	public Queue(int capacity) {
		arr= new int[capacity];
		maxSize=capacity;
		size=0;// gets incremented during add method, and decremented during remove method
		head=0;// gets incremented during remove method
		tail=-1;// gets incremented during add method
	}
	
	public void add(int a)
	{
		//System.out.println(tail+"=tail in add method b4 anything. Size is:"+size+". Head is:"+head);
		
		if(isFull())
			{
				if(tail==maxSize-1)
					tail=0;
				else
					tail++;
				
				if(head==maxSize-1)
					head=0;
				else
					head++;
			}
		else
		{
			if(tail==maxSize-1)
				tail=0;
			else
				tail++;
		}
		
		arr[tail]=a;
		
		if(size<maxSize)
			size++;
			
		else{}
		//System.out.println(tail+"=tail. Size is:"+size+". Arr[tail] is="+arr[tail]);
	}
	
	public int remove()
	{
		int get=0;

		//System.out.println(tail+"=tail in removed Queue b4 removing. Size is:"+size+". Removing data is"+arr[head]);
		
		if(!isEmpty())
		{
			get=arr[head];
			
			if(head==(maxSize-1))
				head=0;
			
			else
				head++;
				
			size--;
		}	
		else
			{get=-10;size=0;}
		
		//System.out.println(tail+"=tail in removed Queue. Size is:"+size+". Removed data is"+get);
		return get;
		
	}
	
	public void view()
	{
		int headHere=head;
		int tailHere=tail;
		
		if(headHere<=tailHere)
		{
			for(int i=headHere;i<=tailHere;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else
		{
			// head from first loop gets till the tail of second loop
			for(int i=headHere;i<maxSize;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			for(int i=0;i<=tailHere;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public int head()
	{
		return arr[head];
	}
	
	public int tail()
	{
		return arr[tail];
	}
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public boolean isFull()
	{
		return (size==maxSize);
	}
	
	public static void main(String args[])
	{
		Queue q= new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.view();
	
		System.out.println("\n1st head and tail:");
		System.out.println(q.head());
		System.out.println(q.tail());
		
		q.add(11);
		System.out.println("2nd head and tail:");
		System.out.println(q.head());
		System.out.println(q.tail());
		
		q.remove();
		System.out.println("3rd head and tail:");
		System.out.println(q.head());
		System.out.println(q.tail());
		System.out.println("after 3rd head and tail, the view:");
		q.view();
		System.out.println("\nSIZE :"+q.size+". HEAD INDEX :"+q.head+". TAIL INDEX:"+q.tail);
		
		
		q.add(1);
		System.out.println("\nafter adding an element:1");
		q.view();
		System.out.println("\nSIZE :"+q.size+". HEAD INDEX:"+q.head+". TAIL INDEX:"+q.tail);
		
		q.add(2);
		System.out.println("\nafter adding an element:2");
		q.view();
		System.out.println("\nSIZE :"+q.size+". HEAD INDEX:"+q.head+". TAIL INDEX:"+q.tail);
		
		q.add(3);
		System.out.println("\nafter adding an element:3");
		q.view();
		
		q.add(4);
		System.out.println("\nafter adding an element:4");
		q.view();
		
		q.add(5);
		System.out.println("\nafter adding an element:5");
		q.view();
		
	}
	
}