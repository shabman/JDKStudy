package userinterfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PurpleGuy
 */
public class ArrayMethods
{
    public static void main(String[] args)
    {
        int bucky[] = {3,4,5,6,7}; 
        
        change(bucky);
        
        for (int test : bucky)
        {
            System.out.println(test);
        }
    }
    public static void change(int x[]) // tells java you are making an array
    {
        for (int counter = 0; counter < x.length; counter++)
        {
            x[counter] += 5;
        }
    }
}
