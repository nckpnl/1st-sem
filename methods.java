/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author CPE-PANAL
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Print_NCK();
        Print_NCKname("NCK PNL" , 19);
        int Nck=MultiByTwo(8);
        */
        
        
        
        System.out.print("Find the factorial of Number: ");
        int B=input.nextInt();
        
        /*
        System.out.println(Nck);
        System.out.println(Add(1, 5));
        */        
        System.out.println(" ");
        System.out.println("The factorial of "+ B +" is "+factorial(B));
    }
    /*
    static void Print_NCK(){
        System.out.println("NCK!!");
        System.out.println("NCK!!");
    }
    
    static void Print_NCKname(String Name,int age){
        System.out.println(Name + " Age: " +age);
        System.out.println(Name + " Age: " +age);
    }
    
    static int MultiByTwo(int input){
        return input*2;
    }
    
    static int Add(int Num1,int Num2){
        return Num1+Num2;
    }
    */
    
    static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }
    
}
