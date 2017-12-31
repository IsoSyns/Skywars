package badentities.azerian.skywars.threads;

import badentities.azerian.skywars.gameutilities.Utils;
import badentities.azerian.skywars.SkyWars;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

/*
 * Made By: BadEntities
 * Copyright © 2017 Azerian Network.
 * All rights reserved. Please email badentities@gmail.com for usage rights and other information.
 */

public class Countdown extends BukkitRunnable {

    int count = 10;

    public void run() {
        if(count > 0) {
            count--;
            for(Player player : Bukkit.getOnlinePlayers()) {
                Utils.sendSubTitle(player, count + 1 + "", "red");
            }
            if(SkyWars.debug) Bukkit.broadcastMessage(count + 1 + "");
        } else {
            for(Player player : Bukkit.getOnlinePlayers()) {
                Utils.clearTitle(player);
            }
            SkyWars.getGameManager().startGame();
            if(SkyWars.debug) Bukkit.broadcastMessage(count + 1 + "");
            cancel();
        }




    }
}