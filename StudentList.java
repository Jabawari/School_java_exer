package studentlist;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class StudentList {

    
    public static void main(String[] args) {
        Scanner poop = new Scanner(System.in);
        Map <String, String> grimmy = new HashMap();
        LinkedList<String> key = new LinkedList<>();//I used a linkedlist to store the keys, since a hashmap keys cannot be called using index
        String number;
        String name;
        String tkey;
        
        System.out.println("Enter number (ex: 2009-2010) and Enter a name (ex: Jake)");
        for(int num =1; num<4;num++){
            System.out.println("Enter student number "+num+": ");
            number = poop.next();
            key.add(number);
            if(number.matches("[0-9]{4}+[-]{1}+[0-9]{4}")){//I used matches(), so that the the number input only accpets                
            }                                                   // four numbers, one dash, and then another four numbers.
            else{
                System.out.println("Error! Wrong input!!");
                break;
            }   
            System.out.println("Enter first name "+num+": ");
            name = poop.next();
            
            grimmy.put(number,name);
        }
        
        System.out.println("Student List:");
        for(Map.Entry uwa : grimmy.entrySet()){
            System.out.println(uwa.getKey()+" - "+uwa.getValue());
        } 
        
        System.out.println("Enter student Number:");
        String numba = poop.next();
        
        System.out.println("Enter first Name: ");
        String neym = poop.next();
        
        grimmy.put(numba, neym);
        
        
        tkey = key.get(2);
        grimmy.remove(tkey);
        

        
        System.out.println("Student List:");
        for(Map.Entry uwa : grimmy.entrySet()){
            System.out.println(uwa.getKey()+" - "+uwa.getValue());
        }

        
        
    }

}   
       
