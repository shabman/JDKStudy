/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PurpleGuy
 */
public class ArrTable
{
    public static void main(String[] args)
    {
        System.out.println("Index\tValue");
        int mum_is_annoying[] = {1,2,3,4,5,6,7,8,9,0};
        
        for (int counter = 0; counter < mum_is_annoying.length; counter++)
        {
            System.out.println(counter + "\t" + mum_is_annoying[counter]);
        }
    }
}
