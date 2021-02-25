import java.util.LinkedHashMap;
import java.util.Optional;

public class CheckForExeption {

	public static void toCheckEmpty(LinkedHashMap<String, Node> cartMap) {
		
		if(cartMap.isEmpty()) {
			
			throw new CustomException("Your Cart Is Empty!!");
		}
	}
	
	public static void toCheckNull(Node node) {
		
		Optional<Node> optional = Optional.ofNullable(node);
		
		if(!optional.isPresent()) {
			
			throw new CustomException("Menu List Is Empty!!");
		}
	}
}
