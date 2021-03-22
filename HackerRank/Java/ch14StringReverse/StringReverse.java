package ch14StringReverse;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        
    	// Getting the Input String ..
        Scanner sc = new Scanner(System.in);
        String InitialString = sc.next();
        sc.close();
        String ReversedString = "";
        
        // Reversing the input string ..
        int Start = InitialString.length()-1;
        for (int i=Start ; i>=0 ; i--) {
        	ReversedString = ReversedString + InitialString.charAt(i);
		}
        
        // testing the input string ..
        int test = InitialString.compareTo(ReversedString);
        if (test == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
    }
}