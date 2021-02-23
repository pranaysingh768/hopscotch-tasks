package in.hopscotch.solid.isp;

public class ISP {

	public static void main(String[] args) {

		IPayment iPayment = new Payment();
		Procurement offlineprocurement = new Procurement();
		offlineprocurement.savePayment(iPayment);
		
		System.out.println(">>>>>>>>>>>>>>");
		
		IOnlinePayment iOnlinePayment = new CreditCardPayment();
		Procurement onlineprocurement = new Procurement();
		onlineprocurement.savePayment(iOnlinePayment);
		onlineprocurement.saveCreditCard(iOnlinePayment);
		

	}

}
