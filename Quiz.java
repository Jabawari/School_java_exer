
package com.mycompany.quiz;
import java.util.*;
public class Quiz {

    public static void main(String[] args) {
        int score = 0;
        int perfect = 5;
        Scanner poop = new Scanner(System.in);
        String [] questions = {
            "Does Spongebob have a girlfriend?\n"
                + "(a)Yes\n(b)No way\n(c)It's me <3\n",
            "Where do we go when we die?\n"
                + "(a)Void of emptiness\n(b)No one knows\n(c)Heaven\n",
            "What is the most powerful piece in chess\n"
                + "(a)King\n(b)Rook\n(c)Queen\n",
            "Is Drake Gay?\n"
                + "(a)Only he knows\n(b)Positively Yes\n(c)No\n",
            "What is the weakness of Devil fruit users?\n"
                + "(a)Fire\n(b)Love\n(c)Water\n"
        };
        System.out.println("Enter the letter of the correct answer");
        System.out.println(questions[0]);
        char first = poop.next().charAt(0);
        if (first == 'b'){
            plusOne();
            score = score + 1;
        }
        else{
            System.out.println("");
            
    }
        
        
    
        System.out.println(questions[1]);
        char second = poop.next().charAt(0);
        if (second == 'b'){
            plusOne();
            score = score + 1;
        }else {
            System.out.println("");
            
            
    }
        
        System.out.println(questions[2]);
        char third = poop.next().charAt(0);
        if (third == 'c'){
            plusOne();
            score = score + 1;
        }else {
            System.out.println("");
        
    }
        System.out.println(questions[3]);
        char fourt = poop.next().charAt(0);
        if (fourt == 'a'){
            plusOne();
            score = score + 1;
        }else{
            System.out.println("");
        
    }
        System.out.println(questions[4]);
        char fifth = poop.next().charAt(0);
        if (fifth == 'c'){
            plusOne();
            score = score + 1;
        }
        else{
            System.out.println("");
        
    }
    
        System.out.println("You got "+score+" out of "+perfect);
        
    }
    
    static void plusOne (){
        System.out.println("Hooray!");
        
    }
}
