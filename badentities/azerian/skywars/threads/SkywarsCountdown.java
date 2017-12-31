package badentities.azerian.skywars.threads;

import badentities.azerian.skywars.SkyWars;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

/*
 * Made By: BadEntities
 * Copyright © 2017 Azerian Network.
 * All rights reserved. Please email badentities@gmail.com for usage rights and other information.
 */

public class SkywarsCountdown extends BukkitRunnable {

    public boolean forced;
    int count = 10;

    public SkywarsCountdown(boolean forced) {
        this.forced = forced;
    }

    public void run() {
        if(Bukkit.getOnlinePlayers().size() < 10) {
            if(!forced) {
                Bukkit.broadcastMessage(ChatColor.RED + "Not enough players to start!");
                cancel();
            }
        }
        if(count > 0) {
            count--;
        } else if(count == 0) {
            SkyWars.getGameManager().startPreGame();
            cancel();
        }
    }

}
