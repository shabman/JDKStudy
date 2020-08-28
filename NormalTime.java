/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterfaces;

/**
 *
 * @author PurpleGuy
 */
public class TimeClass // time functions
{
    public static void main(String[] args)
    {
        Time time = new Time();
        System.out.println(time.toMilitary());
        time.setTime(13,27,6);
        System.out.println(time.toMilitary());
        System.out.println(time.toNormal());
        time.setTime(0,0,0);        
        System.out.println(time.toNormal());
    }
}

class Time
{
    private int hour;
    private int minute;
    private int second;
    
    public void setTime(int h, int m, int s)
    {
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);
        /*
        IF HOUR IS LESS THAN OR EQUAL TO 0
        AND HOUR IS LESS THAN 24
        THEN USE THAT NUMBER ? H
        ELSE SET TO DEFAULT 0
        */
        
    }
    public String toMilitary()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
        // display at 2 decimal places and add a colon
    }
    public String toNormal()
    {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM")); // : is the else bit
    }
}
