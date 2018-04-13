import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.add(60);
		tree.add(40);
		tree.add(70);
		tree.add(30);
		tree.add(42);
		tree.add(65);
		tree.add(72);
		tree.add(28);
		tree.add(35);
		tree.add(62);
		tree.add(68);
		System.out.println("Created Tree:");
		tree.preorder();
		System.out.println("");
		System.out.println("Array to Tree:");		
		int[] a = new int[]{60,40,30,28,35,42,70,65,62,68,72};
		tree = createTree( a );
		tree.preorder();
	}
	
	
	public static Tree createTree( int[] a ) {
		List<Integer> list = new ArrayList<Integer>();
		List<Node> nodes = new ArrayList<Node>();		
		Tree tree = new Tree();
		int n = a.length;
		int x = a[0];
		tree.root = new Node(x);		
		Node node = tree.root;		
		int i = 0;
		do {
			i++;
			if( i == a.length) {
				break;
			}
			if(a[i] < node.val && a[i] != -1) {
				node.left = new Node(a[i]);
				a[i] = -1;
				list.add(i);
				nodes.add(node.left);
				i++;
			}		
			while( node.val > a[i] && a[i] != -1) {
				i++;
			}		
			if(i < n && a[i] != -1) {
				node.right = new Node(a[i]);
				a[i] = -1;
				list.add(i);
				nodes.add(node.right);
			}
			if(list.isEmpty()) {
				break;
			}
			i = list.remove(0);		
			node = nodes.remove(0);
		}while(node != null);
		return tree;
	}

}

class Tree {
	Node root;
	
	public void add( int val ) {
		if( root == null ) {
			root = new Node(val);
		} else {
			root = add( root, val);
		}
	}
	
	private Node add( Node node, int val ) {
		if( node != null ) {
			if( node.val > val ) {
				node.left = add( node.left, val );
			} else {
				node.right = add( node.right, val);
			}
		} else {
			node = new Node( val );
		}
		return node;
	}
	
	public void preorder() {
		preorder(root);
	}
	
	public void preorder( Node node ) {
		if(node != null) {
			System.out.print(node.val + " ");
			preorder( node.left );
			preorder( node.right );
		}
	}
}

class Node {
	int val;
	Node left;
	Node right;
	
	public Node( int val ) {
		this.val = val;
	}
	
	public String toString() {
		return String.valueOf(val);
	}
}