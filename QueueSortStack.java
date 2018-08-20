package DS.DS;

public class QueueSortStack {
	
	public void sort(Queue q)
	{
		StackInt s= new StackInt(q.maxSize);
		
		while(!q.isEmpty())
		{
			int get= q.remove();
			
			if(s.isEmpty())
				s.push(get);
			
			else {
				int a=0;
				while(s.peep()<get)
				{
					if(s.peep() == -10)
						{
							s.push(get);
							a=1;
						}
					else {
						q.add(s.pop());
						a=0;
					}
						
				}
				if(a==0)
				{
					s.push(get);
				}
				
			}
		}
		
		while(!s.isEmpty())
		{
			int temp=s.pop();
			q.add(temp);
		}
	}

	public void printSortedQueue(Queue q)
	{
		q.view();
	}
	
	public static void main(String[] args) {
		
		QueueSortStack qs= new QueueSortStack();
		Queue q= new Queue(5);
		q.add(55);
		q.add(44);
		q.add(33);
		q.add(22);
		q.add(11);
		qs.sort(q);
		qs.printSortedQueue(q);
	}

}
