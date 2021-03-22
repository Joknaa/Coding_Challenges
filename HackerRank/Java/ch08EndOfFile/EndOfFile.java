package ch08EndOfFile;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 1;
		String s;
		
		while (sc.hasNext()) {
			s = sc.nextLine();
			System.out.println(n + " " + s);
			n++;
		}
		sc.close();
	}
}
