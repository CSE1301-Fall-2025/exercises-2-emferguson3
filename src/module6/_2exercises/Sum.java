package module6._2exercises;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you want to sum?");
		int sum = input.nextInt();
		System.out.println(calculateSum(sum));
		input.close();
	}
	public static int calculateSum(int n){
		if (n == 0){
			return 0;
		} else {
			return calculateSum(n-1)+n;
		}
	}
}
