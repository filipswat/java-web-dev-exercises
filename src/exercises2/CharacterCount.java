package exercises2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CharacterCount {
    public static void main(String[] args) {
        //define long string

        /* String inputStr = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan " +
                "sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. " +
                "Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, " +
                "dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        */


        Path path = Paths.get("resources/count_chars_text.txt");
        StringBuilder stringIn = new StringBuilder();

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(newLine -> stringIn.append(newLine).append("/n"));
        } catch (IOException exception) {
            System.out.println("File not found");
            System.exit(1);
        }

        String inputStr = stringIn.toString();

        //convert to lowercase
        inputStr = inputStr.toLowerCase();

        //break string into array of characters
        char[] inputChars = inputStr.toCharArray();
        //define hashmap<char,count>
        HashMap<Character, Integer> charCounts = new HashMap<>();
        //for each character in chararray
            //if char in hashmap.keys
                //char.count++
            //else if char is alphabetic
                //add char as key
                //newchar.count = 1
        for (char i : inputChars) {
            if (charCounts.containsKey(i)) {
                charCounts.put(i, charCounts.get(i) + 1);
            }
            else if (i >= 'a' && i <= 'z') {
                charCounts.put(i, 1);
            }
        }
        //for each character in hashmap
            //print "char: count"
        for (Map.Entry<Character, Integer> aChar : charCounts.entrySet()) {
            System.out.println(aChar.getKey() + ": " +  aChar.getValue());
        }

    }
}
