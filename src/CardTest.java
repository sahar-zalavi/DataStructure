public class CardTest { // Defines the CardTest class.
    public static void main(String[] args) { // Starts the program.

        Card card1 = new Card(); // Creates the first card.
        Card card2 = new Card(); // Creates the second card.

        if (card1.isBiggerThan(card2)) { // Checks if card1 is bigger than card2.
            System.out.println(card1); // Prints card1 first.
            System.out.println(card2); // Prints card2 second.
        } else { // Runs if card1 is not bigger.
            System.out.println(card2); // Prints card2 first.
            System.out.println(card1); // Prints card1 second.
        }
    } // Ends the main method.
} // Ends the class.