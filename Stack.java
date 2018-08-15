package DS.DS;

public class Stack {

	int size;
	char arr[];
	
	public Stack() {
		arr= new char[10];
	}
	
	public Stack(int capacity) {
		arr= new char[capacity];
	}

	public void push(char a) {
		
		if(size==arr.length)
		 System.out.println("Element cannot be added into the stack.");
		
		else {
			arr[size]=a;
			size++;
		}
		
	}
	
	public char pop() {
		char ret=0;
		if(size==0) {
			ret=0;
		}
		
		else {
			size--;
			ret=arr[size];
			//size--;
		}
		
		return ret;
	}
	
	public char peep() {
		char ret=0;
		if(size<=0) {
			ret=0;
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
