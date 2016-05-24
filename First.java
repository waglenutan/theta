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
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            for(int j=1; j<=10; j++)
             {
                System.out.println(j*i);
                sum +=(j*i);
            }
            System.out.println("TOTAL=" + sum);
            System.out.println("=================");
        }
        
        // TODO code application logic here
       
    }

}
