package de.kacperbak;

/**
 * Created by bakka on 07.01.15.
 */
public enum CompassDirection {
    NORTH ("Never sees the sun", "N"),
    SOUTH ("Sun is up in there", "S"),
    EAST ("Sun goes up in there", "E"),
    WEST ("Sun goes down in there", "W");

    private final String description;
    private final String abbreviation;

    CompassDirection(String description, String abbreviation) {
        this.description = description;
        this.abbreviation = abbreviation;
    }

    public String getDescription() {
        return description;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
