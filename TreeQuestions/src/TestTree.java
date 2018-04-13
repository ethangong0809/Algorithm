class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

class TestTree {

	Node root;

	int maxDepth(Node node) {

		if (node == null) {
			return 0;
		}

		int left = maxDepth(node.left);
		int right = maxDepth(node.right);

		if (left > right) {
			return left + 1;
		}
		return right + 1;

	}
	
	public static void main (String[] args) {
		TestTree tree = new TestTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(4);
        tree.root.left.left.left.left = new Node(5);

      
        System.out.println(tree.maxDepth(tree.root));
	}
}