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
		if (isEmpty()) {
			first = new LinkedListElement<S>(newContent);
		} else {
			LinkedListElement<S> currElement = first;
			if (currElement.next == null) {
				currElement.next = new LinkedListElement<S>(newContent);
			} else {
				currElement = currElement.next;
			}
		}

	}

	// Insert an element after another element
	public void insertAfter(S newContent, S existingContent) {
		if (isEmpty()) {
			System.out.println("<empty list>");
		} else {
			LinkedListElement<S> currElement = first;
			
			if (currElement.content == existingContent) {
				LinkedListElement<S> oldCurr = currElement.next;
				currElement.next = new LinkedListElement<S>(newContent);
				currElement.next.next = oldCurr;
			} else {
				currElement = currElement.next;
			}
		}
	}

	// Delete the last element of the doubly linked list
	public void delete() {
		if (isEmpty()) {
			System.out.println("<empty list>");
		} else {
			LinkedListElement<S> currElement = first;
			if (currElement == null) {
				currElement.prev = null;
			}
			currElement = currElement.next;
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