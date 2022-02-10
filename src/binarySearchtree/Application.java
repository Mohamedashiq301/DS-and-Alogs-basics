package binarySearchtree;

public class Application {
	public static void main(String[] args) {
		
		BST tree =new BST();
		
		tree.insert(10,"Ten");
		tree.insert(20,"Twenty");
		tree.insert(15,"Fifteen");
		
		tree.insert(22, "TwentyTwo");
		
		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);
	}

}
