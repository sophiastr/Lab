package math;

/**
 * MyMath calculates and returns the factorial of a given number and returns if a number is prime.
 * 
 * @author sophiastr
 * @since 2022-05-26
 */
public class MyMath {

	/**
	 * Calculates and returns the factorial of a given number.
	 * 
	 * @param a given number
	 * @return the factorial of a given number
	 * @exception IllegalArgumentException when the number is to big
	 * @exception IllegalArgumentException when the number is negative
	 */
	public int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Negative number");
		}
		if (n > 12) {
			throw new IllegalArgumentException("Big number");
		}
		if (n == 0) {
			return 1;
		}
		return (n * factorial(n - 1));
	}
	
	/**
	 * Returns if the given number is prime.
	 * 
	 * @param a given number
	 * @return true if the number is prime, false in other case
	 * @exception IllegalArgumentException when the number is 0 or 1
	 */
	public boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			throw new IllegalArgumentException("Zero Or One");
		} else if (n < 0) {
			throw new IllegalArgumentException("Negative");
		} else if (n == 2) {
			return true;
		} else {
			int i, m = 0, flag = 0;
			m = n / 2;
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				return true;
			} else {
				return false;
			}
		}

	}
}
