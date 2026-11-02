import java.util.Random; // Allows random numbers.

public class Card { // Defines the Card class.
    private int rank; // Stores the rank's array position.
    private int suit; // Stores the suit's array position.

    private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; // Rank names shared by all cards.
    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; // Suit names shared by all cards.

    public Card() { // Creates a random card.
        Random random = new Random(); // Creates a random number generator.
        this.rank = random.nextInt(Card.ranks.length); // Picks a rank position from 0 to 12.
        this.suit = random.nextInt(Card.suits.length); // Picks a suit position from 0 to 3.
    }
    public Card(int rank, int suit) { // Makes a card using the given rank and suit.
        this.rank = rank; // Saves the rank in this card.
        this.suit = suit; // Saves the suit in this card.
    }

    public int getRankValue() { // Gets the card's rank position.
        return this.rank; // Gives back a number from 0 to 12.
    }

    public String getColor() {
        if (this.getSuit().equals("Diamonds") || this.getSuit().equals("Hearts")) {
            return "Red"; // Diamonds and Hearts.
        } else {
            return "Black"; // Clubs and Spades.
        }
    }

    public String getRank() { // Gets the rank name.
        return Card.ranks[this.rank]; // Returns a name such as "King".
    }

    public String getSuit() { // Gets the suit name.
        return Card.suits[this.suit]; // Returns a name such as "Hearts".
    }

    public boolean isBiggerThan(Card anotherCard) { // Compares two cards by rank.
        return this.rank > anotherCard.rank; // Returns true if this card has a higher rank.
    }

    public String toString() { // Gives the card as text.
        return getRank() + " of " + getSuit(); // Returns text such as "King of Hearts".
    }
}