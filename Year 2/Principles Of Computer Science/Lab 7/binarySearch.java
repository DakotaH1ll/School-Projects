package CSCI2010;

public class binarySearch {

	public static void main(String[] args) {

		City[] cities = new City[5];
		cities[0] = new City("Ajax", "ON", 110000);
		cities[1] = new City("Oshawa", "ON", 150000);
		cities[2] = new City("Pickering", "ON", 90000);
		cities[3] = new City("Toronto", "ON", 250000);
		cities[4] = new City("Whitby", "ON", 122000);

		int result = binarySearch(cities, "Toronto");
		if (result >= 0) {
			System.out.println("Result is element number " + result + ": "
					+ cities[result].getName());
		} else {
			System.out.println("Element not found!");
		}

		int result2 = binarySearch(cities, "Windsor");
		if (result2 >= 0) {
			System.out.println("Result is element number " + result2 + ": "
					+ cities[result2].getName());
		} else {
			System.out.println("Element not found!");
		}
		
		int result3 = binarySearch(cities, "Ajax");
		if (result3 >= 0) {
			System.out.println("Result is element number " + result3 + ": "
					+ cities[result3].getName());
		} else {
			System.out.println("Element not found!");
		}
		
		
	}

	private static int binarySearch(City[] list, String target) {
		int first = 0;
		int last = list.length - 1;
		int mid;

		while (first <= last) {
			mid = (first + last) / 2;
			if (list[mid].toString().equals(target)) {
				return mid;
			} else {
				if (list[mid].toString().compareTo(target) > 0) {
					last = mid - 1;
				} else if (list[mid].toString().compareTo(target) < 0) {
					first = mid + 1;
				}
			}
		}
		return -1;
	}

}
