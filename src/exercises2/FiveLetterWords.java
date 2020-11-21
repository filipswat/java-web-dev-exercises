package exercises2;

public class FiveLetterWords {
    public static void main(String[] args) {
        String[] strArray = {"words", "sdf", "happy", "dumb"};
        for (String i : strArray) {
            if (i.length() == 5) {
                System.out.println(i);
            }
        }
    }
}
