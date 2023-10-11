package crpl;

public class Product {
	long ID;
	String name;
	double originalPrice;
	double currentPrice;
	
	//constructor
	public Product(long ID, String name, double originalPrice, double currentPrice) {
		this.ID = ID;
		this.name = name;
		this.originalPrice = originalPrice;
		this.currentPrice = currentPrice;
	}
	
	public Product() { //creates a dummy Product/Node
		this(-1,null,-1,-1);
	}
}
