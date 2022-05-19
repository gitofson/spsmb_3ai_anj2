package _22y._05m.graph_traverse;


import java.util.Set;
import java.util.TreeSet;

public class Graph {
    //hlavička, začátek seznamu
    private Node head;

    public Graph() {
        this.head = new Node(0);
    }

    public Node getHead() {
        return head;
    }
    Set<Node> visited = new TreeSet<>();
    void printGraphDFS(Node n)
    {
        visited.add(n);
        for (Node currentN:n.nextNodeList) {
            if(!visited.contains(currentN)) {
                System.out.print(currentN.data + " ");
                printGraphDFS(currentN);
            }
            System.out.println();
        }
    }

}
