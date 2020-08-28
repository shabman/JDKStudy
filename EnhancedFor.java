/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PurpleGuy
 */
public class EnhancedFor // loops for arrays
{
    public static void main(String[] args)
    {
        int bucky[] = {1,2,3,4,5,6,7};
        int total = 0;
        
        for (int x : bucky)
        {
            total += x;
        }
        System.out.println("The total of the array is: " + total);
    }
}
