/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nutan;



/**
 *
 * @author Nutan
 */
import java.util.Scanner;
public class Simplecalc {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b;
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        a = input.nextInt();
        System.out.println("Enter the value of b = ");
        b = input.nextInt();
        // TODO code application logic here
        System.out.println("Enter your choice:\n"
                + "1: sum(+)\n"
                + "2: subtraction(-)\n"
                + "3: division(/)\n"
                + "4: multiplication(*)\n");
        choice = input.nextInt();
        
        
        switch (choice)  {
        case 1:
            System.out.println("Sum = " + (a + b));
            break;

        case 2:
            System.out.println("Subtraction = " + (a - b));
            break;

        case 3:
            System.out.println("Division =  " + (a / b));
            break;

        case 4:
            System.out.println("Multiplication =  " + (a * b));
            break;
        }
           
    }
    
}
