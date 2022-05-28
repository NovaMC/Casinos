package xyz.novaserver.casinos.card;

import java.util.Collections;
import java.util.LinkedList;

public class Deck
{
    private final LinkedList<Card> cards = new LinkedList<>();
    public Deck() {
        this(1);
    }

    public Deck(int decks) {
        for(int x = 0; x < decks; x++) {
            fillDeck();
        }
    }

    public void fillDeck() {
        for(Card.Suit s : Card.Suit.values()) {
            for(int x = 1; x <= 13; x++) {
                cards.add(new Card(s, x));
            }
        }
    }

    public void addCard(Card card) {
        cards.addLast(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card takeCard() {
        return cards.removeFirst();
    }

    public Card getCard() {
        return cards.getFirst();
    }

}
