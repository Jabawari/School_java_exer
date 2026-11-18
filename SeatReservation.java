
package com.mycompany.seatreservation;
import java.util.*;

public class SeatReservation {

    public static void main(String[] args) {
        Scanner SLEEP = new Scanner(System.in);
        boolean gumba = true;
        String[] UwU;
        String[] WOWS = { "Row 1 ", "Row 2 ", "Row 3 ", "Row 4 ", "Row 5 ", "Row 6 ", "Row 7 ", "Row 8 ", "Row 9 ", "Row 10 "};
        String [][] desk = {
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},   
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"}

        };         
        do{ 
           System.out.println("Seat Reservation");
          String[] columns = { "Col 1",  "Col 2",  "Col 3",  "Col 4" };
        for(int i = 0; i < columns.length; i++){
            System.out.print("\t" + columns[i]);

        }
        System.out.println();   
        
        for(int row = 0; row < desk.length; row++){
            System.out.print(WOWS[row]);
        for(int col = 0; col < desk[row].length; col++){
                
                System.out.print("\t" + desk[row][col]);

            }

            System.out.println();
        }
       

        System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
        
        UwU = SLEEP.nextLine().split(" ");
        
        int row1 = Integer.parseInt(UwU[0]);
        int col2 = Integer.parseInt(UwU[1]);
        
        if(Integer.parseInt(UwU[0]) > 0 && Integer.parseInt(UwU[1]) > 0){
             
             desk[row1-1][col2-1] = "X";
        }
        else{
        gumba = false;
        System.out.println("Program exit!");

        }
        
        }
        while(gumba == true);
        
        }
}