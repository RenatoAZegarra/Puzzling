import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava puzzleJava = new PuzzleJava();
        
        // Testing getTenRolls()
        ArrayList<Integer> randomRolls = puzzleJava.getTenRolls();
        System.out.println("Random rolls: " + randomRolls);
        
        // Testing getRandomLetter()
        char randomLetter = puzzleJava.getRandomLetter();
        System.out.println("Random letter: " + randomLetter);
        
        // Testing generatePassword()
        String password = puzzleJava.generatePassword();
        System.out.println("Generated password: " + password);
        
        // Testing getNewPasswordSet()
        int length = 5;
        String[] passwordSet = puzzleJava.getNewPasswordSet(length);
        System.out.println("Generated password set:");
        for (String p : passwordSet) {
            System.out.println(p);
        }
        
        // Testing shuffleArray()
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));
        puzzleJava.shuffleArray(numbers);
        System.out.println("Shuffled array: " + Arrays.toString(numbers));
    }
}
