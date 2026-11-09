package Testlive;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

        input.close();
    }
}
