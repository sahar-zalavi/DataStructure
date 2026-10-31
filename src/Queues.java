import java.util.Scanner; // Reads user input.
import java.util.LinkedList; // Creates the queue.
import java.util.Queue; // Provides queue operations.
import java.util.Arrays; // Helps display arrays.

public class Queues {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // Sets up keyboard input.
        Queue<Character> letters = new LinkedList<Character>(); // Creates an empty queue.

        int[] occurrences = new int[26]; // Creates 26 counters, all starting at 0.

        char thisChar; // Stores the current character.
        int arrayPos; // Stores its counter position.

        System.out.println("Enter a phrase to check >"); // Asks for text.
        String inputStr = keyboard.nextLine(); // Stores the text.

        int i = 0; // Starts at the first character.
        while (i < inputStr.length()) { // Checks each character.
            thisChar = inputStr.charAt(i); // Gets one character.
            arrayPos = (int) thisChar - (int) 'a'; // Converts a–z to 0–25.
            occurrences[arrayPos]++; // Counts this letter.
            letters.add(thisChar); // Adds it to the queue.
            System.out.printf("%c goes at position %d\n", thisChar, arrayPos); // Shows its position.
            i++; // Moves to the next character.
        }

        boolean finished = false; // No unique character found yet.
        while (!letters.isEmpty() && !finished) { // Stops when empty or a match is found.
            thisChar = letters.remove(); // Removes the first character.
            arrayPos = (int) thisChar - (int) 'a'; // Finds its counter position.

            if (occurrences[arrayPos] == 1) { // Checks if it appears only once.
                System.out.printf("First non-repeating character is %c\n", thisChar); // Shows the result.
                finished = true; // Stops the search.
            }
        }

        if (!finished) // Checks if none was found.
            System.out.println("There are no non-recurring characters."); // Shows no match.

        System.out.println(letters); // Shows characters left in the queue.
        System.out.println(Arrays.toString(occurrences)); // Shows all letter counts.
    }
}