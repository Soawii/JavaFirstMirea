package ru.mirea.task2.Task_9;

import java.util.Objects;

public class Card
{
    private String suit;
    private String rank;

    public Card(String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
    }



    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(suit, card.suit) && Objects.equals(rank, card.rank);
    }
}
