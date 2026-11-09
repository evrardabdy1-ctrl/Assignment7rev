package Testlive;

import java.util.Scanner;

public class Triangletype {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       System.out.println("Enter the side A:");
       int A = input.nextInt();
       System.out.println("Enter the side B:");
       int B = input.nextInt();
       System.out.println("Enter the side C:");
       int C = input.nextInt();

       if (A <= 0 || B <= 0 || C <= 0 || (A + B <= C) || (A + C <= B) || (B + C <= A)) {
           System.out.println("Invalid triangle .");
       } else if (A == B && B == C) {
           System.out.println("The triangle is equilateral.");
       } else if (A == B || A == C || B == C) {
           System.out.println("The triangle is isosceles.");
       } else {
           System.out.println("The triangle is scalene.");
       }

    }
}
