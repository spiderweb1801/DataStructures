package DS.DS;

public class SortStackUsingStack {
	//sorting the stack in ascending order, ie the min is at the bottom and max at the top.
	public SortStackUsingStack(StackInt s)
	{
		StackInt sRef= new StackInt(s.size);
		
		int temp=0;

		while(!s.isEmpty())
		{
			temp=s.pop();
			
			if(sRef.isEmpty())
			{
				sRef.push(temp);
			}
			
			else
			{
				int a=0;
				
				while(sRef.peep()<temp)
				{
					int poped=sRef.pop();
					
					if(poped == -10)
					{
						a=1;
						sRef.push(temp);
					}
					  
					else {
						s.push(poped);	
					}
					
				}
				
				if(a==0)
				sRef.push(temp);
				else {}
				
			}
			
		}
		
		while(!sRef.isEmpty())
		{
			s.push(sRef.pop());
		}
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop()); 
		}
	}
	
	public static void main(String[] args) {
		
		StackInt stack= new StackInt(5);
		stack.push(5);
		stack.push(15);
		stack.push(526);
		stack.push(5);
		stack.push(1);
		new SortStackUsingStack(stack);
		
	}

}
