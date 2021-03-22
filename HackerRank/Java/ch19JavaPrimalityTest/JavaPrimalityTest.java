package ch19JavaPrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        BigInteger myBigInteger = new BigInteger(n);
        boolean result = myBigInteger.isProbablePrime(1);
       
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}