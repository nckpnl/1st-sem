/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tindahan2;

import com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil;
import java.util.Scanner;

/**
 *
 * @author CPE-PANAL
 */
public class Tindahan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean balik = false;
        int ctransaction;
        boolean buy_again = false;
        int quantity1 = 0;
        int quantity2 = 0;
        int quantity3 = 0;
        int quantity4 = 0;
        int quantity5 = 0;
        int choice = 0;
        double cash = 0;
        double subtotal1 = 0, total = 0;
        double subtotal2 = 0;
        double subtotal3 = 0;
        double subtotal4 = 0;
        double subtotal5 = 0;
        int sp1 = 10;
        int sp2 = 25;
        int sp3 = 75;
        int sp4 = 15;
        int sp5 = 500;
        double s1 = quantity1;
        double s2 = quantity2;
        double s3 = quantity3;
        double s4 = quantity4;
        double s5 = quantity5;
        
                

        do {
            System.out.println("G'day pips Welcome To NCK store");
            System.out.println("Purchase an item?");

            do {
                    System.out.println("1.) Local Shoes - 10USD");
                    System.out.println("2.) 2nd Hand Shoes - 25USD");
                    System.out.println("3.) Brand New Shoes - 75USD");
                    System.out.println("4.) Immitated Shoes - 15USD");
                    System.out.println("5.) Luxury shoe - 500USD");
                    System.out.println("Enter Product number of the item you want to buy.");
                    choice = input.nextInt();


                if (choice == 1) {
                    System.out.println("Enter quantity");
                    quantity1 = input.nextInt();
                    subtotal1 = quantity1 * sp1;
                    System.out.print("Total Price:" + subtotal1);
                    System.out.println(" USD");
                    total = total + subtotal1;
                    System.out.print("Grand Total:" + total);
                    System.out.println(" USD");
                } else if (choice == 2) {
                    System.out.println("Enter quantity");
                    quantity2 = input.nextInt();
                    subtotal2 = quantity2 * sp2;
                    System.out.print("Total Price:" + subtotal2);
                    System.out.println(" USD");
                    total = total + subtotal2;
                    System.out.print("Grand Total:" + total);
                    System.out.println(" USD");
                } else if (choice == 3) {
                    System.out.println("Enter quantity");
                    quantity3 = input.nextInt();
                    subtotal3 = quantity3 * sp3;
                    System.out.print("Total Price:" + subtotal3);
                    System.out.println(" USD");
                    total = total + subtotal3;
                    System.out.print("Grand Total:" + total);
                    System.out.println(" USD");
                } else if (choice == 4) {
                    System.out.println("Enter quantity");
                    quantity4 = input.nextInt();
                    subtotal4 = quantity4 * sp4;
                    System.out.print("Total Price:" + subtotal4);
                    System.out.println(" USD");
                    total = total + subtotal4;
                    System.out.print("Grand Total:" + total);
                    System.out.println(" USD");
                } else if (choice == 5) {
                    System.out.println("Enter quantity");
                    quantity5 = input.nextInt();
                    subtotal5 = quantity5 * sp5;
                    System.out.print("Total Price:" + subtotal5);
                    System.out.println(" USD");
                    total = total + subtotal5;
                    System.out.print("Grand Total:" + total);
                    System.out.println(" USD");
                }

                boolean keyword;
                
                
                
                
                
                do {
                    System.out.println("Would you like to add another item?");
                    System.out.println("Type 1 to add another item\nType 0 to proceed to checkout.");
                    int a = input.nextInt();

                    if (a == 1) {
                        buy_again = true;
                        break;
                    } else if (a == 0) {
                        buy_again = false;
                        break;
                    } else {
                        System.out.println("Invalid Input!!");
                        System.out.println("Enter valid code");
                    }
                } while (keyword = true);

            } while (buy_again);
            
            
            boolean insufficient_cash;
            System.out.println("Proceeding to checkout...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            if(quantity1>0){
                System.out.print("local shoes: " + quantity1);
                System.out.print("         Subtotal:"+subtotal1);
                System.out.println(" USD");
                }    
            if(quantity2>0){
                System.out.print("local shoes: " + quantity2);
                System.out.print("         Subtotal:"+subtotal1);
                System.out.println(" USD");
                }
            if(quantity3>0){
                System.out.print("local shoes: " + quantity1);
                System.out.print("         Subtotal:"+subtotal3);
                System.out.println(" USD");
                }
            if(quantity4>0){
                System.out.print("local shoes: " + quantity4);
                System.out.print("         Subtotal:"+subtotal4);
                System.out.println(" USD");
                }
            if(quantity5>0){
                System.out.print("local shoes: " + quantity5);
                System.out.print("         Subtotal:"+subtotal5);
                System.out.println(" USD");
                }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("Grand Total to pay is:" + total);
            do {
                System.out.println("Please enter cash");
                cash = input.nextDouble();
                if (cash >= total) {
                    insufficient_cash = false;
                    break;
                } else {
                    System.out.println("Insufficient Cash!!!");
                }

            } while (insufficient_cash = true);
            
            System.out.println("Checkout Successful");
            double change = cash - total;
            System.out.println("Change:" +change);
            
            

            System.out.println("Make another transaction?");
            System.out.println("Type 1 if Yes , 0 if No");
            ctransaction = input.nextInt();
            System.out.println("Thank You! Come Again!");
            if (ctransaction == 1) {
                balik = true;
            } else if (ctransaction == 0) {
                balik = false;
            } else {
                System.out.println("Invalid Input");
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

        } while (balik);

    }
}
