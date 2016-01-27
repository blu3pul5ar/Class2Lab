/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Nicholas
 */
public class WelcomeService {
    
    private static LocalTime now;
    
    private static String CheckTime(){
        now = LocalTime.now();
        if (now.isBefore(LocalTime.NOON)){
            return "Morning";
        }
        else if(now.isBefore(LocalTime.of(17, 0))){
            return "Afternoon";
        }
        else{
            return "Evening";
        }
    }
    
    public static String Message(String name){
        String msg = "Good " + CheckTime() + ", " + name + ". Welcome!";
        return msg;
    }
}
