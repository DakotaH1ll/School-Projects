package lab9;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] lists = new Product[40];
		int i;
		for (i=0; i<20; ++i) {
			String product = "id " + i;
			lists[i] = new Product(product, i*1, i*10);
		}
		for (i=39; i>=20; --i) {
			String product = "id " + i;
			lists[i] = new Product(product, i*1, i*10);
		}

		//////////////////////////////////////////////////////
		// Part 1 - without avl

		LinkedBinaryTree<Product> bt= new LinkedBinaryTree<Product>();
		//bt.setComparator(new ProductComparator());

		for(int j=0; j < lists.length; j++)
		{
			bt.insert(lists[j]);
		}

		bt.print_dot();
/*
		//////////////////////////////////////////////////////
		// Part 2 - with avl balancing

		LinkedBinaryTree<Product> bt_avl = new LinkedBinaryTree<Product>();
		bt.setComparator(new ProductComparator());

		for(int i=0; i < lists.length; i++)
		{
			bt_avl.insert_avl(lists[i]);
		}

		bt_avl.print_dot();

		*/
	}

}