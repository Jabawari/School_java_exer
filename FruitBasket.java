
package fruitbasket;
import java.util.Stack;
import java.util.Scanner;

public class FruitBasket {

    public static void main(String[] args) {
        Scanner poop = new Scanner(System.in);       
        Stack  basket = new Stack();
               
        System.out.println("Catch and eat any of this fruits: ('apple', 'orange', 'mango', 'guava')");
        System.out.print("How many fruits would you like to catch? ");
        int quanty = poop.nextInt();
        System.out.println("Choose a fruit to catch. Press A, O, M, or G.");
        
        for(int i = 1 ; i<= quanty ; i++){
            
            System.out.print("Fruit "+i+" of "+quanty+": ");
            char prut = poop.next().charAt(0);
            
            if (Character.toLowerCase(prut) == 'a'){
                basket.push("Apple");
                
            }
            else if (Character.toLowerCase(prut) == 'o'){
                basket.push("Orange");
                
            }
            else if(Character.toLowerCase(prut) == 'm'){
                basket.push("Mango");
                
            }
            else if(Character.toLowerCase(prut) == 'g'){
                basket.push("Guava");
                
            }
            else{
                System.out.println("Error!!!!");
                
            }
        }
            System.out.println("Your basket now has: "+basket);
            System.out.print("Press E to eat a fruit. ");
            
            while(true){
                char e = poop.next().charAt(0);
                if(Character.toLowerCase(e) == 'e'){
                    basket.pop();
                    if(basket.isEmpty()){
                        System.out.println("No more fruits");
                        break;
                    }
                }
               
                System.out.println("Fruit(s) in the basket: "+basket);
                System.out.print("Press E to eat a fruit. ");
                
            }
        
    }
    }
    


    
 
