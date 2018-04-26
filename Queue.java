package DS.DS;

public class Queue {
	
/*add
 * head
 * tail
 * size
 * isEmpty
*remove*/
	
	int arr[];
	int size;
	int head;
	
	public Queue() {
		arr= new int[10];
	}
	
	public Queue(int capacity) {
		arr= new int[capacity];
	}
	
	public void add(int a)
	{
		if(size==arr.length)
		{
			System.out.println("CANNOT ADD ANY OTHER DATA.");
		}
		
		else {
			arr[size]=a;
			size++;
		}
	}
	
	public int remove()
	{
		int v;
		if (size<0)
			v=-1;
		else
			{
				v=arr[head];
				size--;
				head++;
			}
		
		return v;
	}
	
	public int head()
	{
		return arr[head];
	}
	
	public int tail()
	{
		return arr[size-1];
	}
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0)
			return true;
		
		else
			return false;
	}
	
}
