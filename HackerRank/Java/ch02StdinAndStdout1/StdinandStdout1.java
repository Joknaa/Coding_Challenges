package ch02StdinAndStdout1;

import java.util.Scanner;

public class StdinandStdout1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			int a = scanner.nextInt();
			int b  = scanner.nextInt();
			int c = scanner.nextInt();
			
			System.out.println(a + "\n" + b + "\n" + c);
			
			scanner.close();
	}

}
