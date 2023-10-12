package crpl;

public class Product {
	long ID;
	String name;
	double originalPrice;
	double currentPrice;
	double discount;
	
	Product next;
	
	//constructor
	public Product(long ID, String name, double originalPrice, double currentPrice) {
		this.ID = ID;
		this.name = name;
		this.originalPrice = originalPrice;
		this.currentPrice = currentPrice;
		discount = originalPrice - currentPrice;
		next = null;
	}
	
	public Product(Product p) { //creates a dummy Product/Node
		this(p.ID,p.name,p.originalPrice,p.currentPrice);
	}
	
	public Product() { //creates a dummy Product/Node
		this(-1,null,-1,-1);
	}
	
	public String toString() {
		return "ID: " + ID + " - " + name + " Original Price: " + originalPrice + " currentPrice " + currentPrice;
	}
}
