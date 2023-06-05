import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
    
    // Generate and return an array with 10 random numbers between 1 and 20 inclusive
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int roll = rand.nextInt(20) + 1;
            rolls.add(roll);
        }
        return rolls;
    }
    
    // Return a random letter from the alphabet
    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random rand = new Random();
        int randomIndex = rand.nextInt(alphabet.length);
        return alphabet[randomIndex];
    }
    
    // Generate and return a random string of eight characters
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }
    
    // Generate and return an array of random eight-character words of given length
    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }
    
    // Shuffle the values in an array in a pseudo-random way
    public void shuffleArray(Object[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Object temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
