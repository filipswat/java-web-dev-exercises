package exercises2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args) {
        HashMap<String, String> studentIDs = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Input student names or hit enter to finish");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.println("Enter ID:");
                String newID = input.next();
                studentIDs.put(newID,newStudent);
            }

            input.nextLine();

        } while (!newStudent.equals(""));

        for (Map.Entry<String, String> id : studentIDs.entrySet()) {
            System.out.println(id.getValue() + " has an ID of: " + id.getKey());
        }
    }
}
