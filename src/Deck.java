/* We have **13 ranks** and **4 suits**:
| 13 ranks | 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace |
| 4 suits | Clubs ♣, Diamonds ♦, Hearts ♥, Spades ♠ |
Each suit has all 13 ranks, so 13 × 4 = 52 cards.
In your Java arrays, rank positions are 0–12, and suit positions are 0–3, because counting starts at `0`. */

import java.util.ArrayList; // Lets us use a list.
import java.util.Collections; // Lets us shuffle cards.

public class Deck { // Represents a pack of cards.
    private ArrayList<Card> deck = new ArrayList<Card>(); // Makes an empty list.

    public Deck() { // Makes a full pack.
        for (int i = 0; i < 52; i++) { // Repeats 52 times.
            this.deck.add(new Card(i % 13, i / 13)); // Adds a card: rank 0–12, suit 0–3.
        }
        Collections.shuffle(this.deck); // Mixes up the cards.
    }

    public Card deal() { // Takes one card from the pack.
        if (this.deck.size() > 0) { // Are there any cards left?
            Card card = this.deck.get(0); // Gets the first card.
            this.deck.remove(0); // Removes it from the pack.
            return card; // Gives back that card.
        } else {
            return null; // No cards left.
        }
    }

    public String toString() { // Makes text showing the cards.
        String resultStr = "\n"; // Starts with a new line.

        for (Card card : deck) { // Goes through each card left.
            resultStr += card + "\n"; // Adds the card and a new line.
        }

        return resultStr; // Gives back the finished text.
    }
}