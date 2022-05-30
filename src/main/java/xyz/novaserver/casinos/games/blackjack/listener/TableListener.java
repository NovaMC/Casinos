package xyz.novaserver.casinos.games.blackjack.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import xyz.novaserver.casinos.games.blackjack.Blackjack;
import xyz.novaserver.mechanics.features.chairs.event.ChairSitEvent;
import xyz.novaserver.mechanics.features.chairs.event.ChairUnsitEvent;

public class TableListener implements Listener {
    private final Blackjack blackjack;

    public TableListener(Blackjack blackjack) {
        this.blackjack = blackjack;
    }

    @EventHandler
    public void onChairSit(ChairSitEvent event) {

    }

    @EventHandler
    public void onChairUnsit(ChairUnsitEvent event) {

    }
}
