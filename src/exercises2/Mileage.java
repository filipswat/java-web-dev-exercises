package exercises2;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Double miles = 0.0;
        Double gallons = 0.0;
        Double mpg;
        Scanner input;

        input = new Scanner(System.in);

        while (miles <= 0) {
            System.out.println("Input miles driven:");
            input = new Scanner(System.in);
            if (input.hasNextDouble() == true) {
                miles = input.nextDouble();
            }
            else {
                System.out.println("Input a positive number");
            }
        }

        while (gallons <= 0) {
            System.out.println("Input gallons used:");
            input = new Scanner(System.in);
            if (input.hasNextDouble() == true) {
                gallons = input.nextDouble();
            }
            else {
                System.out.println("Input a positive number");
            }
        }

        mpg = miles / gallons;

        System.out.println("You achieved " + mpg + " miles per gallon");
    }
}
