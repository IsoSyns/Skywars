package badentities.azerian.skywars.gameutilities;

/*
 * Made By: BadEntities
 * Copyright © 2017 Azerian Network.
 * All rights reserved. Please email badentities@gmail.com for usage rights and other information.
 */

public enum Kits {

    DEFAULT("default"),
    CHAMPION("champion"),
    ARCHER("archer"),
    KNIGHT("knight"),
    CHEMIST("chemist"),
    PYRO("pyro"),
    ARMORER("armorer"),
    SCOUT("scout");

    private String label;

    Kits(String label) {
        this.label = label;
    }

    public Kits getType(String type) {
        for(Kits kits : values()) {
            if(type.equalsIgnoreCase(kits.name())) {
                return kits;
            }
        }
        return null;
    }

}
