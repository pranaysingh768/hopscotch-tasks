import java.util.*;
public class AddInMenu {

	public void addMenu(Node node) {
		
		LinkedHashMap<String,Node> lMap = new LinkedHashMap<>();
		
		lMap.put("APP001",new Node("Apple",100));
		lMap.put("ORG001",new Node("Orange",80));
		lMap.put("GRP001",new Node("Grapes",120));
		
		//Node node = new Node();
		node.setlMap(lMap);
		
		//return newnode;
	}
}
