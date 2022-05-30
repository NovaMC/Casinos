package xyz.novaserver.casinos.objects.card;

public class Card {

    private final Suit suit;
    private final Rank rank;
    private int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
        rank = switch (value) {
            case 1 ->  Rank.ACE;
            case 11 ->  Rank.JACK;
            case 12 ->  Rank.QUEEN;
            case 13 ->  Rank.KING;
            default ->  Rank.NONE;
        };
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public enum Rank {
        JACK,
        QUEEN,
        KING,
        ACE,
        NONE
    }

    public enum Suit {
        SPADES,
        CLUBS,
        DIAMONDS,
        HEARTS
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                ", value=" + value +
                '}';
    }
}

