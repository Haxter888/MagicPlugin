package com.elmakers.mine.bukkit.api.protection;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface PVPManager {
    boolean isPVPAllowed(Player player, Location location);
}
