import java.util.Scanner;

public class test {


    public static int fun(){
        int number            = 10;
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner       = new Scanner(System.in);
        String InputString    = "";
        int[] InputNumber = {0, 0};
        boolean ValidInput    = false;

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {   
            System.out.print("| ");

            for (int j = 3 * i; j < 3 * i + 3; j++) {
                System.out.print("X ");
                //System.out.print(StringCells.charAt(j) + " ");
            }

            System.out.print("|\n");
        }
        System.out.println("---------");
    }
}
