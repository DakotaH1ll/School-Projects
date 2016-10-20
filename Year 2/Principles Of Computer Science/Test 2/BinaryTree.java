package csci2010u;

public class BinaryTree {
	private BTNode root; // root node of tree

	// Constructor creates an empty tree
	public BinaryTree() {
		root = null;
	}

	// Insert data into a sorted binary tree
	public void insertSorted(int data) {
		// Special case -- tree is empty
		if (root == null) {
			root = new BTNode(data);
		} else {
			// General case -- traverse tree and insert node
			insertNode(root, data);
		}
	}

	private void insertNode(BTNode r, int data) {
		// If data less than or equal to the data in r
		// then insert data into left subtree
		if (data <= r.data) {
			// If there is no left subtree than add a new left node
			// with data in it
			if (r.left == null) {
				r.left = new BTNode(data);
			}
			// otherwise recursively call insertNode on the left subtree
			else {
				insertNode(r.left, data);
			}
		}
		// otherwise insert data into right subtree
		else {
			if (r.right == null) {
				r.right = new BTNode(data);
			} else {
				insertNode(r.right, data);
			}
		}
	}

	public BTNode find(int d) {
		if (root == null) {
			System.out.println("The list is empty, could not find " + d);
		} else {
			find(root, d);
		}
		return root;
	}

	private void find(BTNode root, int d) {
		if (root.data == d) {
		} else {
			if (root.left != null) {
				find(root.left, d);
			} else {
				find(root.right, d);
			}
		}
	}

	// Print contents of tree in order
	public void printInOrder() {
		printInOrder(root);
		System.out.println();
	}

	private void printInOrder(BTNode current) {
		// if current node is null print nothing
		if (current == null)
			return;

		// print left sub-tree
		printInOrder(current.left);
		// print current node
		System.out.print(current.data + " ");
		// print right sub-tree
		printInOrder(current.right);
	}
}