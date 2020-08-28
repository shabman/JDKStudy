/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PurpleGuy
 */
public class ElementsArray
{
    public static void main(String[] args) 
    {
        // summoning elements in an array
        int arr[] = {1,23,4,5,6,7,8,9};
        int sum = 0; // start at index 0
        
        for (int counter = 0; counter < arr.length; counter++)
        {
            sum += arr[counter]; // add the elements in the array.
        }
        System.out.println("The sum of these numbers is: " + sum);
    }
}
