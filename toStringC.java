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
public class ToStringC
{
    public static void main(String[] args)
    {
        Poptipe pop = new Poptipe(5,3,9);
    }      
}

class Poptipe
{
    private int month;
    private int day;
    private int year;
    
    public Poptipe(int m, int d, int y)
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
