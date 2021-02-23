package in.hopscotch.solid.isp;

public class Procurement {
	
	public void savePayment(IPayment iPayment) {
		
		iPayment.savePaymentDetails();
	}
	
	public void saveCreditCard(IOnlinePayment iOnlinePayment) {
		
		iOnlinePayment.saveCreditCardDetails();
	}
}
