package module5._3return;

import java.util.Random;

public class E04RandomNumberInRange {
	// add your method here
	public static int randomNumberInRange(int min, int max) {
		// check that min <= max to avoid errors
		if (min > max) {
			throw new IllegalArgumentException("min must be less than or equal to max");
		}

		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min; // inclusive range
	}

	public static void main(String[] args) {
		// test your method by calling it
		System.out.println(randomNumberInRange(1, 10));
		System.out.println(randomNumberInRange(5, 5));
		System.out.println(randomNumberInRange(-3, 3));
	}
}