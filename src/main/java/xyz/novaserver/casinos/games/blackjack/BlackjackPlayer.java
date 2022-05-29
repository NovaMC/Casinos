package xyz.novaserver.casinos.games.blackjack;

import org.bukkit.entity.Player;
import xyz.novaserver.casinos.card.Hand;

public class BlackjackPlayer {
    private final Player player;

    private Hand hand;
    private int betAmount;

    public BlackjackPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
