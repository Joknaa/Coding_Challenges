package ch15Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	
    static boolean isAnagram(String a, String b) {
    	boolean result = false;
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    	char[] charA = a.toCharArray();
    	char[] charB = b.toCharArray();
    	
    	Arrays.sort(charA);
    	Arrays.sort(charB);
    	String stringA = new String(charA);
    	String stringB = new String(charB);
    	
    	if (stringA.equals(stringB)) { result = true; }
    	
		return result;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}