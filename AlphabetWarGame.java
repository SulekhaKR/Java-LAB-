public class AlphabetWarGame {

    private int leftSideStrength, rightSideStrength;

    // Constructor with default strengths
    public AlphabetWarGame() {
        this.leftSideStrength = 0;
        this.rightSideStrength = 0;
    }

    // Overloaded constructor with custom strengths
    public AlphabetWarGame(int leftStrength, int rightStrength) {
        this.leftSideStrength = leftStrength;
        this.rightSideStrength = rightStrength;
    }

    // Method to compute strength based on input word
    public String determineWinner(String word) {
        int leftScore = 0, rightScore = 0;

        for (char letter : word.toCharArray()) {
            switch (letter) {
                case 'w': leftScore += 4; break;
                case 'p': leftScore += 3; break;
                case 'b': leftScore += 2; break;
                case 's': leftScore += 1; break;
                case 'm': rightScore += 4; break;
                case 'q': rightScore += 3; break;
                case 'd': rightScore += 2; break;
                case 'z': rightScore += 1; break;
            }
        }

        if (leftScore > rightScore) return "Left side wins!";
        if (rightScore > leftScore) return "Right side wins!";
        return "Let's fight again!";
    }

    public static void main(String[] args) {
        AlphabetWarGame game = new AlphabetWarGame();
        System.out.println(game.determineWinner("zdqmwpbs"));  // Let's fight again!
        System.out.println(game.determineWinner("wwwwwwz"));   // Left side wins!
        System.out.println(game.determineWinner("z"));         // Right side wins!
    }
}
/*Class Variables:

/leftSideStrength and rightSideStrength: Represent the total strength of the left and right sides, respectively. These are initialized to zero by default.
Constructors:

Default Constructor: Initializes both leftSideStrength and rightSideStrength to zero.
Overloaded Constructor: Allows custom strengths for the left and right sides.
Method determineWinner(String word):

Calculates the total strength of letters associated with the left and right sides.
leftScore and rightScore are incremented based on the letters found in the input word:
Left Side Letters: 'w' (4 points), 'p' (3 points), 'b' (2 points), 's' (1 point).
Right Side Letters: 'm' (4 points), 'q' (3 points), 'd' (2 points), 'z' (1 point).
After iterating through each character, it compares the scores:
If leftScore > rightScore, the method returns "Left side wins!".
If rightScore > leftScore, it returns "Right side wins!".
If the scores are equal, it returns "Let's fight again!".
main Method:

Creates an instance of AlphabetWarGame and tests the determineWinner method with sample words:
"zdqmwpbs" results in "Let's fight again!".
"wwwwwwz" results in "Left side wins!".
"z" results in "Right side wins!" */
