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
		if (data < r.data) {
			if (r.left == null) {
				r.left = new BTNode(data);
			} else {
				insertNode(r.left, data);
			}
		} else if (data > r.data) {
			if (r.right == null) {
				r.right = new BTNode(data);
			} else {
				insertNode(r.right, data);
			}
		}
	}

	public BTNode find(int d) {
		return (find(root, d));
	}

	private BTNode find(BTNode current, int d) {
		if (current == null) {
			return null;
		}
		if (current.data == d) {
			return current;
		}
		BTNode temp = null;
		temp = find(current.left, d);
		if (temp != null) {
			return temp;
		}
		return (find(current.right, d));
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

	// Generate a string containing tree contents
	public String toString() {
		String treeData = "tree:\n";
		if (root == null) {
			treeData += "<empty>\n";
		} else if (root.left == null && root.right == null) {
			treeData += root.data + "\n";
		} else {
			// Recursively copy tree node data to string
			treeData += subtreeToString(root);
		}
		return treeData;
	}

	public String subtreeToString(BTNode r) {
		String subtreeData = new String();
		if (r == null) {
			return subtreeData;
		}

		if (r.left != null) {
			subtreeData += (r.data + " -> " + r.left.data + " [left]\n");
		}
		subtreeData += subtreeToString(r.left);

		if (r.right != null) {
			subtreeData += (r.data + " -> " + r.right.data + " [right]\n");
		}
		subtreeData += subtreeToString(r.right);
		return subtreeData;
	}

}