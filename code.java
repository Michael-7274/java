import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        String number = sc.nextLine();

        boolean isValid = isValidNumber(number);
        if (isValid) {
            System.out.println(number + " is a valid number.");
        } else {
            System.out.println(number + " is an invalid number.");
        }
    }

    public static boolean isValidNumber(String number) {
        int decimalCount = 0;
        boolean hasNumbersAfterDecimal = false;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            
            if (c == '.') {
                decimalCount++;
                
                // Check if there are multiple decimal points
                if (decimalCount > 1) {
                    return false;
                }
            } else if (Character.isDigit(c) && decimalCount == 1) {
                hasNumbersAfterDecimal = true;
            } else if (!Character.isDigit(c)) {
                return false; // Invalid character found
            }
        }

        return decimalCount <= 1 && hasNumbersAfterDecimal;
    }
}
