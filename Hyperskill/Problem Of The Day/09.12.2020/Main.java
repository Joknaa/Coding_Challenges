import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Squirrels = scanner.nextInt();
        int Nuts = scanner.nextInt(); 
        int result = (Nuts - (Nuts % Squirrels)) / Squirrels;
        
        System.out.println(result);
        scanner.close();
    }
}