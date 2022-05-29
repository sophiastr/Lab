package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class MyMathTest {

	MyMath m = new MyMath();

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test_factorial_negative_number() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Negative number");
		m.factorial(-1);
	}

	@Test
	public void test_factorial_big_number() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Big number");
		m.factorial(13);
	}
	
	@Test
	public void test_prime_number2() {
		Assert.assertEquals(true, m.isPrime(2));
	}
	
	@Test
	public void test_prime_number4() {
		Assert.assertEquals(false, m.isPrime(4));
	}
	
	@Test
	public void test_prime_zero() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Zero Or One");
		m.isPrime(0);
	}
	
	@Test
	public void test_prime_one() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Zero Or One");
		m.isPrime(1);
	}
	
	
}
