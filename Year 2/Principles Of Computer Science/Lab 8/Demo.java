package CSCI2010u;

public class Demo {

	public static void main(String[] args) {
		// Testing binary tree
		// Test the constructor
		BinaryTree testTree = new BinaryTree();
		// Test sortedInsert method
		testTree.insertSorted(5);
		testTree.insertSorted(10);
		testTree.insertSorted(2);
		testTree.insertSorted(3);
		
		System.out.print(testTree.toString());
		System.out.println();

		int data = 10;
		BTNode temp = testTree.find(data);
		if (temp == null) {
			System.out.println("Could not find " + data);
		} else {
			System.out.println(data + " found!");
		}
		
		System.out.println();
		testTree.spin();
		testTree.printInOrder();
		
	}
}
