package exercises2;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String userName;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("What's your name?");
        userName = input.next();

        System.out.println("Hello " + userName + ", how are you?");
    }
}
