import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PlacedOrder {
	
	public void placedOrder(LinkedHashMap<String, Node> cartMap,ArrayList<LinkedHashMap<String, Node>> arr) {
		
//		if(cartMap.isEmpty()) {
//			
//			throw new CustomException("Your Cart Is Empty!!");
//		}
		
		CheckForExeption.toCheckEmpty(cartMap);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Are You Want to Place Your Order!!(Y/N) If YES then type Y other wise N :: ");
		String input = sc.next();
		
		
		if(input.equalsIgnoreCase("N"))
			return;
		
		LinkedHashMap<String, Node> cart = new LinkedHashMap<String, Node>(cartMap);
		arr.add(cart);
		cartMap.clear();
		
		System.out.println("-----------------------------");
		System.out.println("Your Order is Placed!! \n Thank You..");
		System.out.println("-----------------------------");
		
		
	}
}
