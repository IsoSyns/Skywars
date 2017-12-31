package badentities.azerian.skywars.stats;

import java.util.UUID;

/*
 * Made By: BadEntities
 * Copyright © 2017 Azerian Network.
 * All rights reserved. Please email badentities@gmail.com for usage rights and other information.
 */

public class GameProfile {

    private UUID uuid;
    private int kills = 0;
    private int coins = 0;

    public GameProfile(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getKills() {
        return kills;
    }

    public void addKill() {
        kills++;
    }

    public int getCoins() {
        return coins;
    }

    public void addCoins(int coins) {
        this.coins = this.coins + coins;
    }

}
