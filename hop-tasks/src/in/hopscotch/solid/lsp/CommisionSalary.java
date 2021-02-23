package in.hopscotch.solid.lsp;

public class CommisionSalary implements IPayClassification {

	@Override
	public float calculateSalary() {

		System.out.println("Calculate salary for commision");
		return 0;
	}

}
