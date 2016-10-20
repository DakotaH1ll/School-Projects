package lab9;

import lab9.BTNode;

public class LinkedBinaryTree<T> {
	protected BTNode<T> root;

	// Create an empty binary tree
	public LinkedBinaryTree() {
		root = null;
	}

	public BTNode<T> getRootElement() throws Exception {
		if (root == null)
			throw new Exception("Get root operation failed. The tree is empty");
		return root;
	}

	public LinkedBinaryTree getLeft() throws Exception {
		if (root == null)
			throw new Exception("Get Left tree failed. The tree is empty.");
		LinkedBinaryTree result = new LinkedBinaryTree();
		result.root = root.getLeft();
		return result;
	}

	public LinkedBinaryTree getRight() throws Exception {
		if (root == null)
			throw new Exception("Get right tree failed. The tree is empty.");
		LinkedBinaryTree result = new LinkedBinaryTree();
		result.root = root.getRight();
		return result;
	}

	public void inorder() {
		inorder(this.root);
	}

	public void inorder(BTNode<T> _root) {
		if (_root != null) {
			inorder(_root.getLeft());
			System.out.println(_root.getElement().toString());
			inorder(_root.getRight());
		}
	}

	public void insert(T value) {
		if (root == null) {
			root = new BTNode(value);
		} else {

			insert(root, value);
		}
	}

	private void insert(BTNode<T> root, T value) {
		int compareResult = compare(value,root.getElement() );
		if (compare(root.getElement(), value) > 0) {
			if (root.getLeft() == null) {
				root.setLeft(new BTNode(value));
			} else {
				insert(root.getLeft(), value);
			}
		}

	}

	//--------------------------Insert a node (with avl)--------------------------//	
	public void insert_avl(T value)
	{
		if (root == null) {
			root = new BTNode(value);
		} else {
			insert_avl(root, value);
		}
	}
	
	//----------------------------End of Insert-----------------------------------*/

	private void insert_avl(BTNode<T> root, T value) {
	
	
		if (compare(value, root.getElement()) < 0) {
			root.setLeft(new BTNode(value));
			if(height(root.getLeft()) - height(root.getRight()) == 2);
		
			if (compare(value, root.getLeft())<0){
				root = rotateWithLeftChild(root);
	
			} else {
				root = doubleWithLeftChild(root);
			}	

		} else if (compare(value, root.getElement()) > 0) {		
			root.setRight(new BTNode(value));
			
			if(height(root.getRight()) - height(root.getLeft()) == 2) {

				if (compare(value, root.getLeft())<0){
					root = rotateWithRightChild(root);
					
				} else {
					root = doubleWithRightChild(root);
				}
			}
		}
	}
	

	private int height(BTNode<T> root) {
		if (root == null) {
			return 0;
		} else {
			return (1 + Math.max(height(root.getLeft()),
					height(root.getRight())));
		}
	}

	public String print_dot() {

		String treeData = "tree:\n";
		System.out.println("{");
		if (root == null) {
			treeData += "<empty>\n";
		} else {
			// Recursively copy tree node data to string
			treeData += print_dot(root);
			System.out.println("}");
		}
		return treeData;
		
	}

	private String print_dot(BTNode<T> root) {
		
		String subtreeData = new String();
		if (root == null) {
			return subtreeData;
		}

		if (root.getLeft() != null) {
			subtreeData += ("<" + root.getElement() + "> ->" + "<"
					+ root.getLeft().getElement() + "> [left]\n");
		}
		subtreeData += print_dot(root.getLeft());

		if (root.getRight() != null) {
			subtreeData += ("<" + root.getElement() + "> ->" + "<"
					+ root.getRight().getElement() + "> [right]\n");
		}
		subtreeData += print_dot(root.getRight());
		return subtreeData;
	
	}
}