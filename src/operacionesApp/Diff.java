package operacionesApp;

public class Diff extends Operations {

	public Diff(int minuend, int subtracting) {
		this.term1 = minuend;
		this.term2 = subtracting;

	}

	@Override
	public int calculate() {
		return this.term1 - this.term2;
	}

}
