package CSCI2010u;

public class BinaryTree {
	private BTNode root;

	// Constructor creates empty tree
	public BinaryTree() {
		root = null;
	}

	// Insert data into sorted binary tree
	public void insertSorted(int data) {
		// Special case -- Empty tree
		if (root == null) {
			root = new BTNode(data);
		} else {
			// General case -- Traverse tree and insert node where it goes
			insertNode(root, data);
		}
	}

	private void insertNode(BTNode r, int data) {
		// If data is less than or equal to the data in r
		// Insert data into left subtree
		if (data <= r.data) {
			// If there is no left subtree, then add a new left node, with data
			if (r.left == null) {
				r.left = new BTNode(data);
			} else {
				// Otherwise recursively call insertNode on the left subtree
				insertNode(r.left, data);
			}

			// Otherwise insert data into right subtree
		} else {
			if (r.right == null) {
				r.right = new BTNode(data);
			} else {
				insertNode(r.right, data);
			}

		}

	}

	public BTNode find(int d) {
		return find(root, d);
	}

	private BTNode find(BTNode current, int d) {
		// Empty case
		if (current == null) {
			return null;
		}
		// If the data is the root
		if (current.data == d) {
			return current;
		}
		// Create temp node
		BTNode temp = null;
		// Search left
		temp = find(current.left, d);
		if (temp != null) {
			return temp;
		}
		// Else search right
		return (find(current.right, d));

	}

	public void spin() {
		if (root == null) {
			System.out.println("The tree is empty!");
		} else {
			System.out.println("Spinning The Tree!");
			spin(root);
		}
	}

	private void spin(BTNode current) {
		if (current.left != null && current.right != null) {
			BTNode temp = new BTNode(0);
			temp = null;
			temp = current.left;
			current.left = current.right;
			current.right = temp;
			spin(current.left);
			spin(current.right);
		} else if (current.left != null && current.right == null) {
			current.right = current.left;
			current.left = null;
			spin(current.right);
		} else if (current.left == null && current.right != null) {
			current.left = current.right;
			current.right = null;
			spin(current.left);
		}

	}

	// Prints the contents of the tree in order
	public void printInOrder() {
		printInOrder(root);
		System.out.println();
	}

	private void printInOrder(BTNode current) {
		// If the current node is null
		if (current == null) {
			return;
		}
		// Print left subtree first
		printInOrder(current.left);

		// Print current node
		System.out.print(current.data + " ");

		// Print right subtree second
		printInOrder(current.right);
	}

	// Creates a string containing tree contents
	public String toString() {
		if (root == null) {
		} else {
			for (int i = 0; i < (maxTreeWidth() / 2); i++) {
				System.out.print("	");
			}
			System.out.println(root.data);
			toString(root);
		}
		return "";
	}

	private void toString(BTNode current) {
		if (current.left != null && current.right != null) {
			for (int i = 0; i < (maxTreeWidth() / 2); i++) {
				System.out.print("	");
			}
			System.out.println("/ \\");
			for (int i = 0; i < (maxTreeWidth() / 2); i++) {
				System.out.print("	");
				System.out.println(current.left.data + "  "
						+ current.right.data);

			}
			toString(current.right);
			toString(current.left);

		} else if (current.left == null && current.right != null) {
			for (int i = 0; i < (maxTreeWidth() / 2); i++) {
				System.out.print("	");
			}
			System.out.println("\\");
			for (int i = 0; i < (maxTreeWidth() / 2); i++) {
				System.out.print("	");
				System.out.println(current.right.data);
			}
			toString(current.right);
		} else if (current.left != null && current.right == null) {
			for (int i = 0; i < (maxTreeWidth() / 2); i++) {
				System.out.print("	");
			}
			System.out.println("/");
			for (int i = 0; i < (maxTreeWidth() / 2); i++) {
				System.out.println(current.left.data);
			}
			toString(current.left);
		}
	}

	public String subtreeToString(BTNode r) {
		String subtreeData = new String();

		if (r == null) {
			return subtreeData;
		}

		if (r.left != null) {
			subtreeData += (r.data + " -> " + r.left.data + " [Left]\n");
		}
		subtreeData += subtreeToString(r.left);

		if (r.right != null) {
			subtreeData += (r.data + " -> " + r.right.data + " [Right]\n");
		}
		subtreeData += subtreeToString(r.right);

		return subtreeData;
	}

	int treeHeight() {
		return treeHeight(root);
	}

	private int treeHeight(BTNode current) {
		if (current == null) {
			return 0;
		} else {
			return (1 + Math.max(treeHeight(current.left),
					treeHeight(current.right)));
		}
	}

	int maxTreeWidth() {
		if (root == null) {
			return 0;
		} else {
			return maxTreeWidth(root);
		}
	}

	private int maxTreeWidth(BTNode current) {

		int maxWidth = 0;
		int width;
		int h = treeHeight(root);
		int i;
		for (i = 1; i <= h; i++) {
			width = getWidth(root, i);
			if (width > maxWidth)
				maxWidth = width;
		}
		return maxWidth;
	}

	private int getWidth(BTNode current, int level) {
		if (current == null) {
			return 0;
		}
		if (level == 1) {
			return 1;
		} else {
			return getWidth(current.left, level - 1)
					+ getWidth(current.right, level - 1);

		}
	}
}
