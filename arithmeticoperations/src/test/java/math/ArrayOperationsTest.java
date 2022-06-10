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

		String filepath = "src/test/resources/primenumbers";
		FileIO fio = mock(FileIO.class);
		 when(fio.readFile(filepath)).thenReturn(new int[]
			      {-10, -2, -1, 0, 1, 2, 3, 4, 5, 6});
		
		MyMath m = mock(MyMath.class);
		
		when(m.isPrime(2)).thenReturn(true);
		when(m.isPrime(3)).thenReturn(true);
		when(m.isPrime(4)).thenReturn(false);
		when(m.isPrime(5)).thenReturn(true);
		when(m.isPrime(6)).thenReturn(false);
		
		
		Assert.assertArrayEquals(new int[] {2, 3, 5}, ao.findPrimesInFile(fileio, filepath, m));
	}

}
