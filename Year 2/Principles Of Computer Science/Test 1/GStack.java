class GStack<T> {
	private T[] storage;
	private int i;

	public GStack() {
		i = 0;
		storage = (T[]) new String[10];

	}

	public T top() {
		if (storage[0] == null) {
			System.out.println("The stack is empty!");
		} else {
			System.out.print(storage[i - 1]);
		}
		return (T) "";


	}

	public T pop() {
		if (storage[0] == null) {
			System.out.println("The stack is empty!");
		} else {

			System.out.println(storage[--i]);
		}
		return (T) "";
		

	}

	public T push(T o) {
		if (storage[9] == null) {
			storage[i++] = o;

		} else {
			System.out.println("The stack is full!");
		}
		return o;
	}


}
