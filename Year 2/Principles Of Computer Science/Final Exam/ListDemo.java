package csci2010u;

public class ListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> intList = new LinkedList<Integer>();
		intList.append(5);
		intList.append(7);
		intList.insertAfter(8, 5);
		System.out.println(intList.toString());
		intList.delete();
		System.out.println(intList.toString());
	}

}