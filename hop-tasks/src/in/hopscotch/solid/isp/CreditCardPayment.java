package in.hopscotch.solid.isp;

public class CreditCardPayment implements IOnlinePayment {

	@Override
	public void savePaymentDetails() {

		System.out.println("Save online payment detail in DB");

	}

	@Override
	public void saveCreditCardDetails() {

		System.out.println("Save online payment Card Details in DB");

	}

}
