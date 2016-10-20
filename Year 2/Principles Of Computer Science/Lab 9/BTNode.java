package lab9;


public class BTNode<T>
{
	private BTNode<T> left, right;
	private T element;
	
	public BTNode(T element)
	{
		this.element = element;
	}
	
	public BTNode<T> getLeft() {
		return left;
	}
	public void setLeft(BTNode<T> left) {
		this.left = left;
	}
	public BTNode<T> getRight() {
		return right;
	}
	public void setRight(BTNode<T> right) {
		this.right = right;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}	
}