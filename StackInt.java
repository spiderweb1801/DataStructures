package DS.DS;

public class StackInt {

	int size;//increases with push, decreases with pop
	int arr[];
	int maxSize;//maxSize
	
	public StackInt() {
		arr= new int[10];
	}
	
	public StackInt(int capacity) {
		arr= new int[capacity];
		maxSize=capacity;
		size=0;
	}

	public void push(int a) 
	{
		if(size<maxSize)
		{
			arr[size]=a;
			//System.out.println("INSIDE STACK SIZE IS:"+size+" before size increment. Element is:"+arr[size]);
			size++;
			//System.out.println("INSIDE STACK SIZE IS:"+size+" after size incremented. Element is:"+arr[size-1]);
		}
		else {
			//System.out.println("STACK IS FULL. SIZE OF STACK IS:"+size+". last accessible element is:"+arr[size-1]);
		}
			
	}
	
	public int pop() 
	{
		int v=-10;
		
		if(!isEmpty())
		{
			size--;
			v=arr[size];	
		}
		
		else
			v=-10;
		
		return v;
	}
	
	public int peep() {
		//System.out.println("inside peep(). peep():"+arr[size-1]);
		if(!isEmpty())
			return arr[size-1];
		else
			return -10;
		}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty()
	{
		return(size==0);
	}
		
	public static void main(String args[])
	{
		StackInt s= new StackInt(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println(s.peep());
		System.out.println(s.pop());
		
		System.out.println(s.peep());
		System.out.println(s.pop());
		
		System.out.println(s.peep());
		System.out.println(s.pop());
		
		System.out.println(s.peep());
		System.out.println(s.pop());
		
		System.out.println(s.peep());
		System.out.println(s.pop());
	}
}
