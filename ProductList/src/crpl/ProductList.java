package crpl;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ProductList {

	Product head;

	public ProductList(File file) throws FileNotFoundException {
		head = new Product();
		Scanner scan = new Scanner(file);

		while (scan.hasNext()) {
			long ID = scan.nextLong();
			scan.nextLine();
			String name = scan.nextLine();
			Double originalPrice = scan.nextDouble();
			Double currentPrice = scan.nextDouble();
			Product p = new Product(ID, name, originalPrice, currentPrice);
			this.append(p);
		}
	}

	public ProductList(ProductList pl) {
		head = new Product();

		Product iter = pl.head.next;
		for (; iter != null; iter = iter.next) {
			System.out.println("A");
			this.insertAtEnd(new Product(iter));
		}
	}
	
	void mergeSort() {
		mergeSort(head.next);
	}
	
	Product mergeSort(Product start) {
		if (start.next == null)
			return start;
		Product middle = getMiddle(start); // gets middle node within the LL
		Product rightNode = middle.next; // saves reference of its next node
		middle.next = null; // deletes reference of middle to seperate to two lists
		// now we merge each section of the LL
		Product left = mergeSort(start); // head is the left side of the LL
		Product right = mergeSort(rightNode);
		return merge(left, right);
	}

	Product merge(Product a, Product b) {
		Product res = null;
		if (a == null) 
			return b;
		if (b == null)
			return a;
		if (a.discount >= b.discount) {
			res = a;
			res.next = merge(a.next, b);
		} else {
			res = b;
			res.next = merge(a, b.next);
		}
		return res;
	}
	
	Product getMiddle(Product start) {
		Product slow = start; //used start instead of head
		Product fast = start;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	void append(Product node) {
		Product temp = head.next;
		head.next = node;
		node.next = temp;
	}

	void insertAtEnd(Product node) {
		Product iter = head;
		for (; iter.next != null; iter = iter.next) {
		}
		iter.next = node;
	}

	void print() {
		Product iter = head.next;
		for (; iter != null; iter = iter.next) {
			System.out.println(iter);
		}
	}

}
