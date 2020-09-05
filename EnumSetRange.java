/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterfaces;

/**
 *
 * @author PurpleGuy
 * 
 *
 */

import java.util.EnumSet;

public enum Enum
{
    me("Handosome", "15"),
    brother("Idiot", "16"),
    sister("Little baby", "6"),
    bully("Dolton", "9");
    
    private final String desc;
    private final String year;
    
    Enum(String description, String bday)
    {
        desc = description;
        year = bday;
    }
    
    public String getDesc()
    {
        return desc;
    }
    public String getYear()
    {
        return year;
    } 
    public static void main(String[] args)
    {
        for (Enum people: Enum.values()) // values is a static method
        {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
        System.out.println("----");
        for (Enum people : EnumSet.range(Enum.brother, Enum.sister))
        {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
    }
}
