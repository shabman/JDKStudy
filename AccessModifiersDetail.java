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
public class AccessModifiersDetail
{
    public static void main(String[] args)
    {
        Mod mod = new Mod();
        mod.hi("HELLO");
        Mod.getAge();
       
    }
}


class Mod
{
    private String msg = "Hello";
    private static int age = 15;
    
    public static void getAge()
    {
        System.out.println(age);
    }
    
    public void hi(String msg)
    {
        if (this.msg == "Hello")
        {
            System.out.println(this.msg);            
        }
        else {
            System.out.println("Hi");
        }
    }
}
