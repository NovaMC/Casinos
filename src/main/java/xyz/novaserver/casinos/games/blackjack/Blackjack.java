package xyz.novaserver.casinos.games.blackjack;

import org.bukkit.entity.Player;
import xyz.novaserver.casinos.games.CasinoGame;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Blackjack Class for playing blackjack
 * @author Nova Server
 */
public class Blackjack implements CasinoGame {
    private final Map<UUID, BlackjackMatch> blackjackMatches = new HashMap<>();

    @Override
    public void register() {

    }

    public boolean inMatch(Player player) {
        return blackjackMatches.containsKey(player.getUniqueId());
    }

    public BlackjackMatch getMatch(Player player) {
        return blackjackMatches.get(player.getUniqueId());
    }
}
