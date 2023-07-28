package asd;

import java.util.*;

public class depth {

    private int V;

    private LinkedList<Integer> adj[];

    // Constructor
    public depth(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {

        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {

        boolean visited[] = new boolean[V];

        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        depth g = new depth(18);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 1);
        g.addEdge(2, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 2);
        g.addEdge(5, 3);
        g.addEdge(5, 7);
        g.addEdge(5, 9);
        g.addEdge(6, 7);
        g.addEdge(7, 6);
        g.addEdge(7, 11);
        g.addEdge(8, 9);
        g.addEdge(8, 11);
        g.addEdge(9, 5);
        g.addEdge(9, 8);
        g.addEdge(11, 7);
        g.addEdge(11, 10);
        System.out.println("Following is Depth First Traversal " + "(starting from vertex 1)");
        g.DFS(1);
    }
}
