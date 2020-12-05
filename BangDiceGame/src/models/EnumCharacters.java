/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;

/**
 *
 * @author chris
 */
public enum EnumCharacters {

    /**
     * defines each characters available to the game
     * Belle Star from undead or alive expansion
     */
    belleStar("belleStar"),

    /**
     * Paul Regret from base game
     */
    paulRegret("paulRegret"),

    /**
     * Jourdonnais from base game
     */
    jourdonnais("jourdonnais"),

    /**
     * Lucky Duke from base game
     */
    luckyDuke("luckyDuke"),

    /**
     * Pedro Ramirez from base game
     */
    pedroRamirez("pedroRamirez"),

    /**
     * Greg Digger from undead or alive expansion
     */
    gregDigger("gregDigger"),

    /**
     * El Gringo from the base game
     */
    elGringo("elGringo"),

    /**
     * Willy The Kid from the base game
     */
    willyTheKid("willyTheKid"),

    /**
     * Apache Kid from the Old Saloon expansion
     */
    apacheKid("apacheKid"),

    /**
     * Bill No Face from the Old Saloon expansion
     */
    billNoFace("billNoFace");
    
    
    private final String value;
    private static final HashMap map = new HashMap<>();
    
    EnumCharacters(final String value){
        this.value = value;
    }
    static {
        for(EnumCharacters role: EnumCharacters.values()){
            map.put(role.value, role);
        }
    }

    /**
     *
     * @param role
     * @return the character and the role that is given to the character
     */
    public static EnumCharacters stringToCharacters(String role){
        return (EnumCharacters) map.get(role);
    }

    /**
     *
     * @return value of the character string
     */
    public String getCharacterAsString(){
        return value;
    }
    public String getCharImageFL(){   
        return "CharImages/"+getCharacterAsString() + ".PNG";
    }
}
