import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ViewMenu {

	public void showMenu(Node node) {
		
//		Optional<Node> optional = Optional.ofNullable(node);
//		
//		if(!optional.isPresent()) {
//			
//			throw new CustomException("Menu List Is Empty!!");
//		}
		
		
		CheckForExeption.toCheckNull(node);
		
		Set<Entry<String, Node>> s1 = node.getlMap().entrySet();
		
		Iterator<Entry<String, Node>> it = s1.iterator();
		
		System.out.println("Item Code"+"  "+"Item Name"+"  "+"Item price");
		System.out.println();
		
		while(it.hasNext()) {
			
			Map.Entry<String,Node> m1 = (Entry<String, Node>)it.next();
			
			
			System.out.println(m1.getKey()+"     "+m1.getValue().getItemName()+"     "+m1.getValue().getItemPrice());
			System.out.println();
		}
	}
}
