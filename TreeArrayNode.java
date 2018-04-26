package DS.DS;

public class TreeArrayNode {

	TreeArrayNode left, right;
	
	int value;
	
	public TreeArrayNode(int a) {
		value=a;
		left=null;
		right=null;
	}
	
public TreeArrayNode(int a, TreeArrayNode l, TreeArrayNode r) {
	value=a;
	left=l;
	right=r;	
	}
	
}
