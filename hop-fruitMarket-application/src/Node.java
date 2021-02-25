import java.util.LinkedHashMap;

public class Node {
	
	String itemName;
	double itemPrice;
	int itemQty;
	LinkedHashMap<String, Node> lMap;
	LinkedHashMap<String, Node> cartMap;
	
	
	public Node(String itemName, double itemPrice, LinkedHashMap<String, Node> lMap,LinkedHashMap<String, Node> cartMap) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.lMap = lMap;
		this.cartMap = cartMap;
	}
	public Node() {
		super();
		cartMap = new LinkedHashMap<String, Node>();
	}
	public Node(String itemName, double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public LinkedHashMap<String, Node> getlMap() {
		return lMap;
	}
	public void setlMap(LinkedHashMap<String, Node> lMap) {
		this.lMap = lMap;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	public LinkedHashMap<String, Node> getCartMap() {
		return cartMap;
	}
	public void setCartMap(LinkedHashMap<String, Node> cartMap) {
		this.cartMap = cartMap;
	}
	
	

	
	
	
	
	
	
	
}
