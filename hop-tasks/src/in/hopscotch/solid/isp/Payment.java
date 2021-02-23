package in.hopscotch.solid.isp;

public class Payment implements IPayment {

	@Override
	public void savePaymentDetails() {

		System.out.println("Save offline payment detail in DB");

	}

}
