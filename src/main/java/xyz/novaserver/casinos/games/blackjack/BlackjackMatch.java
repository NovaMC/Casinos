package xyz.novaserver.casinos.games.blackjack;

import org.bukkit.entity.Player;
import xyz.novaserver.casinos.card.Deck;

import java.util.*;

public class BlackjackMatch {
    // Store the players that are a part of this match
    private final Map<UUID, BlackjackPlayer> players = new HashMap<>();

    private Deck deck = new Deck();

    public BlackjackMatch() {
        // Each match will always use four sets of cards
        deck.fillDeck(4);
        deck.shuffle();
    }

    private boolean containsPlayer(Player player) {
        return players.containsKey(player.getUniqueId());
    }

    private BlackjackPlayer getPlayer(Player player) {
        return players.get(player.getUniqueId());
    }
}
