package exercises2;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Double radius = 0.0;
        Double area;
        Scanner input;

        while (radius <= 0) {
            System.out.println("Input circle radius:");
            input = new Scanner(System.in);
            if (input.hasNextDouble() == true) {
                radius = input.nextDouble();
            } else {
                System.out.println("Input a positive number");
            }
        }

        area = Math.pow(radius, 2) * Math.PI;

        System.out.println("Area is: " + area);
    }
}
