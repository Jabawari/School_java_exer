package jj.s.playlist;
import java.util.*;

public class JJSPLAYLIST {

    public static void main(String[] args) {
        
        LinkedList<String> songs = new LinkedList<>();
        LinkedList<String> artists = new LinkedList<>();
        LinkedList<String> playlist = new LinkedList<>();
        
        songs.add("Animals");
        songs.add("Circles");
        songs.add("Ruthless");
        songs.add("Demons");
        songs.add("Car's Outside");
        
        artists.add("Maroon 5");
        artists.add("Post Malone");
        artists.add("Marmar oso");
        artists.add("Imagine Dragons");
        artists.add("James Arthur");
        
        playlist.addAll(songs);
        playlist.addAll(artists);
        
        String song1 = playlist.get(0);
        String song2 = playlist.get(1);
        String song3 = playlist.get(2);
        String song4 = playlist.get(3);
        String song5 = playlist.get(4);
        
        String artst1 = playlist.get(5);
        String artst2 = playlist.get(6);
        String artst3 = playlist.get(7);
        String artst4 = playlist.get(8);
        String artst5 = playlist.get(9);
        
        System.out.println(songs);
        System.out.println(artists);
        System.out.println(song1+" - "+artst1);
        System.out.println(song2+" - "+artst2);
        System.out.println(song3+" - "+artst3);
        System.out.println(song4+" - "+artst4);
        System.out.println(song5+" - "+artst5);
    }
    
}
