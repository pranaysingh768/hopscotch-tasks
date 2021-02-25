import java.util.*;

public class AddToCart {
	
	public void addInCart(Node node,LinkedHashMap<String, Node> cartMap) {
		
		CheckForExeption.toCheckNull(node);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Item Code :: ");
		String itemCode = sc.next();
		
		System.out.print("Enter Quantity :: ");
		int itemQty = sc.nextInt();
		
		//sc.close();
	
		if(node.getlMap().containsKey(itemCode)) {
			
			Node cartNode = new Node();
			
			cartNode.setItemName(node.getlMap().get(itemCode).getItemName());
			cartNode.setItemPrice(node.getlMap().get(itemCode).getItemPrice());
			
			if(cartMap.containsKey(itemCode)) {
				int totalQty = cartMap.get(itemCode).getItemQty() + itemQty;
				cartNode.setItemQty(totalQty);
			}else {
				cartNode.setItemQty(itemQty);
			}
			
			cartMap.put(itemCode,cartNode);
			
		}
		else {
			System.out.println("Not present");
		}
		
		
	}
}
