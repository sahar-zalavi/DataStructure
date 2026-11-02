/*
Snap!
Implement the class Snap to play the classic card game according to the following rules.
• The application should generate a shuffled deck of 52 cards and display them in
shuffled order.
• The rank of each consecutive pair of cards is compared and the message “SNAP!!!”
is displayed when a match is found (i.e., for 52 cards, 51 comparisons are made).
• After all comparisons are made, the application reports the number of snaps found.
Extend the Snap class to check for supersnaps (where the cards are of the same colour as
well as the same rank). Add new methods to the Card class to help you as required.
• The message “SUPERSNAP!!!” should be displayed when a snap with similarly
coloured cards is found.
• The final output should report both the number of supersnaps and the number of
snaps.
Rank means the card’s number or name, such as 2, 7, Jack, Queen, King or Ace.

For example, in Queen of Hearts:
- Rank = Queen
- Suit = Hearts
- Colour = Red
 */
public class Snap {
    public static void main(String[] args) {
        Deck deck = new Deck(); // Creates a deck of cards.
        Card card1, card2; // Stores the two cards being compared.

        int numSnaps = 0, numSupersnaps = 0; // Starts both counters at zero.

        card1 = deck.deal(); // Takes the first card.
        System.out.println(card1); // Displays the first card.

        for (int i = 0; i < 51; i++) { // Compares cards 51 times.
            card2 = deck.deal(); // Takes the next card.
            System.out.println(card2); // Displays the next card.

            if (card1.getRankValue() == card2.getRankValue()) { // Checks for the same rank.
                if (card1.getColor().equals(card2.getColor())) { // Checks for the same colour.
                    System.out.println("SuperSnap!!!");
                    numSupersnaps++; // Adds one to the supersnap count.
                } else {
                    System.out.println("Snap!!!"); // Same rank, different colours.
                }

                numSnaps++; // Counts every snap, including supersnaps.
            }

            card1 = card2; // Makes this card the first card for the next comparison.
        }

        // Displays the total snaps and how many were supersnaps.
        System.out.printf(
                "We had %d Snaps of which %d were supersnaps\n", numSnaps, numSupersnaps);
    }
}