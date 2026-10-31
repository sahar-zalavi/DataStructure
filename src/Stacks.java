/* Write a Java program that asks the user to enter some text. Use a stack to reverse the text,
 then display the original and reversed text.
Check whether they are the same. If they are, display a message saying the text is a palindrome.*/
import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Creates a Scanner to read keyboard input.
        Stack<Character> charStack = new Stack<Character>(); // Creates an empty stack to store characters.
        String reversedStr = ""; // Creates an empty string to store the reversed text.

        System.out.println("\nEnter a string>"); // Asks the user to enter text.
        String inputStr = keyboard.nextLine(); // Reads and stores the whole line of text.

        int i = 0; // Starts at position 0, which is the first character.
        while (i < inputStr.length()) { // Repeats while there are characters left to add.
            charStack.push(inputStr.charAt(i)); // Adds the character at position i to the top of the stack.
            i++; // Moves to the next character.
        } // Ends the first loop.

        System.out.println("Stack contents: " + charStack); // Displays the characters in the stack.

        while (!charStack.empty()) { // Repeats while the stack is NOT empty.
            reversedStr += charStack.pop(); // Removes the top character and adds it to the reversed text.
        } // Ends the second loop.

        System.out.printf("%s reversed is %s\n", inputStr, reversedStr); // Displays the original and reversed text.

        if (inputStr.equals(reversedStr)) // Checks whether the original and reversed text are exactly the same.
            System.out.printf("%s is a palindrome\n", inputStr); // Says it is a palindrome, such as "madam".

    } // Ends the main method.
} // Ends the class.