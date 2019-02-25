/**
 * Testing
 * Here we'll write tests to check a "compare" compare method.
 * We first write the tests, then identify problems, then finally fix the method
 */

/**
 * @author T.J.
 *
 */
public class Testing {
	public static void main(String[] args) {
		// Let's do some testing
		// We have a compare method down below and we're going to test it out
		// Hover over the method name to see the javadoc
		compare(0, 0);
		
		// Starting it out basic
		int actual = compare(0, 1);
		System.out.println("compare(0, 1) should be -1, actual: " + actual);
		
		actual = compare(0, 0);
		System.out.println("compare(0, 0) should be  0, actual:  " + actual);
		
		actual = compare(1, 0);
		System.out.println("compare(1, 0) should be  1, actual:  " + actual);
		System.out.println();
		
		
		// Ok, so that seems to work
		// Let's test some other cases
//		actual = compare(-50, -25);
//		System.out.println("compare(-50, -25) should be -1, actual: " + actual);
//		
//		actual = compare(20, 20);
//		System.out.println("compare(20, 20)   should be  0, actual: " + actual);
//		
//		actual = compare(5000, 1);
//		System.out.println("compare(5000, 1)  should be  1, actual: " + actual);
//		System.out.println();
		
		
		// So we found one that doesn't work
		// Before we try to fix it, let's go extreme
//		actual = compare(Integer.MIN_VALUE, Integer.MAX_VALUE);
//		System.out.println("compare(MIN, MAX) should be -1, actual: " + actual);
//		
//		actual = compare(Integer.MAX_VALUE, Integer.MAX_VALUE);
//		System.out.println("compare(MAX, MAX) should be  0, actual: " + actual);
//		
//		actual = compare(Integer.MAX_VALUE, Integer.MIN_VALUE);
//		System.out.println("compare(MAX, MIN) should be  1, actual: " + actual);
		
	}










	// Don't look! We should be able to test our method without looking at the code!!
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	/**
	 * Compares the two inputs
	 * @param num1 the first number to compare
	 * @param num2 the second number to compare
	 * @return -1 if num1 is less than num2,
	 * 		   0 if num1 is equal to num2,
	 * 		   1 if num1 is greater than num2
	 **/
	public static int compare(int num1, int num2) {
		if (num1 - num2 < 0) {
			return -1;
		}
		if (num1 == 0) {
			return 0;
		}
		if (num2 <= num1) {
			return 1;
		}

		// This shouldn't happen if the above is correct
		return -3;
	}
}
