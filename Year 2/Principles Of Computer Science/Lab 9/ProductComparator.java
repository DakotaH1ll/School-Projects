package lab9;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product a, Product b) {
		return a.compareTo(b.name);
	}
}