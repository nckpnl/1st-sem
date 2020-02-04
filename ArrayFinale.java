/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfinale;

import java.util.Scanner;

/**
 *
 * @author CPE-PANAL
 */
public class ArrayFinale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array = 0;
    
        System.out.println("This is a random array int element generator");

        System.out.println("Input index count: ");
        array = input.nextInt();
        System.out.println("Showing Results...");

        int[] mylist = new int[array];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < mylist.length; i++) {
            System.out.println("Index[" + i + "] " + mylist[i] + "");
        }

        int max = mylist[0];
        for (int i = 1; i < mylist.length; i++) {
            if (mylist[i] > max) {
                max = mylist[i];
            }
        }
        
        System.out.println("");
        System.out.println("Large no. is " + max);
        }
    

}
