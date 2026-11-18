
package bookz;

import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


public class Bookz {
    


    public static void main(String[] args) {
        Scanner Scanadian = new Scanner(System.in);
        Stack <String>attack = new Stack();
        Queue <String>kyu = new LinkedList();
        
        System.out.println("Enter four book titles: ");
         for(int i= 1; i<5;i++){
             System.out.print("Book "+i+" : ");
             String booker = Scanadian.nextLine();
             attack.add(booker);
         }
         String The_last_book_entered_is_the_first_book_to_be_removed = attack.pop();
         String The_second_to_the_last_book_entered_by_the_user_to_be_removed = attack.pop();
         String the_second_book_to_be_added_by_the_user = attack.pop();
         String The_first_book_added_by_the_user_to_the_list_and_is_the_one_at_the_bottom_of_the_stack = attack.pop();
         
         System.out.println("New order of books: ");
         
         kyu.offer(The_last_book_entered_is_the_first_book_to_be_removed);
         kyu.offer(The_second_to_the_last_book_entered_by_the_user_to_be_removed);
         kyu.offer(the_second_book_to_be_added_by_the_user);
         kyu.offer(The_first_book_added_by_the_user_to_the_list_and_is_the_one_at_the_bottom_of_the_stack);
         
         System.out.println(kyu);
             
        
    }
    
}
