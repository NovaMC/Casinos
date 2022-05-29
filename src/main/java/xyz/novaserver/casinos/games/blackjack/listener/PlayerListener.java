package xyz.novaserver.casinos.games.blackjack.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import xyz.novaserver.casinos.games.blackjack.Blackjack;
import xyz.novaserver.mechanics.features.chairs.event.ChairSitEvent;
import xyz.novaserver.mechanics.features.chairs.event.ChairUnsitEvent;

public class PlayerListener implements Listener {
    private final Blackjack blackjack;

    public PlayerListener(Blackjack blackjack) {
        this.blackjack = blackjack;
    }

    @EventHandler
    public void onChairSit(ChairSitEvent event) {
        if (!blackjack.inMatch(event.getPlayer())) {
            // Initiate or join a match here
        }
    }

    @EventHandler
    public void onChairUnsit(ChairUnsitEvent event) {
        if (blackjack.inMatch(event.getPlayer())) {
            // Make player leave current match
        }
    }
}
