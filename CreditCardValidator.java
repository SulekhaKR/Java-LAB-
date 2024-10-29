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
/*Class Variables:

ccNumber: Stores the credit card number entered by the user.
Constructor:

Initializes the ccNumber variable with the provided credit card number.
Method validateCard():

String Conversion and Length Check:
Converts ccNumber to a string (ccStr) to check its length.
If the length is not between 8 and 9 digits, it prints "Invalid credit card number" and exits.
Extracting Digits:
lastDigit: Extracts the last digit of the credit card number as the check digit.
remainingNumber: Removes the last digit from ccNumber.
Reversing Remaining Digits:
Converts remainingNumber to a string, reverses it, and stores it as reversedStr.
Calculating Sum Using Luhn's Double and Sum Method:
Iterates through each digit in reversedStr, doubling the value of every odd-positioned digit (from the right).
If doubling results in a two-digit number, it sums those digits.
Accumulates the sum of all processed digits.
Check Digit Calculation:
Calculates the check digit needed for the number to be valid by taking (10 - (sum % 10)) % 10.
Compares checkDigit with lastDigit to determine if the credit card number is valid, printing "Valid credit card number" if they match and "Invalid credit card number" otherwise.
Main Method:

Uses Scanner to take input from the user.
Creates a CreditCardValidator instance with the input number and calls validateCard() to verify its validity.*/
