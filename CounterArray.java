/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mma1i
 */

import java.util.Random;

public class CounterArray
{
    public static void main(String[] args)
    {
        // Array elements stored in counters
        Random ran = new Random();
        
        int bucky[] = new int[7];
        
        for (int roll = 1; roll < 1000; roll++) 
        {
            ++bucky[1 + ran.nextInt(6)];
        }
        System.out.println("Face\tFrequency");
        
        for (int face = 1; face < bucky.length; face++)
        {
            System.out.println(face + "\t" + bucky[face]);
        }
    }
}
