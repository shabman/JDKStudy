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
public class Composition
{
    public static void main(String[] args)
    {
        Poptipes pop = new Poptipes(4,5,6);
        Tuna tun = new Tuna("joe", pop);
        System.out.println(tun);
    }
}

class Tuna
{
    private String name;
    private Poptipes birthday;
    
    public Tuna(String yourName, Poptipes yourDate)
    {
        name = yourName;
        birthday = yourDate;
    }
    public String toString()
    {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}

class Poptipes
{
    private int month;
    private int day;
    private int year;
    
    public Poptipes(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
        
        System.out.printf("The Constructor is %s\n", this);
    }
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
}
