class Node{
	int data;
	Node left;
	Node right;
	Node(int value){
		data=value;
		left=right=null;
	}
}
public class BinaryTree{
	Node root;
	public BinaryTree(){
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
	}
	public void printPreorder(Node node){
		if(node==null)
			return;
		System.out.print(node.data+" ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	public int findHeight(Node node){
		if(node==null)
			return -1;
		int lh=findHeight(node.left);
		int rh=findHeight(node.right);
		return Math.max(lh,rh)+1;
	}
	public static void main(String[] args){
		BinaryTree tree=new BinaryTree();
		System.out.println("Preorder Travarsal:");
		tree.printPreorder(tree.root);
		System.out.println();
		int height=tree.findHeight(tree.root);
		System.out.println("Height:"+height);
	}
}