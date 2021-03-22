package ch01ifElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[]  args) {
		
		Scanner scanner = new Scanner(System.in);
		int N;
		
		
		System.out.println("Enter a number: ");
		N = scanner.nextInt();
		
		if (N % 2 == 1) {
			System.out.println("Weird");
		} else {
			if (2<=N & N<=5) {
				System.out.println("Not Weird");
			} else if (6<=N & N<=20) {
				System.out.println("Weird");
			} else if (N>20) {
				System.out.println("Not Weird");
			}
		}
		scanner.close();
	}
}
