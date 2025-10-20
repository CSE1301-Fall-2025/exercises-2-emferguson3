package module6._1recursion;

/*
 * Exercise: Use the debugger to examine how this recursive method works.
 * Add examples for the factorial of 4 and the factorial of 1.
 */
public class E01FactorialTest {

	public static int factorial(int n) {
		if(n == 0) { // base case
			return 1;
		} else { //recursive call
			return n * factorial(n - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
}
