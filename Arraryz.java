/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PurpleGuy
 */
public class Arrayz
{
    public static void main(String[] args)
    {
        int ar[] = new int[10]; // storing 10 vars in my arrary

        for (int index = 0; index < 10; index++)
        {
            ar[index] = 10;
            
        }
        int indexing = 0;
        while (indexing < 10)
        {
            System.out.println(ar[indexing]);
            if (ar[indexing] == 10)
            {
                break;
            }
        }
    }
}
