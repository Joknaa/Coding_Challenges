import java.util.Scanner;

public class Day {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String strings[] = new String[n];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j = j + 2) {
                System.out.print(strings[i].charAt(j));
            }
            System.out.print(" ");
            for (int j = 1; j < strings[i].length(); j = j + 2) {
                System.out.print(strings[i].charAt(j));
            }
            System.out.println();
        }
        scanner.close();
    }
}