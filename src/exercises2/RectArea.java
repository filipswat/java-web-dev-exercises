package exercises2;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        //to modify for validation, need equivalent of 'try' or iferror

        Float length;
        Float width;
        Float area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Input length:");
        length = input.nextFloat();
        System.out.println("Input width:");
        width = input.nextFloat();

        area = length * width;

        System.out.println("Area is: " + area);
    }
}
