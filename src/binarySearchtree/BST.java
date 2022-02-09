package binarySearchtree;

public class BST {

	private Node root;

	public void insert(int key, String value) {

		Node newNode = new Node(key, value);
		if (root == null) {
			root = newNode;
		} else {
			Node current=root;
			Node parent;
			
			while(true) {
				parent=current;
				
				if(key<current.key) {
					current=current.leftchild;
					if(current==null) {
						parent.leftchild=newNode;
						return;
					}
				}else {
					current=current.rightchild;
					if(current==null) {
						parent.rightchild=newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node findMin() {
		Node current=root;
		Node last=null;
		
		while(current!=null) {
			last=current;
			current=current.leftchild;
		}
		return last;
	}

	public Node findMax() {
		Node current=root;
		Node last=null;
		
		while(current!=null) {
			last=current;
			current=current.rightchild;
		}
		return last;
	}
}
