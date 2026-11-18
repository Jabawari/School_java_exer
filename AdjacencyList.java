
package adjacencylist;
import java.util.ArrayList;
public class AdjacencyList {

    public static void main(String[] args) {
        ArrayList<ArrayList> Uwah = new ArrayList<>();
        char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int nummy = 7;
        for(int i = 0; i < nummy; i++){
            Uwah.add(new ArrayList<>());
        }
        Uwah.get(0).add('B');
        Uwah.get(1).add('A');
        Uwah.get(1).add('C');
        Uwah.get(2).add('B');
        Uwah.get(2).add('D');
        Uwah.get(2).add('E');
        Uwah.get(3).add('C');
        Uwah.get(3).add('E');
        Uwah.get(3).add('F');
        Uwah.get(3).add('G');
        Uwah.get(4).add('C');
        Uwah.get(4).add('D');
        Uwah.get(4).add('F');
        Uwah.get(5).add('D');
        Uwah.get(5).add('E');
        Uwah.get(6).add('D');
        
        int v = 0;
        for(int i =0; i<nummy; i++,v++){
            System.out.println(letter[v]+":"+Uwah.get(i));
        }

    }
    
}
