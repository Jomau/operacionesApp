package operacionesApp;

public class Sum extends Operations {
	
	public Sum(int term1, int term2) {
		this.term1 = term1;
		this.term2 = term2;
	}

	@Override
	public int calculate() {
		return this.term1 + this.term2;
	}

}
