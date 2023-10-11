package crpl;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ProductList {
	
	Product head = null;
	
	public ProductList(File file) throws FileNotFoundException {
		Scanner scan = new Scanner(file);
	}
	
	void append(Product node) {
		if (head == null) {
			head = new Product();
		}
	}
}
