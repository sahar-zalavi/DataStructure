public class CardTest { // Defines the CardTest class.
    public static void main(String[] args) { // Starts the program.

        /*Card card1 = new Card(); // Creates the first card.
        Card card2 = new Card(); // Creates the second card.

        if (card1.isBiggerThan(card2)) { // Checks if card1 is bigger than card2.
            System.out.println(card1); // Prints card1 first.
            System.out.println(card2); // Prints card2 second.
        } else { // Runs if card1 is not bigger.
            System.out.println(card2); // Prints card2 first.
            System.out.println(card1); // Prints card1 second.
        }*/

        Deck deck = new Deck(); // Makes a pack of cards.


        System.out.println(deck.deal());  // Takes and shows one card.
        System.out.println(deck.deal()); // Takes and shows another card.
        System.out.println(deck.deal());
        System.out.println(deck.deal());

        System.out.println(deck);
    } // Ends the main method.
} // Ends the class.