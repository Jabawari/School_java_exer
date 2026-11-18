

package com.mycompany.mavenproject2;

import java.util.*;
public class COMCO {

    public static void main(String[] args) {
        Scanner tired = new Scanner(System.in);
        System.out.println("Enter three names: ");
        String name1 = tired.nextLine();
        String name2 = tired.nextLine();
        String name3 = tired.nextLine();
        System.out.println("Possible names are: ");
        String frst = name1+" "+name2;
        String sec = name1+" "+name3;
        String trd = name2+" "+name1;
        String frt = name2+" "+name3;
        String fft = name3+" "+name1;
        String sxt = name3+" "+name2;
        System.out.println("1- "+frst);
        System.out.println("2- "+sec);
        System.out.println("3- "+trd);
        System.out.println("4- "+frt);
        System.out.println("5- "+fft);
        System.out.println("6- "+sxt);
        System.out.print("Enter 1-6 to select a name: ");
        byte pck = tired.nextByte();
        if (pck == 1){
            char a = name1.charAt(0);
            char b = name2.charAt(0);
            System.out.println("The initials for "+frst+" is "+a+b+".");
            String c = name1.toLowerCase();
            String d = name2.toLowerCase();
            System.out.println("Suggested user name: "+c+"_"+d);
        }
        else if (pck == 2){
            char e = name1.charAt(0);
            char f = name3.charAt(0);
            System.out.println("The initials for "+sec+" is "+e+f+".");
            String g = name1.toLowerCase();
            String h = name3.toLowerCase();
            System.out.println("Suggested user name: "+g+"_"+h);
        }
        else if (pck == 3){
            char i = name2.charAt(0);
            char j = name1.charAt(0);
            System.out.println("The initials for "+trd+" is "+i+j+".");
            String k = name2.toLowerCase();
            String l = name1.toLowerCase();
            System.out.println("Suggested user name: "+k+"_"+l);
     }
       
        else if (pck == 4){
            char m = name2.charAt(0);
            char n = name3.charAt(0);
            System.out.println("The initials for "+frt+" is "+m+n+".");
            String o = name2.toLowerCase();
            String p = name3.toLowerCase();
            System.out.println("Suggested user name: "+o+"_"+p);
        } 
        else if (pck == 5){
            char q = name3.charAt(0);
            char r = name1.charAt(0);
            System.out.println("The initials for "+fft+" is "+q+r+".");
            String s = name3.toLowerCase();
            String t = name1.toLowerCase();
            System.out.println("Suggested user name: "+s+"_"+t);
        }
        else if (pck == 6){
            char u = name3.charAt(0);
            char v = name2.charAt(0);
            System.out.println("The initials for "+sxt+" is "+u+v+".");
            String w = name3.toLowerCase();
            String x = name2.toLowerCase();
            System.out.println("Suggested user name: "+w+"_"+x);
        }
        else{
            System.out.print("Invalit Input!");
        }
 }

 }        