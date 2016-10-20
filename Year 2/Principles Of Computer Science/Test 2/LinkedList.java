package csci2010u;

public class LinkedList<S> {

	private LinkedListElement<S> first;
	private LinkedListElement<S> last;

	public LinkedList() {
		first = last = null;
	}

	// check if list is empty
	public boolean isEmpty() {
		return (first == null);
	}

	// Append an element to end of list
	public void append(S newContent) {
		LinkedListElement<S> current = first;
		if (isEmpty()) {
			first = new LinkedListElement<S>(newContent);
		} else {
			if (current.next == null) {
				current.next = new LinkedListElement<S>(newContent);
			}
			current = current.next;
		}
	}

	// Delete the last element of the doubly linked list
	public void delete() {
		LinkedListElement<S> current = first;
		if (isEmpty()) {
			System.out.println("The list is already empty, nothing deleted!");
		} else {
			if (current.next == null) {
				current = null;
			}
			current = current.next;
		}
	}

	// Convert list to string
	public String toString() {
		if (isEmpty()) {
			return ("<empty list>");
		}
		String listContents = new String();
		LinkedListElement<S> currElement = first;
		while (currElement != null) {
			listContents += currElement.content.toString();
			if (currElement.next != null) {
				listContents += " <-> ";
			}
			currElement = currElement.next;
		}
		return listContents;
	}

}