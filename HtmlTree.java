
package htmltree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
import javax.swing.JFrame;
import java.util.*;

public class HtmlTree {

    public static void main(String[] args) {
        JFrame window = new JFrame("Html Tree");
        window.setSize(500,500);
        
        DefaultMutableTreeNode html = new DefaultMutableTreeNode("html");
        DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");
        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
        DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("h1");
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");
        DefaultMutableTreeNode li = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode lii = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");
        
        html.add(head);
        html.add(body);
        
        head.add(meta);
        head.add(title);
        
        body.add(ul);
        body.add(h1);
        body.add(h2);
        
        ul.add(li);
        ul.add(lii);
        
        h2.add(a);
        
        JTree htmltree = new JTree(html);
        window.add(htmltree);
        window.setVisible(true);
        
        System.out.println("Root node: " + html.getRoot());
        
        html.getParent();
        head.getParent();
        body.getParent();
        ul.getParent();
        h2.getParent();
        System.out.println("Parent Nodes: "+html+", "+head+", "+body+", "+ul+", "+h2);
        
        List subtree1 = Collections.list(html.children());
        List subtree2 = Collections.list(head.children());
        List subtree3 = Collections.list(body.children());
        List subtree4 = Collections.list(ul.children());
        List subtree5 = Collections.list(h2.children());
        System.out.println("Siblings: "+subtree1+", "+subtree2+", "+subtree3+", "+subtree4);
        
        System.out.println("One-level subtrees: "+html+subtree1+", "+head+subtree2+", "+body+subtree3+", "+ul+subtree4+", "+h2+subtree5);
        
        System.out.println("Nodes per level: ");
        System.out.println("Level "+html.getLevel()+" - "+html);
        System.out.println("Level "+head.getLevel()+" - "+head+", "+body);
        System.out.println("Level "+meta.getLevel()+" - "+meta+", "+title+", "+ul+", "+h1+", "+h2);
        System.out.println("Level "+li.getLevel()+" - "+li+", "+lii+", "+a);

        System.out.println("Depth: "+html.getDepth());
        
        System.out.println("Degree of each one-level subtree: ");
        System.out.println("Subtree "+html+"- "+html.getChildCount());
        System.out.println("Subtree "+head+"- "+head.getChildCount());
        System.out.println("Subtree "+body+"- "+body.getChildCount());
        System.out.println("Subtree "+ul+"- "+ul.getChildCount());
        System.out.println("Subtree "+h2+"- "+h2.getChildCount());
        
        System.out.println("List of nodes based on: ");
        
        List Bread = Collections.list(html.breadthFirstEnumeration());
        System.out.println("Breadth-first - "+Bread);
        
        List Pre = Collections.list(html.preorderEnumeration());
        System.out.println("Preorder -      "+Pre);
        
        List Post = Collections.list(html.postorderEnumeration());
        System.out.println("Postorder -     "+Post);
                      
    }
    
}
