package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ArithmeticOperationsTest {
	
	ArithmeticOperations ar = new ArithmeticOperations();
	@Test
	public void test_divide_3dividedby2() {
		Assert.assertEquals(1.5 , ar.divide(3, 2), 0.001);
	}
	
	@Test
	public void test_divide_3dividedby3() {
		Assert.assertEquals(1. , ar.divide(3, 3), 0.001);
	}
	
	@Test (expected = ArithmeticException.class)
	public void test_divide_3dividedby0_exception() {
		ar.divide(3, 0);
	}
	
	@Test
	public void test_multiply_multiplied2by4() {
		Assert.assertEquals(8, ar.multiply(2, 4));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_multiply_negative_number() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("x & y should be >= 0");
		 ar.multiply(-1, 2);
	}
	
	@Test
	public void test_multiply_negative_numbers() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("x & y should be >= 0");
		 ar.multiply(-1, -2);
	}
	
	@Test
	public void test_multiply_not_integer() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("The product does not fit in an Integer variable");
		 ar.multiply((Integer.MAX_VALUE/2) + 1,  Integer.MAX_VALUE/2);
	}

	
}
