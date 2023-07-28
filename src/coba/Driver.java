package coba;

public class Driver {
    public static void main(String[] args) {
        BFS BFS = new BFS();
        DFS DFS = new DFS();

        for (int node = 1; node <= 11; node++){
            BFS.insert(new Node(node));
            DFS.insert(new Node(node));
        }

        int[][] adjMatriks = {
               //1  2  3  4  5  6  7  8  9  10 11
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0}, //1
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, //2
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //3
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, //4
                {0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0}, //5
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, //6
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1}, //7
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1}, //8
                {0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, //9
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //10
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0}, //11
        };

        System.out.println("Breadth First Search");
        BFS.bfs(adjMatriks, new Node(1));
        BFS.tampilBFS();

        System.out.print("\n");

        System.out.println("Depth First Search");
        DFS.dfs(adjMatriks, new Node(1));
        DFS.tampilDFS();

    }
}
