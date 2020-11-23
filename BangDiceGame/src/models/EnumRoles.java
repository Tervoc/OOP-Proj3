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
    Sheriff("Sheriff"),
    Deputy("Deputy"),
    Outlaw("Outlaw"),
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
    public static EnumRoles stringToRole(String role){
        return (EnumRoles) map.get(role);
    }
    
    public String getRoleAsString(){
        return value;
    }
}
