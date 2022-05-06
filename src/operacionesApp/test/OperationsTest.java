package operacionesApp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import operacionesApp.Diff;
import operacionesApp.Operations;
import operacionesApp.Sum;

class OperationsTest {
	
	private Operations operation;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void sumTest() {
		this.operation = new Sum(2,2);
		int valueCalculate = this.operation.calculate();
		assertEquals(4, valueCalculate);
	}
	
	@Test 
	void diffTest(){
		this.operation = new Diff(5,2);
		int valueCalculate = this.operation.calculate();
		assertEquals(3, valueCalculate);
	}
	
	

}
