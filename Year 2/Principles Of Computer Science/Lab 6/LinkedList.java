package CSCI2010;

public class LinkedList<S> {
	private int size = 0;
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
		// step 1: create new element
		LinkedListElement<S> currElement = new LinkedListElement<S>(newContent);
		// step 2: add element to end
		if (first == null) {
			first = currElement;
			size++;
		} else {
			last.next = currElement;
			currElement.prev = last;
			size++;
		}
		// step 3: update last
		last = currElement;
	}

	// Insert an element after another element
	public void insertAfter(S newContent, S existingContent) {
		if (isEmpty()) {
			System.out
					.println("<list empty and element not found -- no new element added>");
		} else {
			// step 1: create new element
			LinkedListElement<S> currElement = first;
			// step 2: find node with existing content and add new node after it
			while (currElement != null) {
				if (currElement.content.equals(existingContent)) {
					LinkedListElement<S> newElement = new LinkedListElement<S>(
							newContent);
					if (currElement != last) {
						currElement.next.prev = newElement;
						size++;
					}
					newElement.next = currElement.next;
					currElement.next = newElement;
					newElement.prev = currElement;
					size++;
					return;
				}
				currElement = currElement.next;
			}
			System.out
					.println("<list searched and element not found -- no new element added>");
		}

	}

	// Delete the last element of the doubly linked list
	public void delete() {
		// Special case 1: List is empty
		// Special case 2: List has exactly 1 element
		// general case: List has more than 1 element

		// Check if list is empty
		if (!(this.isEmpty())) {
			if (this.first == this.last) {
				this.first = this.last = null;
			} else {
				// Last element is now second last element
				this.last = this.last.prev;
				size--;
				// last's next is now null
				this.last.next = null;
			}
		} else {
			System.out.println("<list empty - no element deleted>");
		}
	}

	// Sort the current list
	public void sort_InPlace() {
		if (isEmpty()) {
			System.out.println("The list is empty!");
		} else if (first.next == null) {
			System.out.println("There is only one item, the list is already sorted!");
		} else {
			
			LinkedListElement<S> nextSmallestElement = findSmallest();
			first = nextSmallestElement;
			LinkedListElement<S> currElement;
			LinkedListElement<S> nextBigger;
			while (nextSmallestElement != null) {
				currElement = first;
				nextBigger = null;
				nextBigger = findNextBiggest(nextSmallestElement, currElement,
						nextBigger);
				if (nextBigger != null) {
					currElement = nextBigger;
				}
				nextSmallestElement = nextBigger;
			}
			last = findBiggest();
		}
	}

	// Sort the current list and return it as a new list
	public LinkedList<S> sort_OutOfPlace() {
		// Check the special case of an empty list
		// if the list is empty we return a new empty list
		if (isEmpty()) {
			return (new LinkedList<S>());
		}

		// General case -- the list is not empty
		// step 1: create a new list and add the smallest element to the list
		LinkedList<S> newList = new LinkedList<S>();
		LinkedListElement<S> nextSmallestElement = findSmallest();
		newList.append(nextSmallestElement.content);
		LinkedListElement<S> currElement;
		LinkedListElement<S> nextBigger;
		while (nextSmallestElement != null) {
			currElement = first;
			nextBigger = null;
			nextBigger = findNextBiggest(nextSmallestElement, currElement,
					nextBigger);
			if (nextBigger != null) {
				newList.append(nextBigger.content);
			}
			nextSmallestElement = nextBigger;
		}

		return newList;
	}

	private LinkedListElement<S> findNextBiggest(
			LinkedListElement<S> nextSmallestElement,
			LinkedListElement<S> currElement, LinkedListElement<S> nextBigger) {
		while (currElement != null) {
			// Check if currElement is bigger than smallest element
			if (currElement.content.toString().compareTo(
					nextSmallestElement.content.toString()) < 0) {
				// Check if currElement is smaller than next bigger
				if (nextBigger == null) {
					nextBigger = currElement;
				} else if (currElement.content.toString().compareTo(
						nextBigger.content.toString()) > 0) {
					nextBigger = currElement;
				}
			}
			currElement = currElement.next;
		}
		return nextBigger;
	}

	private LinkedListElement<S> findSmallest() {
		// Find smallest
		LinkedListElement<S> currElement = first;
		LinkedListElement<S> newElement = null;

		while (currElement != null) {
			if (newElement == null) {
				newElement = currElement;
			} else {
				if (currElement.content.toString().compareTo(
						newElement.content.toString()) > 0) {
					newElement = currElement;
				}
			}
			currElement = currElement.next;
		}
		return newElement;
	}

	private LinkedListElement<S> findBiggest() {
		// Find smallest
		LinkedListElement<S> currElement = first;
		LinkedListElement<S> newElement = null;

		while (currElement != null) {
			if (newElement == null) {
				newElement = currElement;
			} else {
				if (currElement.content.toString().compareTo(
						newElement.content.toString()) < 2) {
					newElement = currElement;
				}
			}
			currElement = currElement.next;
		}
		return newElement;
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