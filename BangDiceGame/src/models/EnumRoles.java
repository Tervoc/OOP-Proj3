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
public enum EnumRoles {

    /**
     * Enum Roles creates each specific role involved in the game
     * Role Sheriff
     */
    Sheriff("Sheriff"),

    /**
     * Role Deputy
     */
    Deputy("Deputy"),

    /**
     * Role Outlaw
     */
    Outlaw("Outlaw"),

    /**
     * Role Renegade
     */
    Renegade("Renegade");
    
    private final String value;
    private static final HashMap map = new HashMap<>();
    
    EnumRoles(final String value){
        this.value = value;
    }
    static {
        for(EnumRoles role: EnumRoles.values()){
            map.put(role.value, role);
        }
    }

    /**
     * 
     * @param role
     * @return each role to each player
     */
    public static EnumRoles stringToRole(String role){
        return (EnumRoles) map.get(role);
    }
    
    /**
     * set role as a string
     * @return
     */
    public String getRoleAsString(){
        return value;
    }
}
