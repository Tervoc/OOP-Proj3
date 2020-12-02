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
    belleStar("belleStar"),
    paulRegret("paulRegret"),
    jourdonnais("jourdonnais"),
    luckyDuke("luckyDuke"),
    pedroRamirez("pedroRamirez"),
    gregDigger("gregDigger"),
    elGringo("elGringo"),
    willyTheKid("willyTheKid"),
    apacheKid("apacheKid"),
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
    public static EnumCharacters stringToCharacters(String role){
        return (EnumCharacters) map.get(role);
    }
    public String getCharacterAsString(){
        return value;
    }
}
