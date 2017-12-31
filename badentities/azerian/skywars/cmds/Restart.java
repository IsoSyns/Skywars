package badentities.azerian.skywars.cmds;

import badentities.azerian.skywars.SkyWars;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/*
 * Made By: BadEntities
 * Copyright © 2017 Azerian Network.
 * All rights reserved. Please email badentities@gmail.com for usage rights and other information.
 */

public class Restart implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        SkyWars.getGameManager().endGame();

        return false;
    }

}
