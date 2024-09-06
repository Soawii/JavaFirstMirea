package ru.mirea.task2.Task_9;
import java.util.Random;

public class Poker
{
    private Card[] cards = new Card[52];
    private int cards_left = 52;

    public Poker()
    {
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "A"};
        for (int i = 0; i < 52; i++)
        {
            cards[i] = new Card(suits[i / 13], ranks[i % 13]);
        }
    }

    public Card handCard()
    {
        if (cards_left == 0) return null;
        Card[] new_array = new Card[cards_left];
        int idx = 0;
        for (int i = 0; i < 52; i++)
        {
            if (cards[i] != null)
            {
                new_array[idx++] = cards[i];
            }
        }

        Random rand = new Random();
        int card_chosen = rand.nextInt(cards_left);
        Card card_to_hand = new_array[card_chosen];

        for (int i = 0; i < 52; i++)
        {
            if (card_to_hand.equals(cards[i]))
            {
                cards[i] = null;
                break;
            }
        }

        cards_left--;
        return card_to_hand;
    }
    public static void main(String[] args)
    {
        Poker poker = new Poker();
        while (true) {
            for (int i = 0; i < 5; i++) {
                Card card = poker.handCard();
                if (card == null) {
                    System.out.println("No more cards left!");
                    return;
                } else {
                    System.out.println("Player " + (i + 1) + " chooses " + card + '\n');
                }
            }
            System.out.println("Next Turn...\n");
        }
    }
}
