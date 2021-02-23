package in.hopscotch.solid.lsp;

public class LSP {

	public static void main(String[] args) {

		ITimeCard iTimeCard = new HourlySalary();
		iTimeCard.addTimeCardDetails();
		
		IPayClassification iPayClassification = new CommisionSalary();
		iPayClassification.calculateSalary();

	}

}
