package math;


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

}
