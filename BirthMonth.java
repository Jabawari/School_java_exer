
package birthmonth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.Locale;

public class BirthMonth {

    public static void main(String[] args) {
        Scanner gang = new Scanner(System.in);
        Set group1 = new HashSet();
        Set group2 = new HashSet();
        Set self = new HashSet();
        
        System.out.println("Enter six(6) birth months");
        
        for(int i=1;i<4;i++){
            System.out.print("Enter birth month "+i+": ");
            String montz = gang.nextLine();
            Collections.addAll(group1, montz.toUpperCase(Locale.ITALY)); // I used toUpperCase() to match even if the capitalization of the input months does not match
        }
         for(int e=1;e<4;e++){
            System.out.print("Enter birth month "+e+": ");
            String montz = gang.nextLine();
            Collections.addAll(group2, montz.toUpperCase(Locale.ITALY));
        }
         System.out.println("Group 1 "+group1);
         System.out.println("Group 2 "+group2);
         
         System.out.print("Enter your birth month: ");
         String mymontz = gang.nextLine();
         Collections.addAll(self, mymontz.toUpperCase(Locale.ITALY));
         
         Set union = new HashSet(group1);
         Set inter = new HashSet(group1);
         Set dif = new HashSet(group1);
         
         union.addAll(group2);
         inter.retainAll(group2);
         dif.removeAll(group2);
         
         System.out.println("Union: "+union);
         System.out.println("Intersection: "+inter);
         System.out.println("Difference: "+dif);
        
         if(union.containsAll(self)){
             System.out.println("You have the same birth month with your classmate!");
         }
         else{
             System.out.println("No birth month match.");
         }
    }

}   
       
