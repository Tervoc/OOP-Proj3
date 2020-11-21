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
public enum Roles {
    Sheriff("Sheriff"),
    Deputy("Deputy"),
    Outlaw("Outlaw"),
    Renegade("Renegade");
    
    private String value;
    private static HashMap map = new HashMap<>();
    
    private Roles(String value){
        this.value = value;
    }
    static {
        for(Roles role: Roles.values()){
            map.put(role.value, role);
        }
    }
    public static Roles stringToRole(String role){
        return (Roles) map.get(role);
    }
    
    public String getRoleAsString(){
        return value;
    }
}
