/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class main {
    public static void main()
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter length of array");
        int length=keyboard.nextInt();
        Search obj= new Search(length);
        
        obj.display();
    }
}
