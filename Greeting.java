package greeting;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        PriorityQueue nicknames = new PriorityQueue();
        Scanner wabam = new Scanner(System.in);
        
        System.out.println("Enter the nicknames of 4 of your classmates: ");
        for(int i= 1; i<5;i++){
            System.out.print("Classmate "+i+" : ");
            String namaye = wabam.nextLine();
            nicknames.add(namaye);
        }
        System.out.println("Press H to say Hi to each of them.");
        while(!nicknames.isEmpty()){
            char Eche = wabam.next().charAt(0);
            if (Character.toUpperCase(Eche) == 'H'){
                System.out.println("Hi "+nicknames.remove()+"!");
                if(nicknames.isEmpty()){
                    System.out.println("Done saying Hi");
                    break;
                }
            }
        }
    }

}   
       

 