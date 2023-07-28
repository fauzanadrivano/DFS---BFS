package coba;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    ArrayList<Node> listNode = new ArrayList<>();
    ArrayList<Node> urutanDFS = new ArrayList<>();

    public void insert(Node node) {
        listNode.add(node);
    }

    public void dfs(int[][] adjMatriks, Node root) {
        Stack<Node> stackNode = new Stack<>();
        stackNode.add(root);

        while(!stackNode.isEmpty()){
            Node node = stackNode.pop();

            if (!node.getKunjungi()) {
                urutanDFS.add(node);
                node.setKunjungi(true);
            }

            ArrayList<Node> listTetangga = getTetangga(adjMatriks, node);

            for (Node tetangga : listTetangga) {
                if (!tetangga.getKunjungi()) {
                    stackNode.add(tetangga);
                }
            }
        }
    }

    public ArrayList<Node> getTetangga (int[][] adjMatriks, Node node) {
        int index = -1;
        ArrayList<Node> listTetangga = new ArrayList<>();

        for (int i = 0; i < listNode.size(); i++) {
            if (listNode.get(i).getNode() == node.getNode()) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = 0; i < adjMatriks[index].length; i++) {
                if (adjMatriks[index][i] == 1) {
                    listTetangga.add(listNode.get(i));
                }
            }
        }

        return listTetangga;
    }

    public void tampilDFS () {
        for (Node node : urutanDFS) {
            System.out.print(node.getNode() + " ");
        }
    }
}
