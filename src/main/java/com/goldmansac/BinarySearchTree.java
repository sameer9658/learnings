package goldmansac;

 class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
	}
public class BinarySearchTree { 

	
	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}
	
	public void add(int data) {
		root = add(root, data);
	}
   
	public Node add(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		}
		if (node.data > data) {
			node.left = add(node.left, data);
		} else if (node.data < data) {
			node.right = add(node.right, data);
		}
		return node;
	}

	public void display() {
		inorder(root);
	}

	public void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);

	}

	public boolean contains(int data) {
		return contains(root, data);
	}

	public boolean contains(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		}

		if (node.data > data) {
			return contains(node.left, data);
		} else {
			return contains(node.right, data);
		}
	}
	}
	
public static void main(String[] args) {
		
		//BinarySearchTree binarySearchTree = new BinarySearchTree();
		//binarySearchTree.add(5);
	}	
}
