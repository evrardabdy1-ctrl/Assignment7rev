package Testlive;

import java.util.Scanner;

public class Alphabet {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number N:");
        int N= input.nextInt();

        char letter = 'A' ;
        for(int i=1;i<=N;i++ ) {
            System.out.print(letter+"");
            letter++;
        }
    }
}