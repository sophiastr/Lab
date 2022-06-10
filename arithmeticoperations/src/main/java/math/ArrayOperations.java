package math;

import java.util.ArrayList;
import java.util.List;
import io.FileIO;

/**
 * ArrayOperations has a method which return all the prime numbers from an array.
 * 
 * @author sophiastr
 * @since 2022-05-26
 */
public class ArrayOperations {
	
	/**
	 * Iterates an array of numbers, and returns a new array that contains only its prime numbers.
	 * 
	 * @param an object FileIO
	 * @param a string with the filepath.
	 * @param an object MyMath
	 * @return a new array that contains only its prime numbers
	 */
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] numbers = fileIo.readFile(filepath);
		List<Integer> prime = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			if (myMath.isPrime(numbers[i])) {
				prime.add(numbers[i]);
			}
		}
		return prime.stream().mapToInt(i -> i).toArray();
	}
}
