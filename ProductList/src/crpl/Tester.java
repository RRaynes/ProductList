package crpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Making product list reading input from products.txt & printing this list");
		ProductList pl = new ProductList(new File("products.txt"));
		pl.print();
		
		System.out.println("\nMaking product list by passing through list 'pl' & printing this list");
		ProductList pl0 = new ProductList(new File("products.txt"));
		pl0.print();
		
		System.out.println("\nMerge-sorting product list 'plo' by it's discount and printing it");
		pl0.mergeSort();
		pl0.print();
	}
	
}
