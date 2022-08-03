package HelloworldExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {
	
		Calculation cal = new Calculation();
	
	
	@Test
	void Addtest() {
	int actual =	cal.addition(30, 10);
	int expected =  40;
	assertEquals(actual, expected);
	}
	@Test
	void Subtest() {
	int actual =	cal.subtraction(30, 10);
	int expected =  20;
	assertEquals(actual, expected);
	}
	@Test
	void Multest() {
	int actual =	cal.multiplication(30, 10);
	int expected =  300;
	assertEquals(actual, expected);
	}
	@Test
	void Divtest() {
	int actual =	(int) cal.division(30, 10);
	int expected = 3;
	assertEquals(actual, expected);
	}

}
