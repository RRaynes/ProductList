package crpl;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ProductList {
	
	Product head = null;
	
	public ProductList(File file) throws FileNotFoundException {
		Scanner scan = new Scanner(file);
		
		int i = 0;
		while (scan.hasNext()) {
			long ID = scan.nextLong();
			scan.nextLine();
			String name = scan.nextLine();
			Double originalPrice = scan.nextDouble();
			Double currentPrice = scan.nextDouble();
			Product p = new Product(ID, name, originalPrice, currentPrice);
			append(p);
		}
	}
	
	void append(Product node) {
		if (head == null) {
			head = new Product();
		}
		Product temp = head.next;
		head.next = node;
		head.next.next = temp;
	}
	
	void print() {
		Product iter = head;
		if (iter.next == null) return;
		for (; iter.next != null; iter = iter.next) {
			
		}
	}
	
}
