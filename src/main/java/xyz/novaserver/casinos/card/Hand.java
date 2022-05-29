package xyz.novaserver.casinos.card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Hand
{
    private final List<Card> hand = new ArrayList<>();

    public void addCard(Card card) {
        hand.add(card);
    }

    public void addAllCards(Collection<Card> cards) {
        hand.addAll(cards);
    }

    public List<Card> getHand() {
        return hand;
    }
}
