package math;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import io.FileIO;

public class ArrayOperationsTest {

	ArrayOperations ao = new ArrayOperations();
	FileIO fileio = new FileIO();
	@Test
	public void test_prime_array_Mocking() {
		MyMath m = mock(MyMath.class);
		when(m.isPrime(2)).thenReturn(true);
		when(m.isPrime(3)).thenReturn(true);
		when(m.isPrime(4)).thenReturn(false);
		when(m.isPrime(5)).thenReturn(true);
		when(m.isPrime(6)).thenReturn(false);

		int[] testvalues = {2, 3, 4, 5, 6};
		
		Assert.assertArrayEquals(new int[] {2, 3, 5}, ao.findPrimesInFile(fileio, "src/test/resources/primenumbers", m));
	}

}
