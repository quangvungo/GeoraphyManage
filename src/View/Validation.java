package View;

import java.util.Scanner;

public class Validation {
    public static Scanner in = new Scanner(System.in);
    public  static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    public  static float checkInputFloatGreaterThanZero() {
        while (true) {
            try {
                String input = in.nextLine().trim();
                float result = Float.parseFloat(input);
                if (result > 0) {
                    return result;
                } else {
                    System.err.println("Value must be greater than 0. Please enter a valid float:");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid float:");
            }
        }
    }
}
