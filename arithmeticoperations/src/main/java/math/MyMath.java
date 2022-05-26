package math;

/**
* MyMath calculates and returns the factorial of a given number.
* @author  sophiastr
* @since   2022-05-26 
*/
public class MyMath {
	
	/**
	 * Calculates and returns the factorial of a given number.
	 * @param a given number
	 * @return the factorial of a given number
	 * @exception IllegalArgumentException when the number is to big
	 * @exception IllegalArgumentException when the number is negative
	 */
	 public int factorial (int n) {
		 if ( n < 0) {
			 throw new IllegalArgumentException("Negative number");
		 }
		 if ( n > 12) {
			 throw new IllegalArgumentException("Big number");
		 }
		 if (n == 0) {    
			 return 1;
		 } 
		 return(n * factorial(n-1));
	 }
}
