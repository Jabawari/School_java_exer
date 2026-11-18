
package jamva;
import java.util.*;

public class Jamva {

    public static void main(String[] args) {
        
        
       
        LinkedList<String>  songs = new LinkedList<>();
        LinkedList<String>  artist = new LinkedList<>();
        
  
          songs.add(0, "Brown eyes");
          songs.add(1,  "I love you so");
          songs.add(2,  "Chasing Pavements");
          songs.add(3,  "What was i made for");
          songs.add(4,  "Paraluman");
          System.out.println(songs);
         
       
          artist.add(0, "Keeley Elise");
          artist.add(1, "Charles Ekhaus");
          artist.add(2, "Adele");
          artist.add(3, "Billie Eilish");
          artist.add(4, "Adie Garcia");
          System.out.println(artist);
          
          LinkedList<String> playlist = new LinkedList<>();
          playlist.addAll(songs);
          playlist.addAll(artist);
          
          String udu1 = playlist.get(0);
          String udu2 = playlist.get(1);
          String udu3 = playlist.get(2);
          String udu4 = playlist.get(3);
          String udu5 = playlist.get(4);
          
          String pota1 = playlist.get(5);
          String pota2 = playlist.get(6);
          String pota3 = playlist.get(7);
          String pota4 = playlist.get(8);
          String pota5 = playlist.get(9);
                  
          System.out.println(udu1+" - "+pota1);
          System.out.println(udu2+" - "+pota2);
          System.out.println(udu3+" - "+pota3);
          System.out.println(udu4+" - "+pota4);
          System.out.println(udu5+" - "+pota5);
       
        
        
         
           
       
             }
}