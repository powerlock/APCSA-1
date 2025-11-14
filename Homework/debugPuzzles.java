// debug the following code, use your brain and paper. If you couldn't find the errors, use your IDE.

public class SimplePuzzle {
    public static void main(String[] args) {
        String keyword = "secret";
        String guess = "secret";

        int number = 10;
        int check = 3;

        boolean isCorrectGuess;
        boolean hasSubstring;
        boolean isDivisible;

        // Puzzle 1: Compare the strings (use equals)
        isCorrectGuess = guess.equals(keyword);

        // Puzzle 2: Find the substring (indexOf can be 0)
        int firstIndex = keyword.indexOf("cre");
        hasSubstring = (firstIndex >= 0);

        // Puzzle 3: Check divisibility (use modulus %)
        isDivisible = (number % check == 0);

        // The final result
        if (isCorrectGuess && hasSubstring && isDivisible) {
            System.out.println("The puzzle is solved!");
        } else {
            System.out.println("Something is wrong with your logic.");
            System.out.println("isCorrectGuess: " + isCorrectGuess);
            System.out.println("hasSubstring: " + hasSubstring);
            System.out.println("isDivisible: " + isDivisible);
        }
    }
}
