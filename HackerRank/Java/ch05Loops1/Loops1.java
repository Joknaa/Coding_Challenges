package ch05Loops1;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = 0;
		
		N = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + N*i);
		}
		
		scanner.close();
		
	}

}
