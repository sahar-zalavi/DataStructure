/*
Write a Java program called **RankedCards** that creates an array of five randomly generated cards.
The program should display all five cards,
then use a loop to find the card with the highest rank and store its position in the array.
Next, swap the highest-ranked card with the last card in the array using a temporary variable.
Finally, display the cards again to show their new positions after swapping.
 */

import java.util.Random; // Imports Random (not used directly here).

public class RankedCards { // Creates the RankedCards class.

    public static void main(String[] args) { // Starts the program.

        Card myCards[] = new Card[5]; // Creates an array to store 5 cards.
        int biggestValue = -1, biggestPos = -1; // Stores the biggest rank and its position.
        Card tempCard; // Temporarily holds a card when swapping.

        for (int i = 0; i < 5; i++) { // Loops 5 times.
            myCards[i] = new Card(); // Creates a new card at position i.

            if (myCards[i].getRankValue() > biggestValue) { // Checks if this card has a bigger rank.
                biggestValue = myCards[i].getRankValue(); // Saves the biggest rank found.
                biggestPos = i; // Saves its position in the array.
            }
        }

        System.out.println("My cards are ..."); // Prints a heading.

        for (Card card : myCards) { // Goes through each card in the array.
            System.out.println(card); // Prints the card.
        }

        System.out.println("\n The biggest rank value is at position " + biggestPos); // Shows the position of the biggest card.

        tempCard = myCards[4]; // Temporarily saves the last card.
        myCards[4] = myCards[biggestPos]; // Moves the biggest card to the last position.
        myCards[biggestPos] = tempCard; // Moves the old last card to the biggest card's previous position.

        System.out.println("\n After swapping..."); // Prints a heading after swapping.

        for (Card card : myCards) { // Goes through all cards again.
            System.out.println(card); // Prints the new order of cards.
        }
    }
}