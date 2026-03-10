package Jenkins_Java_CICD.Jenkins_Java_CICD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	void testaddition() {
		Calculator calc=new Calculator();
		int result=calc.add(6, 7);
		assertEquals(13, result);
	}

}
