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
public class OverloadingConstructors
{
    public static void main(String[] args)
    {
        Cons con = new Cons();
        Cons con2 = new Cons(1);
        Cons con3 = new Cons(5,6);
        Cons con4 = new Cons(7,0,1);
        
        System.out.printf("%s\n", con.toMil());
        System.out.printf("%s\n", con2.toMil());
        System.out.printf("%s\n", con3.toMil());
        System.out.printf("%s\n", con4.toMil());
    }
}
