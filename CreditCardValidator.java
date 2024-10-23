import java.util.Scanner;

public class CreditCardValidator {
    private long creditCardNumber;

    // Constructor
    public CreditCardValidator(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    // Method to validate the credit card number
    public void validateCreditCard() {
        String creditCardStr = String.valueOf(creditCardNumber);
        
        // Check if the length is valid
        if (creditCardStr.length() < 8 || creditCardStr.length() > 9) {
            System.out.println("Invalid credit card number");
            return;
        }

        long lastDigit = creditCardNumber % 10;
        long remainingDigits = creditCardNumber / 10;

        StringBuilder reversedDigits = new StringBuilder(String.valueOf(remainingDigits)).reverse();
        String reversedStr = reversedDigits.toString();

        int totalSum = 0;

        // Double digits at odd positions and sum them up
        for (int i = 0; i < reversedStr.length(); i++) {
            int currentDigit = Character.getNumericValue(reversedStr.charAt(i));
            if (i % 2 == 0) {  // Odd-indexed positions
                currentDigit *= 2;
                if (currentDigit > 9) {
                    currentDigit = currentDigit / 10 + currentDigit % 10;  // Sum the digits if double digit
                }
            }
            totalSum += currentDigit;
        }

        long checkDigit = (10 - (totalSum % 10)) % 10;

        if (checkDigit == lastDigit) {
            System.out.println("Valid credit card number");
        } else {
            System.out.println("Invalid credit card number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter credit card number:");
        long creditCardNumber = scanner.nextLong();

        CreditCardValidator validator = new CreditCardValidator(creditCardNumber);
        validator.validateCreditCard();
    }
}
