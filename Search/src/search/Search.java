/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.Random;
/**
 *
 * @author student
 */
public class Search {
    
    int []array;
    Random rand=new Random();
    public int length=array.length;
    public Search(int length) {
        array=new int[length];
    }
    
    public void fill()
    {
        for (int i = 0; i < this.array.length; i++) {
            array[i]=rand.nextInt();
        }
        
    }
    public void display()
    {
        for (int i = 0; i < this.array.length; i++) {
            System.out.println(this.array[i]);
        }
    }
    
    public void search(int num, int length )
    {
        if (this.array[length-1]==num || length<0)
        {
            System.out.println(this.array[length-1]);
            return;
        }
        search(num,length-1);
    }
            
}
