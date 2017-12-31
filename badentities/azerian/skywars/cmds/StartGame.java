package badentities.azerian.skywars.cmds;

import badentities.azerian.skywars.SkyWars;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/*
 * Made By: BadEntities
 * Copyright © 2017 Azerian Network.
 * All rights reserved. Please email badentities@gmail.com for usage rights and other information.
 */

public class StartGame implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!SkyWars.forced) {
            SkyWars.forced = true;
        } else {
            return false;
        }
        if(SkyWars.debug) Bukkit.broadcastMessage(ChatColor.RED + "[ADMIN] " + sender.getName() + ChatColor.YELLOW +  " force started the game.");
        SkyWars.getGameManager().testPreInit(true);
        return false;
    }
}
