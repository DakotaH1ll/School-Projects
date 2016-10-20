package csci2010u;

//Generic list element for doubly linked list
public class LinkedListElement<T> {
	T content;
	LinkedListElement next;
	LinkedListElement prev;
	
	public LinkedListElement(T content) {
		this.content = content;
		next = prev = null;
	}
}