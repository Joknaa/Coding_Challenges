package ch13SubstringComparisons;
import java.util.Scanner;

public class SubstringComparisons {
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int wordLength = s.length();
        int subStringsNumber = wordLength -k ;
        String[] Substrings = new String[subStringsNumber +1];
        
        // Getting all the possible Substrings .. 
        for (int i = 0; i <= subStringsNumber ; i++) {
        	int start = i;
        	int end = i+k;
			Substrings[i] = s.substring(start, end);
		}
        
        // Setting the largest and smallest variables ..
        for (int i=0 ; i<k ; i++) {
			smallest = smallest.concat("z");
			largest = largest.concat("A");
		}
        
        // searching for the smallest and largest of the strings alphabetically ..		
		for (int i=0 ; i<=subStringsNumber ; i++) {
			boolean isLarger = (Substrings[i].compareTo(largest) >= 0);
			boolean isSmaller = (Substrings[i].compareTo(smallest) <= 0);
			
			if (isLarger) {
				largest = Substrings[i];
			}
			if (isSmaller) {
				smallest = Substrings[i];
			}
		}
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}