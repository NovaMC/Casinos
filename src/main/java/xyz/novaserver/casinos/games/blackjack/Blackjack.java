package xyz.novaserver.casinos.games.blackjack;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.novaserver.casinos.games.CasinoGame;

import java.util.*;

public class Blackjack implements CasinoGame {
    private final Set<BlackjackMatch> blackjackMatches = new HashSet<>();

    @Override
    public void register() {

    }

    public boolean inMatch(@NotNull Player player) {
        for (BlackjackMatch match : blackjackMatches) {
            if (match.containsPlayer(player))
                return true;
        }
        return false;
    }

    @Nullable
    public BlackjackMatch getMatch(@NotNull Player player) {
        for (BlackjackMatch match : blackjackMatches) {
            if (match.containsPlayer(player))
                return match;
        }
        return null;
    }
}
