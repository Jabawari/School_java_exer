
package fav_apps;
import java.util.*;
public class Fav_Apps {


    public static void main(String[] args) {
        
        LinkedList<String> apps = new LinkedList<>();
        apps.add("Mobile Legends");                        //N = Favorite Mobile Apps
        apps.add("Google");
        apps.add("Chrome");
        apps.add("TikTok");
         
        System.out.println("My Favorite Apps are:");
        System.out.println(apps.get(0));
        System.out.println(apps.get(1));
        System.out.println(apps.get(2));
        System.out.println(apps.get(3));
        
    }
    
}
