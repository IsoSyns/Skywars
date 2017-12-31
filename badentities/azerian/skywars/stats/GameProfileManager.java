package badentities.azerian.skywars.stats;

import java.util.HashSet;
import java.util.UUID;

/*
 * Made By: BadEntities
 * Copyright © 2017 Azerian Network.
 * All rights reserved. Please email badentities@gmail.com for usage rights and other information.
 */

public class GameProfileManager {

    private HashSet<GameProfile> gameProfiles = new HashSet<GameProfile>();

    public HashSet<GameProfile> getGameProfiles() {
        return gameProfiles;
    }

    public GameProfile getGameProfile(UUID uuid) {
        for(GameProfile gameProfile : gameProfiles) {
            if(gameProfile.getUuid().equals(uuid)) {
                return gameProfile;
            }
        }
        return null;
    }

    public void createGameProfile(UUID uuid) {
        GameProfile gameProfile = new GameProfile(uuid);
        gameProfiles.add(gameProfile);
    }

}
