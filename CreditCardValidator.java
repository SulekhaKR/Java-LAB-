import java.util.Scanner;

public class CreditCardValidator {
    private long ccNumber;

    // Constructor
    public CreditCardValidator(long ccNumber) {
        this.ccNumber = ccNumber;
    }

    // Method to validate the credit card number
    public void validateCard() {
        String ccStr = String.valueOf(ccNumber);
        
        // Check if the length is valid
        if (ccStr.length() < 8 || ccStr.length() > 9) {
            System.out.println("Invalid credit card number");
            return;
        }

        long lastDigit = ccNumber % 10;
        long remainingNumber = ccNumber / 10;

        StringBuilder reversed = new StringBuilder(String.valueOf(remainingNumber)).reverse();
        String reversedStr = reversed.toString();

        int sum = 0;

        // Double odd-positioned digits and add up all digits
        for (int i = 0; i < reversedStr.length(); i++) {
            int digit = Character.getNumericValue(reversedStr.charAt(i));
            if (i % 2 == 0) {  // odd-indexed positions
                digit *= 2;
                if (digit > 9) {
                    digit = digit / 10 + digit % 10;  // Sum the digits if double digit
                }
            }
            sum += digit;
        }

        long checkDigit = (10 - (sum % 10)) % 10;

        if (checkDigit == lastDigit) {
            System.out.println("Valid credit card number");
        } else {
            System.out.println("Invalid credit card number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number:");
        long ccNumber = sc.nextLong();

        CreditCardValidator validator = new CreditCardValidator(ccNumber);
        validator.validateCard();
    }
}
