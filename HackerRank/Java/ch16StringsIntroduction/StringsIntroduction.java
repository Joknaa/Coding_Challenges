package ch16StringsIntroduction;
import java.util.Scanner;


public class StringsIntroduction {
	
	public static String CapitalizeInitials(String A) {
		// Getting the 1st character of the string .. 
        char[] A_CharArray = A.toCharArray();
        String A_Initial = A_CharArray[0] + "";
        String A_InitialUpperCase = A_Initial.toUpperCase();
        
        // constructing the string again with the upper case initial ..
        String A_New = A_InitialUpperCase;
        for (int i = 1; i < A_CharArray.length; i++) {
			A_New += A_CharArray[i];
		}
		
		return A_New;
	}
	
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        // Summing the lengths of A ad B ..
        int LengthA = A.length();
        int LengthB = B.length();
		int LengthSum = LengthA + LengthB;
        
        // Getting the Alphabetical order of A and B ..
        String ALargerThanB;
        if (A.compareTo(B) > 0) {
        	ALargerThanB = "Yes";
        } else { 
        	ALargerThanB = "No";
        }
        
        // Capitalize the initials of A and B ..
        String A_New = CapitalizeInitials(A);
        String B_New = CapitalizeInitials(B);

        // result ..
        System.out.println(LengthSum);
        System.out.println(ALargerThanB);
        System.out.println(A_New + " " + B_New);
    }
}
