package crpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		ProductList pl = new ProductList(new File("products.txt"));
		
	}
	
	void call1() {
		Scanner scan = new Scanner("products.txt");
	}
}
