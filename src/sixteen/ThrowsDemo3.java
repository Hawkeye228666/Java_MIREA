package sixteen;

import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validInput = false;
        do {
            try {
                System.out.print("Enter a non-empty string: ");
                String key = myScanner.next();
                printDetails(key);
                validInput = true;
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        } while (!validInput);
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "data for " + key;
    }
}