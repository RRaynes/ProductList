package crpl;

public class Product {
	long ID;
	String name;
	double originalPrice;
	double currentPrice;
	
	Product next;
	
	//constructor
	public Product(long ID, String name, double originalPrice, double currentPrice) {
		this.ID = ID;
		this.name = name;
		this.originalPrice = originalPrice;
		this.currentPrice = currentPrice;
		next = null;
	}
	
	public Product() { //creates a dummy Product/Node
		this(-1,null,-1,-1);
	}
	
	public String toString() {
		return "ID: " + ID + " - " + name + " Original Price: " + originalPrice + " currentPrice " + currentPrice;
	}
}
