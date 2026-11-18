/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssales;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class ProductSales {
    public static void main (String[]args){
        
        String[] mattresses = {"Cozy Night Monarch", "Restonic Barbados", "Sealy Phuket"};
        
        int[][] totalMattressesSold = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        
        int mostPopularMattress = 0;
        
        System.out.println("MATTRESS SALES REPORT");
        
        System.out.println("----------");
        
         for(int i = 0; i<mattresses.length; i++){
           
            System.out.println("\nMattress:" + mattresses[i]);
        
            
        for(int j = 0; j<totalMattressesSold.length; j++){
                String[] months = null;
            
            System.out.println(months[j] + ":" + totalMattressesSold[i][j]);
            
        for (int k = 0; k<mostPopularMattress.lenght; k++){
            
            System.out.println("Most popular mattress:" + mattresses[k]);
        }
        }
        }
         
        double averageMattressesSold = (double) totalMattressesSold.length;
        
        System.out.println("Total mattresses sold:" + Arrays.toString(totalMattressesSold));
        
        System.out.println("Average mattresses sold per month:" + averageMattressesSold);
        
    }

    
}
