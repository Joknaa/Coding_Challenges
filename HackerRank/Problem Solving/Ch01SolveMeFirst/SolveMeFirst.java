package Ch01SolveMeFirst;

import java.util.Scanner;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
    		return a + b;
	}

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;   
        int b; 
        int sum;
        a = in.nextInt();
        b = in.nextInt();
        in.close();	
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}
