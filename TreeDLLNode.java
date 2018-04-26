package DS.DS;

public class TreeDLLNode {

	TreeDLLNode left, right;
	int value;
	
	public TreeDLLNode(int a)
	{
		value=a;
		left=null;
		right=null;
	}
	
	public TreeDLLNode(int a, TreeDLLNode l, TreeDLLNode r)
	{
		value=a;
		left=l;
		right=r;
	}
	
}
