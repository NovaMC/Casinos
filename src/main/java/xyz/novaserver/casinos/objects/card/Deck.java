package xyz.novaserver.casinos.objects.card;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    private final LinkedList<Card> cards = new LinkedList<>();

    public void fillDeck(int sets) {
        for (int x = 0; x < sets; x++) {
            for (Card.Suit s : Card.Suit.values()) {
                for (int y = 1; y <= 13; y++) {
                    cards.add(new Card(s, x));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void addCard(Card card) {
        cards.addLast(card);
    }

    public void addAllCards(Collection<Card> cards) {
        this.cards.addAll(cards);
    }

    public Card takeCard() {
        return cards.removeFirst();
    }

    public Card getCard() {
        return cards.getFirst();
    }

    public List<Card> getCards() {
        return cards;
    }
}
