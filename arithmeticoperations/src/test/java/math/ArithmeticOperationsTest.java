package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ArithmeticOperationsTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	ArithmeticOperations ar = new ArithmeticOperations();
	@Test
	public void test_divide_3dividedby2() {
		Assert.assertEquals(1.5 , ar.divide(3, 2), 0.001);
	}
	
	@Test
	public void test_divide_0dividedby2() {
		Assert.assertEquals(0 , ar.divide(0, 2), 0.001);
	}
	
	@Test
	public void test_divide_1dividedby8() {
		Assert.assertEquals(0.125 , ar.divide(1, 8), 0.001);
	}
	
	@Test
	public void test_divide_10dividedbynegative() {
		Assert.assertEquals(-1 , ar.divide(10, -10), 0.001);
	}
	
	@Test
	public void test_divide_10dividedby3() {
		Assert.assertEquals(3.333 , ar.divide(10, 3), 0.001);
	}
	
	@Test
	public void test_divide_negativedividedby3() {
		Assert.assertEquals(0 , ar.divide(-0, 3), 0.001);
	}
	

	@Test
	public void test_divide_two_negatives() {
		Assert.assertEquals(9 , ar.divide(-27, -3), 0.001);
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
	public void test_multiply_divide_zero() {
		 thrown.expect(ArithmeticException.class);
		 thrown.expectMessage("Cannot divide with zero");
		 ar.divide(3, 0);
	}
	
	@Test
	public void test_multiply_multiplied2by4() {
		Assert.assertEquals(8, ar.multiply(2, 4));
	}
	
	@Test
	public void test_multiply_multiplied1by1() {
		Assert.assertEquals(1, ar.multiply(1, 1));
	}
	
	
	
	@Test
	public void test_multiply_negative_number() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("x & y should be >= 0");
		 ar.multiply(-1, 2);
	}
	
	@Test
	public void test_multiply_negative() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("x & y should be >= 0");
		 ar.multiply(1, -2);
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
	
	@Test
	public void test_multiply_not_integer_example2() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("The product does not fit in an Integer variable");
		 ar.multiply((Integer.MAX_VALUE/5) + 1,  Integer.MAX_VALUE/5);
	}
	
	@Test
	public void test_multiply_not_integer_example3() {
		 thrown.expect(IllegalArgumentException.class);
		 thrown.expectMessage("The product does not fit in an Integer variable");
		 ar.multiply(Integer.MAX_VALUE/5,  10);
	}

	
}

