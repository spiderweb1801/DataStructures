package DS.DS;

public class Stack {

	int size;
	int arr[];
	
	public Stack() {
		arr= new int[10];
	}
	
	public Stack(int capacity) {
		arr= new int[capacity];
	}

	public void push(int a) {
		
		if(size==arr.length)
		 System.out.println("Element cannot be added into the stack.");
		
		else {
			arr[size]=a;
			size++;
		}
		
	}
	
	public int pop() {
		int ret=0;
		if(size==0) {
			ret=-1;
		}
		
		else {
			size--;
			ret=arr[size];
			size--;
		}
		
		return ret;
	}
	
	public int peep() {
		int ret=0;
		if(size<=0) {
			ret=-1;
		}
		
		else {
			ret=arr[size-1];
		}
		
		return ret;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
			return true;
		
		else
			return false;
	}
}
