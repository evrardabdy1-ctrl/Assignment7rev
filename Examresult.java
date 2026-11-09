package Testlive;

import java.util.Scanner;

public class Examresult {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter a score :") ;
        int score = input.nextInt();

    if ( score>= 80) {
        System.out.println("Passed");

    } else{
        System.out.println ("Failled");
    }


}
    

} 