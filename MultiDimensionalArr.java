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
public class MultiDimensionalArr
{
    public static void main(String[] args)
    {
        int arr[][] = {{8,9,10,11}, {12,13,14,15}};
        // System.out.println(arr[1][1]);
        int arr2[][] = {{
            10,
            12,
            14,
            16
        },{
            18,
            20,
            22,
            24
        }};
        //System.out.println(arr2[1][3]);
        System.out.println("Display 1");
        display(arr);
        System.out.println("Display 2");
        display(arr2);
    }
    public static void display(int x[][])
    {
        for (int row =0; row < x.length; row++)
        {
            for (int column = 0; column < x[row].length; column++)
            {
                System.out.print(x[row] [column] + "\t");
            }
            System.out.println();
        }
    }
}
