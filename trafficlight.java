package Testlive;

import java.util.Scanner;

public class trafficlight {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the traffic light color:");
        String color = input.nextLine();
        System.out.print("Is a pedestrian crossing? (true/false): ");
        boolean isPedestrianCrossing = input.nextBoolean();

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("slow down");
                break;
            case "green":
                if (isPedestrianCrossing) {
                    System.out.println("wait");
                } else {
                    System.out.println("Go");
                    break;
                }
                
            default:
                System.out.println("Invalid color");
        }
    }
}
