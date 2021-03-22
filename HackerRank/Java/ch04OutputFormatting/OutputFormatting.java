package ch04OutputFormatting;
import java.util.Scanner;

public class OutputFormatting {
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] s = {null,null,null};
        int[] x = {0,0,0};
        

        System.out.println("================================");
        for (int i = 0; i < 3 ; i++){
            s[i] = scanner.next();
            x[i] = scanner.nextInt();
            System.out.printf("%-15s", s[i]);
            System.out.printf("%03d %n", x[i]);
        }
        System.out.println("================================");
    	scanner.close();

    }
}