import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FMA {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		Node node = new Node();
		
		AddInMenu addInMenu = new AddInMenu();
		
		addInMenu.addMenu(node);
		
		LinkedHashMap<String, Node> cartMap = new LinkedHashMap<String, Node>();
		ArrayList<LinkedHashMap<String, Node>> arr = new ArrayList<LinkedHashMap<String,Node>>();
		
		ViewMenu viewMenu = new ViewMenu();
		ViewCart viewCart = new ViewCart();
		AddToCart addToCart = new AddToCart();
		PlacedOrder placedOrder = new PlacedOrder();
		ViewHistory viewHistory = new ViewHistory();
		
		boolean flag = true;
		
		while(true) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		if(flag) {
			System.out.print(" 0 Go to home \n 1 View Menue \n 2 Add To Cart "
					+ "\n 3 View Cart \n 4 To Placed Order \n 5 View Your Order History \n 6 Exit");
			
			flag = false;
		}
		
		
		System.out.println();
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 0 : 
			
			System.out.print(" 0 Go to home \n 1 View Menue \n 2 Add To Cart "
					+ "\n 3 View Cart \n 4 To Placed Order \n 5 View Your Order History \n 6 Exit");
			
			break;
		
			
		case 1 :
			try {
				viewMenu.showMenu(node);
				System.out.print("Enter 2 to add in cart or Enter 0 to go on home");
				
			}
			catch(CustomException e) {
				System.out.println(e.getMessage());
			}
			finally {
				break;
			}
			
	
		case 2 :
			try {
				addToCart.addInCart(node,cartMap);
				System.out.print("Enter 3 to view cart or Enter 0 to go on home");
			}
			catch(CustomException e) {
				System.out.println(e.getMessage());
			}
			finally {
				break;
			}
			
			
		case 3 :
			try {
				viewCart.showCart(cartMap);
				System.out.print("Enter 4 to place order or Enter 0 to go on home");
			}
			catch(CustomException e) {
				System.out.println(e.getMessage());
			}
			finally {
				break;
			}
			
			
		case 4 :
			try {
				placedOrder.placedOrder(cartMap, arr);
				System.out.print("Enter 5 to view history or Enter 0 to go on home");
			}
			catch(CustomException e) {
				System.out.println(e.getMessage());
			}
			finally {
				break;
			}
			
			
		case 5 :
			try {
				viewHistory.showHistory(arr);
				System.out.print("Enter 0 to go on home");
			}
			catch(CustomException e) {
				System.out.println(e.getMessage());
			}
			finally {
				break;
			}
			

		case 6 : 
			System.out.print("Are You Want To Exit!! If YES Enter Y Other wise N :: ");
			String str = sc.next();
			if(str.equalsIgnoreCase("Y"))
				System.exit(0);
			break;
		
			
		default :
			System.out.println("Invalid Input! Please Enter Valid Input!!");
			break;
				
				
		}

	}
	}

}
