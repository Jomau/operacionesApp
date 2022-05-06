package operacionesApp;

public class Multiplication extends Operations {

	public Multiplication(int factor1, int factor2) {
		this.term1 = factor1;
		this.term2 = factor2;
	}

	@Override
	public int calculate() {
		return this.term1 * this.term2;
	}

}
