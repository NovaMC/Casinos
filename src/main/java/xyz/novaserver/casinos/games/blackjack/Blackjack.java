package xyz.novaserver.casinos.games.blackjack;

import org.bukkit.entity.Player;
import xyz.novaserver.casinos.card.Deck;

import java.util.List;

/**
 * Blackjack Class for playing blackjack
 * @author Nova Server
 */
public class Blackjack
{
    private Deck deck;
    public Blackjack(List<Player> players) {
        deck = new Deck(4);
        deck.shuffle();
    }
}
