
package com.mycompany.taksperformance_advincula;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        Scanner poop = new Scanner(System.in);
               
        System.out.print("Enter the first word: ");
        String word1 = poop.nextLine();
        
        System.out.print("Enter the second word: ");
        String word2 = poop.nextLine();
        
        String sub =word1.substring(word1.length()-2);
               
        Pattern pink = Pattern.compile("[a-zA-Z]{1,2}" +sub+ "\\b");
        Matcher mama = pink.matcher(word2);
        
        if(mama.matches()){
            System.out.println(word2+" rhymes with "+word1);
        }else{
            System.out.println("I'm not sure! Sorry!");
        }
       
        
    }
}
