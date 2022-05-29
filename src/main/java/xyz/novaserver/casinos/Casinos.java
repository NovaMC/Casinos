package xyz.novaserver.casinos;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.novaserver.casinos.games.blackjack.Blackjack;

public final class Casinos extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //new Blackjack().register();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
