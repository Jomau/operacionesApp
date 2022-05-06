package operacionesApp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import operacionesApp.Diff;
import operacionesApp.Sum;

class OperationsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void sumTest() {
		Sum s = new Sum();
		int valueCalculate = s.calculate(2,2);
		assertEquals(4, valueCalculate);
	}
	
	@Test 
	void diffTest(){
		Diff d = new Diff();
		int valueCalculate = d.calculate(5,2);
		assertEquals(3, valueCalculate);
	}
	
	

}
