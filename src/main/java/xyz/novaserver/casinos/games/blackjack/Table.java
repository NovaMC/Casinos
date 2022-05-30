package xyz.novaserver.casinos.games.blackjack;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Table
{
    private final List<Player> players = new ArrayList<>();
    private final Set<Location> chairs = new HashSet<>();

    public void addChair(Location l) {
        chairs.add(l);
    }
    public List<Player> getPlayers() {
        return players;
    }

    public boolean hasPlayer(Player p) {
        return players.contains(p);
    }

    public Set<Location> getChairs() {
        return chairs;
    }
}
