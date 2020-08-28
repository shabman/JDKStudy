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
 */
public class VarLenArgs
{
    public static void main(String[] args)
    {
        System.out.println("Average: " + av(1,2,3,4,54,5,6,6,6));
    }
    public static int av(int...number)
    {
        int total = 0;
        for (int x : number)
        {
            total += x;
            
        }
        return total/number.length;
    }
}
