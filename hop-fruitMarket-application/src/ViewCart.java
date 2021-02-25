import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ViewCart {
	
	 
	
	public void showCart(LinkedHashMap<String, Node> cartMap) {
		
//		if(cartMap.isEmpty()) {
//			
//			throw new CustomException("Your Cart Is Empty!!");
//		}
		
		CheckForExeption.toCheckEmpty(cartMap);
		
		double totalAmt = 0;
		
		Set<Entry<String, Node>> s1 = cartMap.entrySet();
		
		Iterator<Entry<String, Node>> it = s1.iterator();
		
		System.out.println("Item Code"+"  "+"Item Name"+"  "+"Item price"+"  "+"Item Qty");
		System.out.println();
		
		while(it.hasNext()) {
			
			Map.Entry<String,Node> m1 = (Entry<String, Node>)it.next();
			
			totalAmt += ((m1.getValue().getItemPrice()) * (m1.getValue().getItemQty()));
			
			System.out.println(m1.getKey()+"     "+m1.getValue().getItemName()+"     "+m1.getValue().getItemPrice()+"     "+m1.getValue().getItemQty());
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("Total Cart Amount :: "+totalAmt);
		System.out.println("------------------------------");
	}
}
