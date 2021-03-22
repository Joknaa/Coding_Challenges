package ch20JavaBigInterger;

import java.math.BigInteger;
import java.util.Scanner;


public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number1 = sc.next();
        String number2 = sc.next();
        sc.close();

        BigInteger bigInteger1 = new BigInteger(number1);
        BigInteger bigInteger2 = new BigInteger(number2);
         
        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));

    }
}

