package operacionesApp;

public class Division extends Operations {

	public Division(int dividend, int divider) {
		this.term1 = dividend;
		this.term2 = divider;
	}

	@Override
	public int calculate() {
		return this.term1 / this.term2;
	}

}
