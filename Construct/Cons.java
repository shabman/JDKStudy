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

class Cons
{
    private int hour;
    private int min;
    private int sec;
    
    public Cons()
    {
        this(0,0,0);
    }
    public Cons(int h)
    {
        this(h,0,0);
    }
    public Cons(int h, int m)
    {
        this(h,m,0);
    }
    public Cons(int h, int m, int s)
    {
        setTime(h,m,s);
    }
    public void setTime(int h, int m, int s)
    {
        setHour(h);
        setMin(m);
        setSec(s);
    }
    public void setHour(int h)
    {
     hour = ((h >= 0 && h < 24) ? h : 0);   
    }
    public void setMin(int m)
    {
        min = ((m >= 0 && m < 60) ? m : 0);
    }
    public void setSec(int s)
    {
        sec = ((s >= 0 && s < 60) ? s : 0);
    }
    public int getHour()
    {
        return hour;
    }
    public int getMin()
    {
        return min;
    }
    public int getSec()
    {
        return sec;
    }
    public String toMil()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMin(), getSec());
    }
}
