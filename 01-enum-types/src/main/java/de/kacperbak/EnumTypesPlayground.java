package de.kacperbak;

/**
 * Created by bakka on 06.01.15.
 */
public class EnumTypesPlayground {

    public String matchAbbreviation(CompassDirection cd){
        switch(cd){
            case NORTH: return "N";
            case SOUTH: return "S";
            case EAST: return "E";
            case WEST: return "W";
            default: return null;
        }
    }

    public String concatAllCompassDirectionAbbrevations(){
        String concatedCompassDirections = "";
        for(CompassDirection cd : CompassDirection.values()){
            concatedCompassDirections = concatedCompassDirections + cd.getAbbreviation();
        }
        return concatedCompassDirections;
    }
}
