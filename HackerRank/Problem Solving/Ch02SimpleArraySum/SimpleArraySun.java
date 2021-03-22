package Ch02SimpleArraySum;

import java.util.Scanner;

public class SimpleArraySun {

    static int ArraySum(int[] ar) {
    	int sum = 0;
    	for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
    	return sum;
    }


    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        
        for (int i = 0; i < arrayLength; i++) {
        	int a = scanner.nextInt();
        	array[i] = a;
        }
        System.out.println(ArraySum(array));
        scanner.close();
    }
}
