
package com.mycompany.advincula_life;
import java.util.*;
public class Advincula_Life {

    public static void main(String[] args) {
        Scanner kan = new Scanner(System.in);
        System.out.println("<------ Facttorial Calculator ------>");
        System.out.print("Enter a positive number: ");
        int posnum = kan.nextInt();
        if (posnum >=1){
        int i=1,fact=1;
        while(i<=posnum)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+posnum+" is: "+fact);  
        }
        else {
            System.out.print("Invalid input! Program stopped!");
        }
     }   
}
