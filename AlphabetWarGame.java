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
