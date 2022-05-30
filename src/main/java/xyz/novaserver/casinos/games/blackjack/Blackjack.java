package xyz.novaserver.casinos.games.blackjack;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.novaserver.casinos.games.CasinoGame;

import java.util.*;

public class Blackjack implements CasinoGame {
    private final Set<Table> blackjackTables = new HashSet<>();

    @Override
    public void register() {

    }

    @Nullable
    public Table getTable(@NotNull Player p) {
        for(Table t : blackjackTables) {
            if(t.getPlayers().contains(p)) {
                return t;
            }
        }
        return null;
    }

    @Nullable
    public Table getTable(@NotNull Location l) {
        for(Table t : blackjackTables) {
            if(t.getChairs().contains(l)) {
                return t;
            }
        }
        return null;
    }

    public boolean isAtTable(@NotNull Player p) {
        for(Table t : blackjackTables) {
            if(t.getPlayers().contains(p)) {
                return true;
            }
        }
        return false;
    }
}
