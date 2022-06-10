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
	public void test_factorial_zero() {
		Assert.assertEquals(1, m.factorial(0));
	}
	
	@Test
	public void test_factorial_1() {
		Assert.assertEquals(1, m.factorial(1));
	}
	
	@Test
	public void test_factorial_2() {
		Assert.assertEquals(2, m.factorial(2));
	}
	
	@Test
	public void test_factorial_4() {
		Assert.assertEquals(24, m.factorial(4));
	}
	
	@Test
	public void test_factorial_12() {
		Assert.assertEquals(479001600, m.factorial(12));
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
	public void test_prime_number6() {
		Assert.assertEquals(false, m.isPrime(6));
	}
	
	@Test
	public void test_prime_number3() {
		Assert.assertEquals(true, m.isPrime(3));
	}
	
	@Test
	public void test_prime_number7() {
		Assert.assertEquals(true, m.isPrime(7));
	}
	
	@Test
	public void test_prime_number8() {
		Assert.assertEquals(false, m.isPrime(8));
	}
	
	@Test
	public void test_prime_zero() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Zero Or One");
		m.isPrime(0);
	}
	
	@Test
	public void test_prime_negative() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Negative");
		m.isPrime(-1);
	}
	
	
	@Test
	public void test_prime_one() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Zero Or One");
		m.isPrime(1);
	}
	
	
}
