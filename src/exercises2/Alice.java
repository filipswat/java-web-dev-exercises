package exercises2;

import java.util.ArrayList;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String searchText = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        searchText = searchText.toLowerCase();
        Integer position = 0;
        Integer lastPosition = 0;

        ArrayList<Integer> positions = new ArrayList<Integer>();

        //text to find is manually input
        Scanner input = new Scanner(System.in);
        System.out.println("Input text to find:");
        String inputStr = input.next().toLowerCase();

        do {
            //track current position of found text and previous position
            lastPosition = position + lastPosition + 1;
            position = searchText.indexOf(inputStr);
            //add position to list, adding last position to track relative to start of string
            if (position >= 0) {
                positions.add(position + lastPosition - 1);
            }
            searchText = searchText.substring(position + 1, searchText.length() - 1);
        }
        while (position >= 0);

        //print all positions
        if (positions.size() <= 0) {
            System.out.println("No match found");
        }
        else {
            for (Integer i : positions) {
                System.out.println(i);
            }
        }
    }
}